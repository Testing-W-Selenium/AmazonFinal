package com.deloitte.test.amazon.tests;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.deloitte.test.amazon.configuracion.Configuracion;
import com.deloitte.test.amazon.page.home.AmazonFooter;
import com.deloitte.test.amazon.page.home.AmazonHome;
import com.deloitte.test.amazon.page.home.AmazonMail;
import com.deloitte.test.amazon.page.home.AmazonSignIn;

import java.util.logging.Logger;
public class Test1Amazon {
	//static AmazonHome ama = new AmazonHome(null);
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main (String [] args) throws InterruptedException {	
		
		System.out.println("Starting testcase 1");
		Configuracion cnf = new Configuracion();
		WebDriver driver = cnf.getDriver();

		AmazonFooter amaFt = new AmazonFooter(driver);
		AmazonHome amaHome = new AmazonHome(driver);
		AmazonSignIn amaSign = new AmazonSignIn(driver);
		AmazonMail amaMail = new AmazonMail(driver);
		
		amaHome.clickSignIn();
		amaSign.inputEmail();
		amaSign.clickContinue();
		amaSign.inputPassword();
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
		
		
		
		
	}

}