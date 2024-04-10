package com.CommonRequirement.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void scrollDownTest() throws InterruptedException{
		
		//x path for Home Link click
		driver.findElement(By.xpath("//*[@id=\"navbarDefault\"]/ul/li[1]/a/p")).click();
		
		// JS script insertion for scroll 
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0, 1600)");
		Thread.sleep(2000);
		
		//x path for Property click
		driver.findElement(By.xpath("//*[@id=\"main d-flex flex-column\"]/section/div/div/div[1]/div/div[2]/div/div[2]/a")).click();
		Thread.sleep(2000);
	}
	
	public void addRatingAndcomment() throws InterruptedException{
		
		// Move to top of the page 
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,0)");
	    Thread.sleep(3000);
	    
	    // x path for increasing rating 
//	    driver.findElement(By.xpath("/html/body/div/section[1]/div/div/div[1]/div/div[1]/div[3]/div/div/i[2]")).click();
//	    Thread.sleep(3000);
//	    
//	    //x path for sending rating
//	    driver.findElement(By.xpath("/html/body/div/section[1]/div/div/div[1]/div/div[1]/div[3]/div/div/i[3]")).click();
//	    Thread.sleep(3000);
	    
	    //JS script for scrolling page
	    js.executeScript("scrollBy(0,1600)");
	    Thread.sleep(3000);
	    
	    //x path for Comment input
	    driver.findElement(By.xpath("//*[@id=\"floatingTextarea2\"]")).sendKeys("aaha, kati ramro ho property. Love it");
	    Thread.sleep(3000);
	    
	    //x path for Send button
	    driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div[4]/div/button")).click();
	    Thread.sleep(3000);
	}

}
