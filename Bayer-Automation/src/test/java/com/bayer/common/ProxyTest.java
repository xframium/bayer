package com.bayer.common;

import java.net.URL;



public class ProxyTest 
{
	public static void main(String[] args) throws Exception
	{
		URL xUrl = new URL( "https://bayer.perfectomobile.com/nexperience" );
		
		System.setProperty( "https.proxyHost", "10.82.4.10" );
		System.setProperty( "http.proxyHost", "10.82.4.10" );
		System.setProperty( "https.proxyPort", "8080" );
		System.setProperty( "http.proxyPort", "8080" );
		System.setProperty( "javax.net.ssl.trustStore", "C:\\Program Files (x86)\\Java\\jre1.8.0_152\\lib\\security\\cacerts - Copy" );
		xUrl.openStream();
		
	}
}
