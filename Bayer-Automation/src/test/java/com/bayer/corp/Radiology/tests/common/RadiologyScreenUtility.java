package com.bayer.corp.Radiology.tests.common;

import java.util.HashMap;
import java.util.Map;

public class RadiologyScreenUtility {

	public static Map<String, RadiologyScreen> getServiceScreens() {
		Map<String, RadiologyScreen> screens = new HashMap<String, RadiologyScreen>();
		
		RadiologyScreen baseScreen = new RadiologyScreen("radiology-service", "Radiology Service", "radiology.service",
				"https://www.radiologysolutions.bayer.com/service/");
		screens.put(baseScreen.getScreenName(), baseScreen);

		RadiologyScreen virtualcare = new RadiologyScreen("radiology-virtualcare", "Radiology VirtualCare", "radiology.virtualcare",
				"https://www.radiologysolutions.bayer.com/service/virtualcare/");
		screens.put(virtualcare.getScreenName(), virtualcare);

		RadiologyScreen directcare = new RadiologyScreen("radiology-directcare", "Radiology DirectCare", "radiology.directcare",
				"https://www.radiologysolutions.bayer.com/service/directcare/");
		screens.put(directcare.getScreenName(), directcare);

		RadiologyScreen partnercare = new RadiologyScreen("radiology-partnercare", "Radiology PartnerCare", "radiology.partnercare",
				"https://www.radiologysolutions.bayer.com/service/partnercare/");
		screens.put(partnercare.getScreenName(), partnercare);

		RadiologyScreen selectcare =  new RadiologyScreen("radiology-selectcare", "Radiology SelectCare", "radiology.selectcare",
				"https://www.radiologysolutions.bayer.com/service/selectcare/");
		screens.put(selectcare.getScreenName(), selectcare);

		RadiologyScreen advisory = new RadiologyScreen("radiology-advisory", "Radiology IT Advisory", "radiology.advisory",
				"https://www.radiologysolutions.bayer.com/service/information-technology-advisory/");
		screens.put(advisory.getScreenName(), advisory);

		return screens;
	}
	
