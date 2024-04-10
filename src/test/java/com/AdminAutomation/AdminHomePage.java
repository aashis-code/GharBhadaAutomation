package com.AdminAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminHomePage {

	WebDriver driver;

	public AdminHomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void searchHometest() throws InterruptedException {
		// x path for Home Link
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/nav/div/ul/li[2]/a")).click();
		Thread.sleep(3000);

		// x path for Search bar
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[1]/input")).sendKeys("house");
		Thread.sleep(3000);
	}

	public void deleteHomeTest() throws InterruptedException {

		// x path for Delete Button 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/ul/li[1]/div/span/div/button")).click();
		Thread.sleep(3000);
	}

}
