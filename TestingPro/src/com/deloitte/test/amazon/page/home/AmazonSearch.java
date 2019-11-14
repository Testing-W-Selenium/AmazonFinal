package com.deloitte.test.amazon.page.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
public class AmazonSearch {
	private WebDriver driver; 
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	private String xpathFilter =
			"//li[starts-with(@id,'p_')]//i[@class='a-icon a-icon-checkbox']";
	
	private String xpathProduct =
			"//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS "
			+ "widgetId=search-results index=\"indexElement\"']//img[@class='s-image']";
	
	private String xpathDescriptionOne =
			"//div[@id='productDescription_feature_div']//div[@id='productDescription_feature_div']";
	
	private String xpathDescriptionTwo = 
			"//div[@id='productDescription']";
	
	public AmazonSearch(WebDriver driver) {
		this.driver = driver;
	}
	public void clickFilterCheckBox(int noElement)
	{
		//pul rikoest
		List<WebElement> myElements = driver.findElements(By.xpath(xpathFilter));
        myElements.get(noElement).click();
        LOGGER.log(Level.INFO,myElements.get(noElement).getText()); 
	}
	public void clickElementResult(int indexElement) {
		driver.findElement(By.xpath(xpathProduct)).click();
	}
	public String  getDescription() {
		String texto = "";
		try { //no todos los articulos tienen el mismo id en el div de descripcion
			texto = driver.findElement(By.xpath(xpathDescriptionOne)).getText();
		} catch (Exception e) {
			texto = driver.findElement(By.xpath(xpathDescriptionTwo)).getText();
		}
		return texto;
	} 
}
