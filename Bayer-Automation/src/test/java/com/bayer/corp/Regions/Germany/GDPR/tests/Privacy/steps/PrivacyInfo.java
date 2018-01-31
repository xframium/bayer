package com.bayer.corp.Regions.Germany.GDPR.tests.Privacy.steps;

public class PrivacyInfo {
	    private boolean privacyFound; 
	    private String privacyName; 
	    private boolean phrase1; 
	    private boolean phrase2; 
	    private boolean phrase3; 
	    private boolean phrase4;
	    private boolean phrase5;
	    private String cookie;

	    public PrivacyInfo(boolean privacyFound, String privacyName,boolean phrase1, boolean phrase2, boolean phrase3, boolean phrase4, boolean phrase5, String cookie) {
	        this.privacyFound = privacyFound;
	        this.privacyName = privacyName;
	        this.phrase1 = phrase1;
	        this.phrase2 = phrase2;
	        this.phrase3 = phrase3; 
	        this.phrase4 = phrase4;
	        this.phrase5 = phrase5;
	        this.cookie = cookie;
	    }

		public boolean getPrivacyFound(){ 
			return privacyFound;
		}
		public String getPrivacyName(){ 
			return privacyName;
		}
		public boolean getPhrase1(){ 
			return phrase1;
		}
		public boolean getPhrase2(){ 
			return phrase2;
		}
		public boolean getPhrase3(){ 
			return phrase3;
		}
		public boolean getPhrase4(){ 
			return phrase4;
		}
		public boolean getPhrase5(){ 
			return phrase5;
		}
		public String getCookiePhrase(){ 
			return cookie;
		}
	}

