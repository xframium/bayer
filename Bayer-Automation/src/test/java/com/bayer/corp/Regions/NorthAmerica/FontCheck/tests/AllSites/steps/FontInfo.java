package com.bayer.corp.Regions.NorthAmerica.FontCheck.tests.AllSites.steps;

public class FontInfo {
	
	private String Brand;
	//private String currentUrl;
	private Boolean googleConf;
	private Boolean adobeConf;
	private Boolean typographyConf;
	private Boolean myFontsConf;
	private Boolean typekitConf;
	private Boolean fontspringConf;
	private String comments;

	    public FontInfo(String Brand,boolean googleConf, boolean adobeConf, boolean typographyConf, boolean myFontsConf, boolean typekitConf,boolean fontspringConf, String comments) {
	        this.Brand = Brand;
	        this.googleConf = googleConf;
	        this.adobeConf = adobeConf;
	        this.typographyConf = typographyConf;
	        this.myFontsConf = myFontsConf;
	        this.typekitConf = typekitConf;
	        this.fontspringConf = fontspringConf;
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
		public boolean getTypographyConf(){ 
			return typographyConf;
		}
		public boolean getMyFontsConf(){ 
			return myFontsConf;
		}
		public boolean getTypekitConf(){ 
			return typekitConf;
		}
		public boolean getFontspringConf(){ 
			return fontspringConf;
		}
		public String getComments(){ 
			return comments;
		}
		
	}