	public static Map<String, RadiologyScreen> getLearningCenterScreens() {
		Map<String, RadiologyScreen> learningScreens = new HashMap<String, RadiologyScreen>();
		
		RadiologyScreen baseScreen = new RadiologyScreen("radiology-learning-center", "Radiology Learnin Center", "radiology.learning.center",
				"https://www.radiologysolutions.bayer.com/learning-center/");
		learningScreens.put(baseScreen.getScreenName(), baseScreen);

		RadiologyScreen imageLibrary = new RadiologyScreen("radiology-image-library", "Radiology Image Library", "radiology.image.library",
				"https://www.radiologysolutions.bayer.com/learning-center/image-library/");
		learningScreens.put(imageLibrary.getScreenName(), imageLibrary);

		RadiologyScreen videolibrary = new RadiologyScreen("radiology-video-library", "Radiology Video Library", "radiology.video.library",
				"https://www.radiologysolutions.bayer.com/learning-center/video-library/");
		learningScreens.put(videolibrary.getScreenName(), videolibrary);

		RadiologyScreen revideolibrary = new RadiologyScreen("radiology-rep-video-library", "Radiology Rep Video Library", "radiology.rep.video.library",
				"https://www.radiologysolutions.bayer.com/learning-center/video-library/rep-video-library/");
		learningScreens.put(revideolibrary.getScreenName(), revideolibrary);

		RadiologyScreen medradIntego =  new RadiologyScreen("radiology-medrad-intego", "Radiology Medrad Intego", "radiology.medrad.intego",
				"https://www.radiologysolutions.bayer.com/learning-center/video-library/medrad-intego-pet-infusion-system/");
		learningScreens.put(medradIntego.getScreenName(), medradIntego);

		RadiologyScreen stellantvideo = new RadiologyScreen("radiology-stellant-video", "Radiology Stellant Video Library", "radiology.stellant.video",
				"https://www.radiologysolutions.bayer.com/learning-center/video-library/stellant-video-library/");
		learningScreens.put(stellantvideo.getScreenName(), stellantvideo);
		
		RadiologyScreen medradmarkv = new RadiologyScreen("radiology-medrad-mark-v-provis", "Radiology Medra Mark V Provis", "radiology.medrad.mark.v.provis",
				"https://www.radiologysolutions.bayer.com/learning-center/video-library/medrad-mark-v-provis-video-library/");
		learningScreens.put(medradmarkv.getScreenName(), medradmarkv);
		
		RadiologyScreen medradmark7 = new RadiologyScreen("radiology-medrad-mark-7-arterion", "Radiology Medra Mark 7 Arterion", "radiology.medrad.mark.7.arterion",
				"https://www.radiologysolutions.bayer.com/learning-center/video-library/mark7arterion-video-library/");
		learningScreens.put(medradmark7.getScreenName(), medradmark7);
		
		RadiologyScreen docLibrary = new RadiologyScreen("radiology-documents-library", "Radiology Documents Library", "radiology.documents.library",
				"https://www.radiologysolutions.bayer.com/learning-center/documents-library/");
		learningScreens.put(docLibrary.getScreenName(), docLibrary);
		
		RadiologyScreen computed = new RadiologyScreen("radiology-documents-library-computed", "Radiology Computed Tomography", "radiology.documents.library.computed",
				"https://www.radiologysolutions.bayer.com/learning-center/documents-library/?accordianSection=Computed");
		learningScreens.put(computed.getScreenName(), computed);
		
		RadiologyScreen magnetic = new RadiologyScreen("radiology-documents-library-magnetic", "Radiology Magnetic Resonance", "radiology.documents.library.magnetic",
				"https://www.radiologysolutions.bayer.com/learning-center/documents-library/?accordianSection=Magnetic");
		learningScreens.put(magnetic.getScreenName(), magnetic);
		
		RadiologyScreen angiography = new RadiologyScreen("radiology-documents-library-angiography", "Radiology Angiography", "radiology.documents.library.angiography",
				"https://www.radiologysolutions.bayer.com/learning-center/documents-library/?accordianSection=Angiography");
		learningScreens.put(angiography.getScreenName(), angiography);
		
		RadiologyScreen molecular = new RadiologyScreen("radiology-documents-library-molecular", "Radiology Molecular", "radiology.documents.library.molecular",
				"https://www.radiologysolutions.bayer.com/learning-center/documents-library/?accordianSection=Molecular");
		learningScreens.put(molecular.getScreenName(), molecular);
		
		RadiologyScreen dose = new RadiologyScreen("radiology-documents-library-dose", "Radiology Dose Managment", "radiology.documents.library.dose",
				"https://www.radiologysolutions.bayer.com/learning-center/documents-library/?accordianSection=Dose");
		learningScreens.put(dose.getScreenName(), dose);
		
		RadiologyScreen service = new RadiologyScreen("radiology-documents-library-service", "Radiology Service", "radiology.documents.library.service",
				"https://www.radiologysolutions.bayer.com/learning-center/documents-library/?accordianSection=Service");
		learningScreens.put(service.getScreenName(), service);
		
		RadiologyScreen syringes = new RadiologyScreen("radiology-documents-library-syringes", "Radiology Syringes", "radiology.documents.library.syringes",
				"https://www.radiologysolutions.bayer.com/learning-center/documents-library/?accordianSection=Syringes");
		learningScreens.put(syringes.getScreenName(), syringes);
		
		RadiologyScreen learningCourse = new RadiologyScreen("radiology-learning-courses", "Radiology Learning Courses", "radiology.learning.courses",
				"https://www.radiologysolutions.bayer.com/learning-center/learning-courses/");
		learningScreens.put(learningCourse.getScreenName(), learningCourse);
		
		//TODO

		return learningScreens;
	}
}
