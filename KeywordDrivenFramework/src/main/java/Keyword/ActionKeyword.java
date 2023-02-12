package Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.keyword.LoginHRM;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionKeyword {
	static WebDriver driver;
//open browser
public static  void openBrowser() {
//	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Mohan\\Downloads\\chromedriver.exe");  
//	     driver=new ChromeDriver();  
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver(browserOptionSettings());

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
public static void gotoUrl() {
	driver.get(LoginHRM.URL);

}
//enter name
public static void enterUserName() {
	WebElement userName=driver.findElement(By.id("user_email_login"));
	userName.sendKeys("abc@gmail.com");
}
//enter password
public static void enterPassword() {

WebElement password=driver.findElement(By.id("user_password"));
password.sendKeys("your_password");
}
//click login
public static void clickSignIn() {

WebElement login=driver.findElement(By.id("user_submit"));
login.click();
}
}
