package com.plumlytics.utils;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import com.functional.suite.LogInTest;
import com.global.constants.GlobalConstants;
import com.screens.locator.LoginScreen;
import com.screens.locator.SignUpScreen;

public class GlobalMethods implements LoginScreen,SignUpScreen,GlobalConstants {

	public static WebDriver driver;
	static Logger log = Logger.getLogger(LogInTest.class.getName());

	public void readExcelData(TestData data) {
		ArrayList<String> browser = new ArrayList<String>();
		ArrayList<String> url = new ArrayList<String>();
		ArrayList<String> username = new ArrayList<String>();
		ArrayList<String> password = new ArrayList<String>();
		ArrayList<String> firstName = new ArrayList<String>();
		ArrayList<String> lastName = new ArrayList<String>();
		ArrayList<String> emailAddress = new ArrayList<String>();
		ArrayList<String> signUpPassword = new ArrayList<String>();
		ArrayList<String> confirmSignUpPassword = new ArrayList<String>();
		ArrayList<String> resellerCode = new ArrayList<String>();
		ArrayList<String> company = new ArrayList<String>();
		ArrayList<String> SubscriptionPlan = new ArrayList<String>();
		ArrayList<String> billingName = new ArrayList<String>();
		ArrayList<String> billingAddress = new ArrayList<String>();
		ArrayList<String> zip = new ArrayList<String>();
		ArrayList<String> city = new ArrayList<String>();
		ArrayList<String> state = new ArrayList<String>();
		ArrayList<String> country = new ArrayList<String>();
		ArrayList<String> cardNumber = new ArrayList<String>();
		ArrayList<String> month = new ArrayList<String>();
		ArrayList<String> year = new ArrayList<String>();
		ArrayList<String> cvc = new ArrayList<String>();
		

		// Get the data from excel file
		for (int rowCnt = 1; rowCnt < ExcelSheetDriver.RowCount(); rowCnt++) {
			browser.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("Browser"), rowCnt));
			url.add(ExcelSheetDriver.ReadCell(ExcelSheetDriver.GetCell("Url"),
					rowCnt));
			username.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("Username"), rowCnt));
			password.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("Password"), rowCnt));
			firstName.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("firstName"), rowCnt));
			lastName.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("lastName"), rowCnt));
			emailAddress.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("emailAddress"), rowCnt));
			signUpPassword.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("signUpPassword"), rowCnt));
			confirmSignUpPassword.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("confirmSignUpPassword"), rowCnt));
			resellerCode.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("resellerCode"), rowCnt));
			company.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("company"), rowCnt));
			SubscriptionPlan.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("SubscriptionPlan"), rowCnt));
			billingName.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("billingName"), rowCnt));
			billingAddress.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("billingAddress"), rowCnt));
			zip.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("zip"), rowCnt));
			city.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("city"), rowCnt));
			state.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("state"), rowCnt));
			country.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("country"), rowCnt));
			cardNumber.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("cardNumber"), rowCnt));
			month.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("month"), rowCnt));
			year.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("year"), rowCnt));
			cvc.add(ExcelSheetDriver.ReadCell(
					ExcelSheetDriver.GetCell("cvc"), rowCnt));
			

		}
		data.setBrowser(browser);
		data.setUrl(url);
		data.setLoginUser(username);
		data.setPassword(password);
		data.setFirstName(firstName);
		data.setLastName(lastName);
		data.setEmailAddress(emailAddress);
		data.setSignUpPassword(signUpPassword);
		data.setConfirmPassword(confirmSignUpPassword);
		data.setResellerCode(resellerCode);
		data.setCompany(company);
		data.setSubscriptionPlan(SubscriptionPlan);
		data.setBillingName(billingName);
		data.setBillingAddress(billingAddress);
		data.setZip(zip);
		data.setCity(city);
		data.setState(state);
		data.setCountry(country);
		data.setCardNumber(cardNumber);
		data.setMonth(month);
		data.setYear(year);
		data.setCvc(cvc);
		
	}

	public void getTestingBrowser(String browser) {

		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:/software backup/JARS/chromedriver.exe");
				driver = new ChromeDriver();
			}

			if (browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}

			if (browser.equalsIgnoreCase("InternetExplorer")) {
				driver = new InternetExplorerDriver();
			}
		} catch (Exception e) {
			log.info("Browser not found");

		}

	}
     public void getFirstName(String firstName){
	
    	 driver.findElement(By.xpath(TEXTBOX_FIRSTNAME)).sendKeys(firstName);
     }
	public void getLoginUrl(String url) {

		driver.get(url);
	}

	public void logIn(String username, String password) {
		driver.findElement(By.xpath(XPATH_LOGIN_TO_PLUMLYTICS));
		driver.findElement(By.xpath(XPATH_FORGOT_PASSWORD));
		driver.findElement(By.xpath(XPATH_GET_STARTED));
		driver.findElement(By.xpath(TEXTBOX_EMAIL)).sendKeys(username);
		log.info("Email Address Entered.");
		driver.findElement(By.xpath(TEXTBOX_PASSWORD)).sendKeys(password);
		log.info("Password Entered.");
		driver.findElement(By.xpath(BUTTON_LOGIN)).click();
		log.info("Logging into plumlytics.");
		driver.close();
	}
	
	
