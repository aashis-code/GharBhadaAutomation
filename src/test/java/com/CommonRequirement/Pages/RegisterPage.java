package com.CommonRequirement.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void userRegistration() throws InterruptedException{
		 //Login Link click
		  driver.findElement(By.xpath("//*[@id=\"navbarDefault\"]/ul/li[6]/a/p")).click();
		  Thread.sleep(1000);
		  
		  //Select Register
		  driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div/div/div/div[1]/form/p[2]/a")).click();
          Thread.sleep(1000);
        
		  // x path for Name
		  driver.findElement(By.xpath("//*[@id=\"typeNameX\"]")).sendKeys("Bijaya");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//*[@id=\"typeEmailX\"]")).sendKeys("bijaya@gmail.com");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//*[@id=\"typeNumberdX\"]")).sendKeys("981232324");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//*[@id=\"typeAddressdX\"]")).sendKeys("Tillotama");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//*[@id=\"typePasswordX\"]")).sendKeys("bijaya");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div/div/div/div/form/button")).click();
	}
	
	

}
