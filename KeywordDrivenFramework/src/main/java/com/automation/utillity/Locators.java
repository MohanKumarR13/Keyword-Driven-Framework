package com.automation.utillity;

import org.openqa.selenium.By;

public class Locators {
	public static By getId(String locatorValue) {
		return By.id(locatorValue);

	}

	public static By getName(String locatorValue) {
		return By.name(locatorValue);
	}

	public static By getXpath(String locatorValue) {
		return By.xpath(locatorValue);
	}

	public static By getLinkText(String locatorValue) {
		return By.linkText(locatorValue);

	}
}
