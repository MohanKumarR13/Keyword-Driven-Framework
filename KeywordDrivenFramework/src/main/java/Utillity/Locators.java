package Utillity;

import org.openqa.selenium.By;

public class Locators {
	public static By getName(String locatorValue) {
		return By.name(locatorValue);
	}
	
public static By getXpath(String locatorValue) {
	return By.xpath(locatorValue);

	}
}
