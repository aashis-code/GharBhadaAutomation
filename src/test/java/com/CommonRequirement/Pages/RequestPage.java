package com.CommonRequirement.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RequestPage {
	
	WebDriver driver;

	public RequestPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void listPropertyTest() throws InterruptedException{
		
		//x path for Request Link
		driver.findElement(By.xpath("//*[@id=\"navbarDefault\"]/ul/li[6]/a/p")).click();
		
		// x path for Title input
		driver.findElement(By.xpath("//*[@id=\"Title\"]")).sendKeys("Flat in Kathmandu");
		Thread.sleep(2000);
		
		// x path for Description input
		driver.findElement(By.xpath("//*[@id=\"Description\"]")).sendKeys("The listed flat is well decorated with large number of furnitured in it.");
		Thread.sleep(2000);
		
		// x path for Amenities input
		driver.findElement(By.xpath("/html/body/div/div[1]/div/form/div[1]/div[1]/div[3]/input")).sendKeys("Balcony, SunBath, Parking");
		Thread.sleep(2000);
		
		// x path for City input
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Babarmahal");
		Thread.sleep(2000);
		
		// x path for area input
		driver.findElement(By.xpath("//*[@id=\"area\"]")).sendKeys("3000");
		Thread.sleep(2000);
		
		// x path for price input
		driver.findElement(By.xpath("/html/body/div/div[1]/div/form/div[1]/div[2]/div[2]/input")).sendKeys("15000");
		Thread.sleep(2000);
		
		// x path for Bedroom input
		driver.findElement(By.xpath("//*[@id=\"bedroom\"]")).sendKeys("8");
		Thread.sleep(2000);
		
		// x path for Bathroom input
		driver.findElement(By.xpath("//*[@id=\"bathroom\"]")).sendKeys("4");
		Thread.sleep(2000);
		
		// x path for Category Selection
		driver.findElement(By.xpath("//*[@id=\"districtSelect\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div/form/div[2]/div[1]/select/option[2]")).click();
		Thread.sleep(2000);
		
		//x path for district selection
		driver.findElement(By.xpath("/html/body/div/div[1]/div/form/div[2]/div[2]/select")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div/form/div[2]/div[2]/select/option[2]")).click();
		Thread.sleep(2000);
		
		//x path for File choose 
		WebElement file = driver.findElement(By.xpath("//*[@id=\"photoInput\"]"));
		String path = "C:\\Users\\Aashis Pandey\\Desktop\\GharbhadaProperty\\HomeTEST.jpg";
		file.sendKeys(path);
		
		// x path for Location on 
		driver.findElement(By.xpath("//*[@id=\"locationInput\"]")).click();
		Thread.sleep(4000);
		
		// x path for Submit button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/form/div[2]/button")).click();

		
	}

}
