package Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.keyword.LoginHRM;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionKeyword {
	static WebDriver driver;

//open browser
	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(browserOptionSettings());

	}

	private static ChromeOptions browserOptionSettings() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("enable-automation");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-browser-side-navigation");
		options.addArguments("--disable-gpu");
		return options;
	}

//go to url
	public static void gotoUrl() throws InterruptedException {
		driver.get(LoginHRM.URL);
		Thread.sleep(5000);
	}

//enter name
	public static void enterUserName() {
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Admin");
	}

//enter password
	public static void enterPassword() {

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
	}

//click login
	public static void clickSignIn() throws InterruptedException {

		WebElement login = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		Thread.sleep(2000);
	}

	public static void clickLink() throws InterruptedException {

		WebElement link = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a"));
		link.click();
		Thread.sleep(2000);

	}

	public static void enterTitle() throws InterruptedException {

		WebElement value = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"));
		value.click();
		value.sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
		Thread.sleep(5000);
		value.click();

	}

	public static void searchData() {

		WebElement search = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
		search.click();
	}
}
