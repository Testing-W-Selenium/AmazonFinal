package com.deloitte.test.amazon.tests;
import org.openqa.selenium.JavascriptExecutor;
import com.deloitte.test.amazon.configuracion.Configuracion;
import com.deloitte.test.amazon.page.home.AmazonFooter;
import com.deloitte.test.amazon.page.home.AmazonHome;
import com.deloitte.test.amazon.page.home.AmazonSignIn;
import com.deloitte.test.amazon.page.home.AmazonSearchResult;

import java.util.logging.Level;
import java.util.logging.Logger;
public class Test1Amazon {
	//static AmazonHome ama = new AmazonHome(null);
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main (String [] args) throws InterruptedException {	
		
		LOGGER.log(Level.INFO, "Starting testcase 1");
		Configuracion cnf = new Configuracion();
		JavascriptExecutor js = cnf.getJs();

		AmazonFooter amaFt = new AmazonFooter(cnf.getDriver());
		AmazonHome amaHome = new AmazonHome(amaFt.getDriver());
		AmazonSignIn amaSign = new AmazonSignIn(amaFt.getDriver());

		amaHome.clickSignIn();
		amaSign.inputEmail();
		amaSign.clickContinue();
		amaSign.inputPassword();
		amaSign.clickSubmit();
		amaSign.clickContinue();
		Thread.sleep(15000);
		amaSign.clickLog();
		
		
	}

}