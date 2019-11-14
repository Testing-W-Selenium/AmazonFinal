package com.deloitte.test.amazon.page.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AmazonHome{
	private WebDriver driver; 
	//hlksadkjlakdsa
	public AmazonHome(WebDriver driver) {
		this.driver = driver;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void clickLogo() {
		driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']")).click();;
	}
	public void clicktodaydeals() {
		driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]")).click();
	}
	public void clickhelp() {
		driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][contains(text(),'Help')]")).click();
	}
	public void clickRegistry() {
		driver.findElement(By.xpath("//a[contains(text(),'Registry')]")).click();
		//YO
	}
	public void clickGift() {
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
	}
	public void clickSell() {
		driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][contains(text(),'Sell')]")).click();
	}
	public void clickMyAmazon() {
		driver.findElement(By.xpath("//a[@id='nav-your-amazon']")).click();
	}
	public void clickSignIn() {
		driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();	
		driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")).click();	
	}
	public void clickReturnOrders() {
		driver.findElement(By.xpath("//span[contains(text(),'Returns')]")).click();
	}
	public void clickCart() {
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
	}
	public void clickMenuLeft() {
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
	}
	public void clickLocation() {
		driver.findElement(By.xpath("//*[@id=\"nav-global-location-slot\"]/span/a")).click();
	}
	public void clickHoliDeals() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='nav-imageHref']//img")).click();
	}
	public void clickDepartments() {
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
	}
	public void findBar(String searchText) {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(searchText);
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
	}
	public void clickLanguage() {
		driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[1]/span")).click();
	}
}