package com.AdminAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminUserPage {

	WebDriver driver;

	public AdminUserPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void searchUserTest() throws InterruptedException {
		// x path for User Link
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/nav/div/ul/li[3]/a")).click();
		Thread.sleep(3000);

		// x path for keyword input
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/input")).sendKeys("test");
		Thread.sleep(4000);

	}

	public void deleteUserTest() throws InterruptedException {


		// x path user click 
		driver.findElement(By.xpath("//*[@id=\"accordionFlushExample\"]/li[1]/div/h2/button")).click();
		Thread.sleep(4000);

		// x path for Delete Button click 
		driver.findElement(By.xpath("/html/body/div/div/div[2]/ul/div/li/div/div/button")).click();
		Thread.sleep(4000);
	}

}
