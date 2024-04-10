package com.CommonRequirement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.CommonRequirement.Pages.HomePage;
import com.CommonRequirement.Pages.LoginPage;
import com.CommonRequirement.Pages.PropertyPage;
import com.CommonRequirement.Pages.RegisterPage;
import com.CommonRequirement.Pages.RequestPage;
import com.CommonRequirement.Pages.UserDashBoardPage;

public class StartWith {
	
	WebDriver driver;

	@BeforeTest
	void openProject() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Create a new instance of ChromeDriver
         driver = new ChromeDriver();
         
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.manage().window().maximize();

        driver.get("http://localhost:3000/");
		Thread.sleep(3000);
        
	}
	
	@Test(priority = 1)
	void propertyFilterTest() throws InterruptedException {
		PropertyPage property = new PropertyPage(driver);
		property.filterProperty();
	}
	
	@Test(priority = 2)
	void registerUserTest() throws InterruptedException{
		RegisterPage register = new RegisterPage(driver);
		register.userRegistration();
	}
	
	@Test(priority = 3)
	void userLoginTest() throws InterruptedException{
		LoginPage login = new LoginPage(driver);
		login.loginInfoTest("raju@gmail.com", "raju");
	}
	
	@Test(priority = 4)
	void viewSingleProperty() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.scrollDownTest();
		home.addRatingAndcomment();
	}
	
	@Test(priority = 5)
	void newPropertyRequestTest() throws InterruptedException{
		RequestPage request = new RequestPage(driver);
		request.listPropertyTest();
		
	}
	
	@Test(priority = 6)
	void userDasBoardTest() throws InterruptedException{
		UserDashBoardPage dashboard = new UserDashBoardPage(driver);
		dashboard.seeListedProperty();
		dashboard.editProperty();
//		dashboard.userLogoutTest();
	}
	
	@AfterTest
	void closeWindow() {
		driver.quit();
	}

}
