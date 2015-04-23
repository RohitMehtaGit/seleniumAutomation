package com.screens.locator;

public interface LoginScreen {

	/*TEXTBOX*/
	public static final String TEXTBOX_EMAIL="//input[@type='email']";
	public static final String TEXTBOX_PASSWORD="//input[@type='password']";
	
	
	/*BUTTON*/
	
	public static final String BUTTON_LOGIN="//button[@class='btn btn-primary login ng-binding']";
	
	/*TEXT TO VERIFY*/
	
	public static final String XPATH_LOGIN_TO_PLUMLYTICS="//*[contains(.,'Login To Your Plumlytics Account')]";
	public static final String XPATH_FORGOT_PASSWORD="//*[contains(.,'Forgot Password')]";
	public static final String XPATH_GET_STARTED="//*[contains(.,'Get Started')]";
	
}