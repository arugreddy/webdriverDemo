package webdriverDemotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class logintest {
	public static WebDriver driver;

	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\AR\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@Test
	public void logintest() {
		// driver.get("https://opensource-demo.orangehrmlive.com");
		// String titleString = driver.getTitle();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		String titleString = driver.getTitle();
		System.out.println(titleString);

	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