public void signUp(String firstName,String lastName,String emailId,String password,String confirmPassword,String resellerCode,String company,String subscriptionPlan,String billingName,String billingAddress,String zip,String city,String state,String country,String cardNumber,String month,String year,String cvc) throws InterruptedException  {
		
		driver.findElement(By.xpath(TEXTBOX_FIRSTNAME)).sendKeys(firstName);
		driver.findElement(By.xpath(TEXTBOX_LASTNAME)).sendKeys(lastName);
		driver.findElement(By.xpath(TEXTBOX_EMAIL_ADDRESS)).sendKeys(RandomStringUtils.randomAlphabetic(5)+"@gmail.com");
		driver.findElement(By.xpath(TEXTBOX_SIGNUP_PASSWORD)).sendKeys(password);
		driver.findElement(By.xpath(TEXTBOX_CONFIRM_SIGNUP_PASSWORD)).sendKeys(confirmPassword);
		Thread.sleep(WAIT_MINIMUM);
		driver.findElement(By.xpath(TEXTBOX_RESELLER_CODE)).sendKeys(resellerCode);
		Thread.sleep(WAIT_MAXIMUM);
		driver.findElement(By.xpath(TEXTBOX_COMPANY)).sendKeys(company);
		Thread.sleep(WAIT_MAXIMUM);
		driver.findElement(By.xpath(BUTTON_CONTINUE )).click();
		Thread.sleep(WAIT_MAXIMUM);
		driver.findElement(By.xpath(TEXTBOX_BILLING_NAME)).sendKeys(billingName);
		driver.findElement(By.xpath(TEXTBOX_BILLING_ADDRESS)).sendKeys(billingAddress);
		driver.findElement(By.xpath(TEXTBOX_ZIP)).sendKeys(zip);
		driver.findElement(By.xpath(TEXTBOX_CITY)).sendKeys(city);
		driver.findElement(By.xpath(TEXTBOX_STATE)).sendKeys(state);
		driver.findElement(By.xpath(TEXTBOX_COUNTRY)).sendKeys(country);
		driver.findElement(By.xpath(TEXTBOX_CARD_NUMBER)).sendKeys(cardNumber);
		driver.findElement(By.xpath(TEXTBOX_MONTH)).sendKeys(month);
		Thread.sleep(WAIT_MAXIMUM);
		driver.findElement(By.xpath(TEXTBOX_YEAR)).sendKeys(year);
		Thread.sleep(WAIT_MAXIMUM);
		driver.findElement(By.xpath(TEXTBOX_CVC)).sendKeys(cvc);
		Thread.sleep(WAIT_MAXIMUM);
		driver.findElement(By.xpath(BUTTON_START_FREE_TRIAL)).click();
		Thread.sleep(WAIT_MAXIMUM);
		
	}
	
}
