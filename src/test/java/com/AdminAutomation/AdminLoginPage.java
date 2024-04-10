package com.AdminAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminLoginPage {
	
	WebDriver driver;

	public AdminLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void adminLoginTest() throws InterruptedException{
		
		// x path for Login link
		driver.findElement(By.xpath("//*[@id=\"navbarDefault\"]/ul/li[8]/a/p")).click();
		Thread.sleep(3000);
		
		//x path for Email input
		driver.findElement(By.xpath("//*[@id=\"typeEmailX\"]")).sendKeys("admin@gmail.com");
		Thread.sleep(3000);
		
		//x path for Password input
		driver.findElement(By.xpath("//*[@id=\"typePasswordX\"]")).sendKeys("admin");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div/div/div/div[1]/form/button")).click();
		Thread.sleep(3000);
	}

}
