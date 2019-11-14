package com.deloitte.test.amazon.tests;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.deloitte.test.amazon.configuracion.Configuracion;
import com.deloitte.test.amazon.page.home.AmazonFooter;
import com.deloitte.test.amazon.page.home.AmazonHome;
import com.deloitte.test.amazon.page.home.AmazonMail;
import com.deloitte.test.amazon.page.home.AmazonSignIn;
import com.deloitte.test.amazon.page.home.AmazonSearchResult;

import java.util.logging.Level;
import java.util.logging.Logger;
public class Test1Amazon {
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main (String [] args) throws InterruptedException {	
		
		LOGGER.log(Level.INFO, "Starting testcase 1");
		Configuracion cnf = new Configuracion();
		WebDriver driver = cnf.getDriver();

		AmazonFooter amaFt = new AmazonFooter(driver);
		AmazonHome amaHome = new AmazonHome(driver);
		AmazonSignIn amaSign = new AmazonSignIn(driver);
		AmazonMail amaMail = new AmazonMail(driver);
		
		amaHome.clickSignIn();
		
		//step 2: Fill email field
		amaSign.inputEmail();
		
		//step 3: Click on continue
		amaSign.clickContinue();
		
		//step 4: Fill valid password for the email
		amaSign.inputPassword();
		
		//step 5: Click on submit
		amaSign.clickSubmit();
		amaSign.clickContinue2();
		
		Thread.sleep(5000);
		//amaSign.clickLog();
		
		amaMail.openMailHost();
		amaMail.setEmail();
		amaMail.clickContinue();
		amaMail.setPassword();
		amaMail.clickLogIn();
//		amaMail.clickRefresh();
		amaMail.clickRecentEmail();
		String code = amaMail.getCode();
		amaMail.changeTab();
		amaSign.setOtp(code);
		amaSign.clickLastFinish();
		amaHome.findBar("htc-vive");
		amaSearch.clickBrandFilter(1);
		amaSearch.clickElement(4);
		LOGGER.log(Level.INFO, amaSearch.getDescription());
		LOGGER.log(Level.INFO, "Testcase 1 finished");
		
	}

}