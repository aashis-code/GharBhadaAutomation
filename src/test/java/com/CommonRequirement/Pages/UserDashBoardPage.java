package com.CommonRequirement.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserDashBoardPage {

	WebDriver driver;

	public UserDashBoardPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void seeListedProperty() throws InterruptedException {

		// x path for User DAshboard
		driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div[2]/a/i")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div[2]/ul/li[1]")).click();
		Thread.sleep(3000);

		// x path for delete button
//		driver.findElement(By.xpath("//*[@id=\"main d-flex flex-column mt-5\"]/section/div/div/div[1]/div/div[2]/div/div[3]/ul/li/button")).click();

	}

	public void editProperty() throws InterruptedException {

		// x path for edit property option
		driver.findElement(By.className("link-a")).click();
		Thread.sleep(3000);
		
		// x path for updating Title input
		driver.findElement(By.xpath("//*[@id=\"Title\"]")).sendKeys("flat in Butwal");
		Thread.sleep(2000);

		// x path for updating Description input
		driver.findElement(By.xpath("//*[@id=\"Description\"]"))
				.sendKeys("flat in Butwal available for cheapest possible price with spacious area.");
		Thread.sleep(2000);

		// x path for updating Amenity input
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Balcony, Internet, Parking");
		Thread.sleep(2000);

		// x path for updating Rent Price input
		driver.findElement(By.xpath("//*[@id=\"price\"]")).sendKeys("10000");
		Thread.sleep(2000);

		// x path for updating Status
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/form/div[4]/select")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/form/div[4]/select/option[2]")).click();
		Thread.sleep(3000);

	}

	public void userLogoutTest() throws InterruptedException {

		// x path for Home Link click
		driver.findElement(By.xpath("//*[@id=\"navbarDefault\"]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		
		//x path for Logout click 
		driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div[2]/ul/li[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/nav/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(3000);
	}

}
