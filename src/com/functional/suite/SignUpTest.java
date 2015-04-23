package com.functional.suite;

import java.io.IOException;
import java.net.URL;

import jxl.read.biff.BiffException;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.global.constants.GlobalConstants;
import com.plumlytics.utils.ExcelSheetDriver;
import com.plumlytics.utils.GlobalMethods;
import com.plumlytics.utils.TestData;

public class SignUpTest implements GlobalConstants {

	static WebDriver driver = null;
	ExcelSheetDriver excelReaderObject;
	static GlobalMethods globalMethodObject = new GlobalMethods();
	static TestData testDataObject = new TestData();

	@BeforeClass
	public static void Setup() {
		// loading log4j.xml file
		DOMConfigurator.configure("log4j.xml");
	}

	public void configLogger() {
		URL u = getClass().getClassLoader().getResource(
				"D:/juno workspace/plumlytics/src/log4j.xml");
		DOMConfigurator.configure(u);
	}

	@Test
	public void SignUpTest() {

		ExcelSheetDriver excelReaderObj;

		try {
			excelReaderObj = new ExcelSheetDriver(
					EXCEL_PATH,
					SHEET_NAME_SIGNUP);
		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Load the Excel Sheet Col in to Dictionary for use in test cases
		ExcelSheetDriver.ColumnDictionary();

		// Get the data from excel file
		globalMethodObject.readExcelData(testDataObject);
		globalMethodObject
				.getTestingBrowser(testDataObject.getBrowser().get(0));
		globalMethodObject.getLoginUrl(testDataObject.getUrl().get(0));

		try {

			globalMethodObject.signUp(testDataObject.getFirstName().get(0),
					testDataObject.getLastName().get(0), testDataObject
							.getEmailAddress().get(0), testDataObject
							.getPassword().get(0), testDataObject
							.getConfirmPassword().get(0), testDataObject
							.getResellerCode().get(0), testDataObject
							.getCompany().get(0), testDataObject
							.getBillingName().get(0), testDataObject
							.getBillingAddress().get(0), testDataObject
							.getZip().get(0), testDataObject.getCity().get(0),
					testDataObject.getState().get(0), testDataObject
							.getCountry().get(0), testDataObject
							.getCardNumber().get(0), testDataObject.getMonth()
							.get(0), testDataObject.getYear().get(0),
					testDataObject.getCvc().get(0), "subscription");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
