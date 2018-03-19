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
	
	public static Map<String, RadiologyScreen> getProductScreens() {
		Map<String, RadiologyScreen> productScreens = new HashMap<String, RadiologyScreen>();
		
		RadiologyScreen baseScreen = new RadiologyScreen("radiology-products", "Radiology Products", "radiology.products",
				"https://www.radiologysolutions.bayer.com/products/");
		productScreens.put(baseScreen.getScreenName(), baseScreen);
		
		RadiologyScreen ctScreen = new RadiologyScreen("radiology-products-ct", "Radiology CT Products", "radiology.product.ct",
				"https://www.radiologysolutions.bayer.com/products/ct/");
		productScreens.put(ctScreen.getScreenName(), ctScreen);
		
		RadiologyScreen powerinjection = new RadiologyScreen("radiology-products-ct-powerinjection", "Radiology CT Product Power Injection", "radiology.product.ct.injection.powerinjection",
				"https://www.radiologysolutions.bayer.com/products/ct/injection/powerinjection/");
		productScreens.put(powerinjection.getScreenName(), powerinjection);
		
		RadiologyScreen stellant = new RadiologyScreen("radiology-products-ct-stellant", "Radiology CT Product Stellant", "radiology.product.ct.injection.stellant",
				"https://www.radiologysolutions.bayer.com/products/ct/injection/stellant/");
		productScreens.put(stellant.getScreenName(), stellant);
		
		RadiologyScreen education = new RadiologyScreen("radiology-products-ct-dosemanagement-education", "Radiology CT Dose Management Education", "radiology.product.ct.dosemanagement.education",
				"https://www.radiologysolutions.bayer.com/products/ct/dosemanagement/education/");
		productScreens.put(education.getScreenName(), education);
		
		RadiologyScreen certegraisi = new RadiologyScreen("radiology-products-ct-dosemanagement-certegraisi", "Radiology CT Dose Management Certegraisi", "radiology.product.ct.dosemanagement.certegraisi",
				"https://www.radiologysolutions.bayer.com/products/ct/dosemanagement/certegraisi/");
		productScreens.put(certegraisi.getScreenName(), certegraisi);
		
		RadiologyScreen certegrap3t = new RadiologyScreen("radiology-products-ct-dosemanagement-certegrap3t", "Radiology CT Dose Management Certegrap3t", "radiology.product.ct.dosemanagement.certegrap3t",
				"https://www.radiologysolutions.bayer.com/products/ct/dosemanagement/certegrap3t/");
		productScreens.put(certegrap3t.getScreenName(), certegrap3t);
		
		RadiologyScreen rep = new RadiologyScreen("radiology-products-ct-dosemanagement-rep", "Radiology CT Dose Management Radimetrics", "radiology.product.ct.dosemanagement.rep",
				"https://www.radiologysolutions.bayer.com/products/ct/dosemanagement/rep/");
		productScreens.put(rep.getScreenName(), rep);
		
		RadiologyScreen ultravist = new RadiologyScreen("radiology-products-ct-contrast-ultravist", "Radiology CT Contrast Ultravist", "radiology.product.ct.contrast.ultravist",
				"https://www.radiologysolutions.bayer.com/products/ct/contrast/ultravist/");
		productScreens.put(ultravist.getScreenName(), ultravist);
		
		RadiologyScreen mr = new RadiologyScreen("radiology-product-mr", "Radiology Magnetic Resonance", "radiology.product.mr",
				"https://www.radiologysolutions.bayer.com/products/mr/");
		productScreens.put(mr.getScreenName(), mr);
		
		RadiologyScreen contrast = new RadiologyScreen("radiology-product-mr-contrast", "Radiology Magnetic Resonance Contrast", "radiology.product.mr.contrast",
				"https://www.radiologysolutions.bayer.com/products/mr/contrast/");
		productScreens.put(contrast.getScreenName(), contrast);
		
		RadiologyScreen injection = new RadiologyScreen("radiology-product-mr-injection", "Radiology Magnetic Resonance Injection", "radiology.product.mr.injection",
				"https://www.radiologysolutions.bayer.com/products/mr/injection/");
		productScreens.put(injection.getScreenName(), injection);
		
		RadiologyScreen spectris = new RadiologyScreen("radiology-product-mr-spectris", "Radiology Magnetic Resonance Spectris", "radiology.product.mr.injection.spectris",
				"https://www.radiologysolutions.bayer.com/products/mr/injection/spectris/");
		productScreens.put(spectris.getScreenName(), spectris);
		
		RadiologyScreen mrxperion = new RadiologyScreen("radiology-product-mr-mrxperion", "Radiology Magnetic Resonance MRXperion", "radiology.product.mr.injection.mrxperion",
				"https://www.radiologysolutions.bayer.com/products/mr/injection/mrxperion/");
		productScreens.put(mrxperion.getScreenName(), mrxperion);
		
		RadiologyScreen mraccessories = new RadiologyScreen("radiology-product-mr-mraccessories", "Radiology Magnetic Resonance MR Accessories", "radiology.product.mr.mraccessories",
				"https://www.radiologysolutions.bayer.com/products/mr/mraccessories/");
		productScreens.put(mraccessories.getScreenName(), mraccessories);
		
		RadiologyScreen continuum = new RadiologyScreen("radiology-product-mr-continuum", "Radiology Magnetic Resonance MR Accessories Continuum", "radiology.product.mr.mraccessories.continuum",
				"https://www.radiologysolutions.bayer.com/products/mr/mraccessories/continuum/");
		productScreens.put(continuum.getScreenName(), continuum);
		
		RadiologyScreen veris = new RadiologyScreen("radiology-product-mr-veris", "Radiology Magnetic Resonance MR Accessories Veris", "radiology.product.mr.mraccessories.veris",
				"https://www.radiologysolutions.bayer.com/products/mr/mraccessories/veris/");
		productScreens.put(veris.getScreenName(), veris);
		
		RadiologyScreen ecoils = new RadiologyScreen("radiology-product-mr-ecoils", "Radiology Magnetic Resonance MR Accessories Ecoils", "radiology.product.mr.mraccessories.ecoils",
				"https://www.radiologysolutions.bayer.com/products/mr/mraccessories/ecoils/");
		productScreens.put(ecoils.getScreenName(), ecoils);
		
		RadiologyScreen certo = new RadiologyScreen("radiology-product-mr-certo", "Radiology Magnetic Resonance MR Accessories Certo", "radiology.product.mr.mraccessories.certo",
				"https://www.radiologysolutions.bayer.com/products/mr/mraccessories/certo/");
		productScreens.put(certo.getScreenName(), certo);
		
		RadiologyScreen angiography = new RadiologyScreen("radiology-product-angiography", "Radiology Angiography", "radiology.product.angiography",
				"https://www.radiologysolutions.bayer.com/products/angiography/");
		productScreens.put(angiography.getScreenName(), angiography);
		
		RadiologyScreen ainjection = new RadiologyScreen("radiology-product-angiography-injection", "Radiology Angiography Injection", "radiology.product.angiography.injection",
				"https://www.radiologysolutions.bayer.com/products/angiography/injection/");
		productScreens.put(ainjection.getScreenName(), ainjection);
		
		RadiologyScreen mark7arterion = new RadiologyScreen("radiology-product-angiography-mark7arterion", "Radiology Angiography Injection Mark7arterion", "radiology.product.angiography.injection.mark7arterion",
				"https://www.radiologysolutions.bayer.com/products/angiography/injection/mark7arterion/");
		productScreens.put(mark7arterion.getScreenName(), mark7arterion);
		
		RadiologyScreen avanta = new RadiologyScreen("radiology-product-angiography-avanta", "Radiology Angiography Injection Avanta", "radiology.product.angiography.injection.avanta",
				"https://www.radiologysolutions.bayer.com/products/angiography/injection/avanta/");
		productScreens.put(avanta.getScreenName(), avanta);
		
		RadiologyScreen provis = new RadiologyScreen("radiology-product-angiography-provis", "Radiology Angiography Injection Provis", "radiology.product.angiography.injection.provis",
				"https://www.radiologysolutions.bayer.com/products/angiography/injection/provis/");
		productScreens.put(provis.getScreenName(), provis);
		
		RadiologyScreen molecularimaging = new RadiologyScreen("radiology-product-molecularimaging", "Radiology Molecular Imaging", "radiology.product.molecularimaging",
				"https://www.radiologysolutions.bayer.com/products/molecularimaging/");
		productScreens.put(molecularimaging.getScreenName(), molecularimaging);
		
		RadiologyScreen intego = new RadiologyScreen("radiology-product-molecularimaging-intego", "Radiology Molecular Imaging Intego", "radiology.product.molecularimaging.intego",
				"https://www.radiologysolutions.bayer.com/products/molecularimaging/intego/");
		productScreens.put(intego.getScreenName(), intego);
		
		RadiologyScreen syringesdisposables = new RadiologyScreen("radiology-product-syringesdisposables", "Radiology Syringes & Disposables", "radiology.product.syringesdisposables",
				"https://www.radiologysolutions.bayer.com/products/syringesdisposables/");
		productScreens.put(syringesdisposables.getScreenName(), syringesdisposables);
		
		RadiologyScreen dosemanagement = new RadiologyScreen("radiology-product-dosemanagement", "Radiology Dose Management & Analytics", "radiology.product.ct.dosemanagement",
				"https://www.radiologysolutions.bayer.com/products/ct/dosemanagement/");
		productScreens.put(dosemanagement.getScreenName(), dosemanagement);
		
		RadiologyScreen rep1 = new RadiologyScreen("radiology-product-dosemanagement-rep1", "Radiology Dose Management & Analytics Rep", "radiology.product.ct.dosemanagement.rep1",
				"https://www.radiologysolutions.bayer.com/products/ct/dosemanagement/rep/");
		productScreens.put(rep1.getScreenName(), rep1);
		
		RadiologyScreen certegrap3t1 = new RadiologyScreen("radiology-product-dosemanagement-certegrap3t1", "Radiology Dose Management & Analytics Certegra P3T", "radiology.product.ct.dosemanagement.certegrap3t1",
				"https://www.radiologysolutions.bayer.com/products/ct/dosemanagement/certegrap3t/");
		productScreens.put(certegrap3t1.getScreenName(), certegrap3t1);
		
		RadiologyScreen certegraisi1 = new RadiologyScreen("radiology-product-dosemanagement-certegraisi1", "Radiology Dose Management & Analytics Certegra ISI", "radiology.product.ct.dosemanagement.certegraisi1",
				"https://www.radiologysolutions.bayer.com/products/ct/dosemanagement/certegraisi/");
		productScreens.put(certegraisi1.getScreenName(), certegraisi1);
		
		RadiologyScreen education1 = new RadiologyScreen("radiology-product-dosemanagement-education1", "Radiology Dose Management & Analytics Eucation", "radiology.product.ct.dosemanagement.education1",
				"https://www.radiologysolutions.bayer.com/products/ct/dosemanagement/education/");
		productScreens.put(education1.getScreenName(), education1);

		

		return productScreens;
	}
}
