package com.deloitte.test.amazon.tests;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.deloitte.test.amazon.configuracion.Configuracion;
import com.deloitte.test.amazon.page.home.AmazonFooter;
import com.deloitte.test.amazon.page.home.AmazonHome;
import com.deloitte.test.amazon.page.home.AmazonSignIn;
import com.deloitte.test.amazon.page.home.AmazonSearchResult;

import java.util.logging.Level;
import java.util.logging.Logger;
public class Test1Amazon {
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main (String [] args) throws InterruptedException {	
		
		LOGGER.log(Level.INFO, "Starting testcase 1");
		Configuracion cnf = new Configuracion();
		//JavascriptExecutor js = cnf.getJs();
		WebDriver driver=cnf.getDriver();

		AmazonHome amaHome = new AmazonHome(driver);
		AmazonSearchResult amaSearch = new AmazonSearchResult(driver);
		AmazonSignIn amaSign = new AmazonSignIn(driver);
	
		//step 1: Click logIn button
		amaHome.clickSignIn();
		
		//step 2: Fill email field
		amaSign.inputEmail();
		
		//step 3: Click on continue
		amaSign.clickContinue();
		
		//step 4: Fill valid password for the email
		amaSign.inputPassword();
		
		//step 5: Click on submit
		amaSign.clickSubmit();
		
		//step 6: Click on accept OTP
		amaSign.clickContinue();
		
		//step 7: Wait for OTP code (manually)
		Thread.sleep(20000);
		
		//step 8: Click accept
		amaSign.clickLog(); 
		
		//step 9: Write "htc-vive" and click on search
		amaHome.findBar("htc-vive");
		
		//step 10: Filter results by brand "HTC" 
		amaSearch.clickBrandFilter(1);
		
		//step 11: Click fourth product 
		amaSearch.clickElement(4);
		
		//step 12: Get product description in console 
		LOGGER.log(Level.INFO, amaSearch.getDescription());
		LOGGER.log(Level.INFO, "Testcase 1 finished");
		
	}

}