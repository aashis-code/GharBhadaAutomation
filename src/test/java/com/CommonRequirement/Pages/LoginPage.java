package com.CommonRequirement.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void loginInfoTest(String username, String password) throws InterruptedException{
		
		driver.findElement(By.xpath("//*[@id=\"navbarDefault\"]/ul/li[8]/a/p")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"typeEmailX\"]")).sendKeys(username);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"typePasswordX\"]")).sendKeys(password);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div/div/div/div[1]/form/button")).click();
		Thread.sleep(3000);
	}
	
	
	
}
