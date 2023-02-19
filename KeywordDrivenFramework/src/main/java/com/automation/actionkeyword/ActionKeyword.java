package com.automation.actionkeyword;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.automation.constants.Constants;
import com.automation.excecution.Engine;
import com.automation.utillity.Utill;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionKeyword {
	static WebDriver driver;

//open browser
	public static void openBrowser() {
//		if(!Utill.dataColumnValue.equalsIgnoreCase("chrome"))
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver(browserOptionSettings());
		switch (Utill.dataColumnValue) {
		case Constants.CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
 	        driver.manage().window().maximize();
			break;
		case Constants.EDGE:
			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();
 	        driver.manage().window().maximize();

			break;

		default:
			break;
		}
	}

//	private static ChromeOptions browserOptionSettings() {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized");
//		options.addArguments("enable-automation");
//		options.addArguments("--no-sandbox");
//		options.addArguments("--disable-infobars");
//		options.addArguments("--disable-dev-shm-usage");
//		options.addArguments("--disable-browser-side-navigation");
//		options.addArguments("--disable-gpu");
//		return options;
//	}

//go to url
	public static void gotoUrl() throws InterruptedException {
		driver.get(Utill.dataColumnValue);
		Thread.sleep(5000);
	}

//enter name
	public static void enterUserName() {
		WebElement userName = driver.findElement(Engine.locator);
		userName.sendKeys(Utill.dataColumnValue);
	}

//enter password
	public static void enterPassword() {

		WebElement password = driver.findElement(Engine.locator);
		password.sendKeys(Utill.dataColumnValue);
	}

//click login
	public static void clickSignIn() throws InterruptedException {

		WebElement login = driver.findElement(Engine.locator);
		login.click();
		Thread.sleep(2000);
	}

	public static void clickLink() throws InterruptedException {

		WebElement link = driver.findElement(Engine.locator);
		link.click();
		Thread.sleep(2000);

	}

	public static void enterTitle() throws InterruptedException {

		WebElement value = driver.findElement(Engine.locator);
		value.click();
		value.sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
		Thread.sleep(5000);
		value.click();

	}

	public static void searchData() {

		WebElement search = driver.findElement(Engine.locator);
		search.click();
	}
}
