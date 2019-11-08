package com.deloitte.test.amazon.page.home;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AmazonSearchResult {
	private WebDriver driver; 
	public AmazonSearchResult(WebDriver driver) {
		this.driver = driver;
	}
	public void clickWebElement(int noElement){
		List<WebElement> myElements = driver.findElements(By.xpath("//a[@class='nav_a']"));
		System.out.println(myElements.get(noElement).getText());
        myElements.get(noElement).click();
	}
	
	public void clickElement(WebDriver driver, int indexElement) {
		driver.findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index="+indexElement+"']//img[@class='s-image']")).click();
	}
	public void clickBrandFilter(WebDriver driver,int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_89')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public void clickPriceFilter(WebDriver driver,int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_36')]["+indexElement+"]//a[@class='a-link-normal s-navigation-item']")).click();
	}
	public void clickDisplaySizeFilter(WebDriver driver,int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_size_browse-bin')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public void clickTechnologyFilter(WebDriver driver,int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_feature_nineteen_browse-bin')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public void clickConnectivityTypeSizeFilter(WebDriver driver,int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_feature_four_browse-bin')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public void clickSOFilter(WebDriver driver,int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_operating_system_browse-bin')]["+indexElement+"]//a[@class='a-link-normal s-navigation-item']")).click();
	}
	public void clickFlashMemoryFilter(WebDriver driver,int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_feature_nine_browse-bin')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public void clickFeatureKeywordsFilter(WebDriver driver,int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_feature_keywords_browse-bin')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public void clickRamFilter(WebDriver driver,int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_feature_five_browse-bin')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public void clickWeightFilter(WebDriver driver,int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_size_two_browse-vebin')]["+indexElement+"]//a[@class='a-link-normal s-navigation-item']")).click();
	}
	public void clickConditionFilter(WebDriver driver,int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_condition-type')]["+indexElement+"]//a[@class='a-link-normal s-navigation-item']")).click();
	}
	public void clickNewUpcomingFilter(WebDriver driver,int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_date')]["+indexElement+"]//a[@class='a-link-normal s-navigation-item']")).click();
	}
	public void clickGLobalStoreFilter(WebDriver driver,int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_global_store_origin_marketplace')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public void clickSellerFilter(WebDriver driver,int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_6')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public void clickAvailabilityFilter(WebDriver driver,int indexElement) {
		driver.findElement(By.xpath("//li[starts-with(@id,'p_n_availability')]["+indexElement+"]//i[@class='a-icon a-icon-checkbox']")).click();
	}
	public String  getDescription() {
			return  driver.findElement(By.xpath("//div[@id='productDescription_feature_div']//div[@id='productDescription_feature_div'] | //div[@id='productDescription']")).getText();
	}	
}
