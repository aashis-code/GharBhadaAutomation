package com.CommonRequirement.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PropertyPage {
	
	WebDriver driver;

	public PropertyPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void filterProperty() throws InterruptedException{
		
		// x path for Property Link
		driver.findElement(By.xpath("//*[@id=\"navbarDefault\"]/ul/li[2]/a/p")).click();
		Thread.sleep(3000);
		
		//x path for drop down  Range
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section/select[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section/select[1]/option[3]")).click();
		Thread.sleep(3000);
		
		//x path for drop down status
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section/select[2]")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section/select[2]/option[2]")).click();
		Thread.sleep(3000);
		
		//x path for drop down District
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section/select[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section/select[3]/option[4]")).click();
		Thread.sleep(3000);
		
		// x path for Search Keyword input
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/section/div/input")).sendKeys("flat");
		Thread.sleep(3000);
		
	}

}
