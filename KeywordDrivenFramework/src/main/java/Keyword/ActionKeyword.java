package Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeyword {
	static WebDriver driver;
//open browser
public static  void openBrowser() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Mohan\\Downloads\\chromedriver.exe");  
	     driver=new ChromeDriver();  
}
//go to url
public static void gotoUrl() {
	 driver.navigate().to("https://www.browserstack.com/users/sign_in");  

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
