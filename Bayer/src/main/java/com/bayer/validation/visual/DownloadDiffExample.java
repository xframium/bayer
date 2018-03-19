package com.bayer.validation.visual;

import com.bayer.validation.visual.ApplitoolsTestResultsHandler;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResults;
import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;


public class DownloadDiffExample {

    public static void main(String[] args) throws Exception {


        WebDriver driver = new ChromeDriver();
        Eyes eyes = new Eyes();

//         This is your api key, make sure you use it in all your tests.
        eyes.setApiKey(System.getenv("Applitools_ApiKey"));
        try {
            // Start visual testing with browser viewport set to 800x600.
            // Make sure to use the returned driver from this point on.
            eyes.open(driver, "Hello World!", "My first Selenium Java test! 123456789", new RectangleSize(800, 600));

            // Navigate the browser to the "hello world!" web-site.
            driver.get("https://applitools.com/helloworld");

            // Visual checkpoint #1.
            eyes.checkWindow("Hello!");

            // Click the "Click me!" button.
            driver.findElement(By.tagName("button")).click();

            // Visual checkpoint #2.
            eyes.checkWindow("Click!");

            // End visual testing. Validate visual correctness.
            TestResults testResult= eyes.close(false);


            //Link to batch result.
            System.out.println("This is the link for the Batch Result: "+testResult.getUrl());

            ApplitoolsTestResultsHandler testResultHandler = new ApplitoolsTestResultsHandler(testResult, System.getenv("Applitools_ViewKey"));

            List<BufferedImage>  base = testResultHandler.getBaselineBufferedImages();  // get Baseline Images as BufferedImage
            List<BufferedImage>  curr = testResultHandler.getCurrentBufferedImages();   // get Current Images as BufferedImage
            List<BufferedImage> diff = testResultHandler.getDiffsBufferedImages();      // get Diff Images as BufferedImage


            // Optional Setting this prefix will determine the structure of the repository for the downloaded images.
            testResultHandler.SetPathPrefixStructure("TestName/AppName/viewport/hostingOS/hostingApp");

            //Link to test/step result
//            System.out.println("This is the url to the first step " +testResultHandler.getLinkToStep(1));

//            testResultHandler.downloadImages(System.getenv("PathToDownloadImages"));                // Download both the Baseline and the Current images to the folder specified in Path.
//            testResultHandler.downloadBaselineImages(System.getenv("PathToDownloadImages"));      // Download only the Baseline images to the folder specified in Path.
//            testResultHandler.downloadCurrentImages(System.getenv("PathToDownloadImages"));       // Download only the Current images to the folder specified in Path.
//            testResultHandler.downloadDiffs(System.getenv("PathToDownloadImages"));                 // Download Diffs to the folder specified in Path.
//            testResultHandler.downloadAnimateGiff(System.getenv("PathToDownloadImages"));           // Download Animated GIf to the folder specified in Path.

//            Get Steps Names
//            String[] names = testResultHandler.getStepsNames();

//            Get the status of each step (Pass / Unresolved / New / Missing).
            ResultStatus[] results = testResultHandler.calculateStepResults();
            for (int i=0 ; i< results.length; i++){
                System.out.println("The result of step "+(i+1)+" is "+ results[i]);
            }


        }

        finally {
            // Abort Session in case of an unexpected error.
            eyes.abortIfNotClosed();
            driver.close();
        }
    }
}