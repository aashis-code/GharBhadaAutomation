package com.CommonRequirement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.AdminAutomation.AdminCategoryPage;
import com.AdminAutomation.AdminHomePage;
import com.AdminAutomation.AdminLoginPage;
import com.AdminAutomation.AdminUserPage;

public class AdminMethod {

	WebDriver driver;

	@BeforeTest
	void openProject() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		// Create a new instance of ChromeDriver
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost:3000/");
		Thread.sleep(3000);

	}

	@Test(priority = 1)
	void adminLoginTest() throws InterruptedException {

		AdminLoginPage login = new AdminLoginPage(driver);
		login.adminLoginTest();
	}

	@Test(priority = 2)
	void adminHomeTest() throws InterruptedException {

		AdminHomePage home = new AdminHomePage(driver);
		home.searchHometest();
		home.deleteHomeTest();
	}

	@Test(priority = 3)
	void adminUserTest() throws InterruptedException {

		AdminUserPage user = new AdminUserPage(driver);
		user.searchUserTest();
		user.deleteUserTest();
	}

	@Test(priority = 4)
	void adminCategoryTest() throws InterruptedException {

		AdminCategoryPage category = new AdminCategoryPage(driver);
		category.addNewCategoryTest();
		category.editCategoryTest();
		category.deleteCategoryTest();
	}

	@AfterTest
	void closeWindow() {
		driver.quit();
	}

}
