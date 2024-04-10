package com.AdminAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminCategoryPage {

	WebDriver driver;

	public AdminCategoryPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void addNewCategoryTest() throws InterruptedException {

		// x path for Category Link
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/nav/div/ul/li[4]/a")).click();
		Thread.sleep(3000);

		// x path for new Category addition 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/button/i")).click();
		Thread.sleep(4000);


		// x path for Title input 
		driver.findElement(By.xpath("//*[@id=\"Title\"]")).sendKeys("Test Title");
		Thread.sleep(3000);


		// x path for category Description
		driver.findElement(By.xpath("//*[@id=\"Description\"]"))
				.sendKeys("It represents the test input for Category.");
		Thread.sleep(3000);


		// x path for Save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/form/button[1]")).click();
		Thread.sleep(3000);

	}

	public void editCategoryTest() throws InterruptedException {

		// x path for category item
		driver.findElement(By.xpath("//*[@id=\"accordionFlushExample\"]/li[6]/div/h2/button")).click();
		Thread.sleep(3000);


		// x path for Edit button
		driver.findElement(By.xpath("//*[@id=\"flush-collapse10\"]/button[2]")).click();
		Thread.sleep(3000);


		// x path for Updation title input
		driver.findElement(By.xpath("//*[@id=\"floatingTextarea\"]")).sendKeys("Automated Test Updation");
		Thread.sleep(2000);


		// x path for Updation Description input
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/ul/div/li[6]/div/form/div[2]/textarea"))
				.sendKeys("it is Test Description Automted Updation");
		Thread.sleep(3000);


		// x path for Update button
		driver.findElement(By.xpath("//*[@id=\"accordionFlushExample\"]/li[6]/div/form/button[1]")).click();
		Thread.sleep(3000);

	}

	public void deleteCategoryTest() throws InterruptedException {

		// x path for category item
		driver.findElement(By.xpath("//*[@id=\"accordionFlushExample\"]/li[6]/div/h2/button")).click();
		Thread.sleep(3000);


		// x path for Delete button
		driver.findElement(By.xpath("//*[@id=\"flush-collapse10\"]/button[1]")).click();
		Thread.sleep(3000);


	}

}
