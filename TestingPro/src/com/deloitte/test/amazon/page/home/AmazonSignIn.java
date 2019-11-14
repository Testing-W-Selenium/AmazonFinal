package com.deloitte.test.amazon.page.home;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSignIn{
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private WebDriver driver; 
	@FindBy(
			xpath="//input[@id='ap_email']"
			)
	private WebElement emailInput;
	@FindBy(
			xpath="//input[@id='ap_password']"
			)
	private WebElement passwordInput;
	public AmazonSignIn(WebDriver driver) {
		this.driver = driver;
	}
	public void inputEmail() {
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("gerrys.pizza@mail.ru");
		//emailInput.sendKeys("boy.richy@mail.ru");
	}
	
	
	public void inputPassword() {
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("ofertonloco");	
		//passwordInput.sendKeys("preppy14");
	}
	public void clickSubmit() {
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}
    public void clickLastFinish() {
		
		driver.findElement(By.xpath("//span[@id='a-autoid-0']//input[@class='a-button-input']")).click();
		
	}
	public void clickContinue() {
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
	}
	
public void clickContinue2() {
	driver.findElement(By.xpath("//input[@id='continue']")).click();
		
	driver.findElement(By.xpath("//*[@id=\"cvf-page-content\"]/div/div/div[1]/form/div[2]/input")).click();
		
	}
	public void getFail() {
		//System.out.println(a); Cambio
		LOGGER.log(Level.INFO,driver.findElement(By.xpath("//div[@id='auth-error-message-box']//div[@class='a-box-inner a-alert-container']")).getText());
	}
	public void clickCreateAccount() {
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']	")).click();
	}
	public void clickLog() {
		driver.findElement(By.xpath("//*[@id=\"a-autoid-0\"]/span/input")).click();
	}
	
	public void setOtp(String code) {
		
		driver.findElement(By.xpath("//*[@id=\"cvf-page-content\"]/div/div/div[1]/form/div[2]/input")).sendKeys(code);
	}
	
	public void registerForm()
	{
		 //jerrys update
		List<WebElement> myElements = driver.findElements(By.xpath("//input[@id]"));
		
		myElements.get(0).sendKeys("Gerardo");
		myElements.get(1).sendKeys("gerardo@gmail.com");
		myElements.get(2).sendKeys("odoeooe1");	
		myElements.get(3).sendKeys("odoeooe1");	
		myElements.get(4).click();	
}
}