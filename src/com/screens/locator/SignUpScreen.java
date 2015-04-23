package com.screens.locator;

public interface SignUpScreen {

	/*TEXTBOX*/
	public static final String TEXTBOX_FIRSTNAME="//input[@id='name' and @ng-model='user.first_name']";
	public static final String TEXTBOX_LASTNAME="//input[@id='name' and @ng-model='user.last_name']";
	public static final String TEXTBOX_EMAIL_ADDRESS="//input[@type='email' and @ng-model='user.email']";
	public static final String TEXTBOX_SIGNUP_PASSWORD="//input[@type='password' and @ng-model='user.password']";
	public static final String TEXTBOX_CONFIRM_SIGNUP_PASSWORD="//input[@type='password' and @ng-model='user.password_confirmation']";
	public static final String TEXTBOX_RESELLER_CODE="//input[@type='text' and @ng-model='user.promo_code']";
	public static final String TEXTBOX_COMPANY="//input[@type='text' and @ng-model='user.company']";
	
	public static final String TEXTBOX_BILLING_NAME="//input[@id='card-name' and @type='text']";
	public static final String TEXTBOX_BILLING_ADDRESS="//input[@id='card-address' and @type='text']";
	public static final String TEXTBOX_ZIP="//input[@id='card-postal' and @type='text']";
	public static final String TEXTBOX_CITY="//input[@id='card-city' and @type='text']";
	public static final String TEXTBOX_STATE="//input[@id='card-state' and @type='text']";
	public static final String TEXTBOX_COUNTRY="//input[@id='card-country' and @type='text']";
	public static final String TEXTBOX_CARD_NUMBER="//input[@id='card-number' and @type='text']";
	public static final String TEXTBOX_MONTH="//input[@ng-model='card.exp_month' and @type='text']";
	public static final String TEXTBOX_YEAR="//input[@ng-model='card.exp_year' and @type='text']";
	public static final String TEXTBOX_CVC="//input[@ng-model='card.cvc' and @type='text']";
	
	
	/*RADIO BUTTON*/
	
	public static final String RADIOBUTTON_SUBSCRIPTION_PLAN_STARTUP="//input[@type='radio' and @value='startup']";
	public static final String RADIOBUTTON_SUBSCRIPTION_PLAN_BUSINESS="//input[@type='radio' and @value='business']";
	public static final String RADIOBUTTON_SUBSCRIPTION_PLAN_GROWTH="//input[@type='radio' and @value='growth']";
	public static final String RADIOBUTTON_SUBSCRIPTION_PLAN_AGENCY="//input[@type='radio' and @value='agency']";
	
	/*BUTTON*/
	
	public static final String BUTTON_CONTINUE="//button[@type='submit']";
	public static final String BUTTON_START_FREE_TRIAL="//button[@class='button-action ng-binding' and @ng-click='handleStripe()']";
	
	
}