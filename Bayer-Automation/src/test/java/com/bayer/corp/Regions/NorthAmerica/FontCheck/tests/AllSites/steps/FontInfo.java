package com.bayer.corp.Regions.NorthAmerica.FontCheck.tests.AllSites.steps;

public class FontInfo {
	
	private String Brand;
	//private String currentUrl;
	private Boolean googleConf;
	private Boolean adobeConf;
	private String comments;

	    public FontInfo(String Brand,boolean googleConf, boolean adobeConf, String comments) {
	        this.Brand = Brand;
	        this.googleConf = googleConf;
	        this.adobeConf = adobeConf;
	        this.comments = comments; 
	    }

		public String getBrand(){ 
			return Brand;
		}
		public boolean getGoogleConf(){ 
			return googleConf;
		}
		public boolean getAdobeConf(){ 
			return adobeConf;
		}
		public String getComments(){ 
			return comments;
		}
		
	}

