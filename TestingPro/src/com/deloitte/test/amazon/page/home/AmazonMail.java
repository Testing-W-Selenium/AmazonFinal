package com.deloitte.test.amazon.page.home;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
public class AmazonMail{
	private WebDriver driver; 
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	String code;
	//hlksadkjlakdsa
	public AmazonMail(WebDriver driver) {
		this.driver = driver;
	}
	public void openMailHost() {
//		driver = new ChromeDriver();
//		driver.get("https://mail.ru");
//		driver.manage().window().maximize();
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://mail.ru");
		
	}
	
	public void setEmail() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='mailbox:login']")).sendKeys("gerrys.pizza");
	}
	public void setPassword() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='mailbox:password']")).sendKeys("ofertonloco");
	}
	public void clickContinue() {
		driver.findElement(By.xpath("//input[@class='o-control']")).click();
	}
	public void clickLogIn() {
		driver.findElement(By.xpath("//input[@class='o-control']")).click();
		
	}
	public void clickRefresh() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='nav__folder nav__folder_parent']//div[@class='nav__folder-name__txt']")).click();
	}
	
	public void clickRecentEmail() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@class='llc__item llc__item_correspondent llc__item_unread']//span[text()='Amazon.com']")).click();
	}
	public String getCode() throws InterruptedException {
		Thread.sleep(3000);		
		return code = driver.findElement(By.xpath("//p[@class='otp_mailru_css_attribute_postfix']")).getText();
		
	}
	public void changeTab() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
	}
	
	
	
	
}