package com.automation.excecution;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;

import com.automation.actionkeyword.ActionKeyword;
import com.automation.constants.Constants;
import com.automation.utillity.Locators;
import com.automation.utillity.Utill;

public class Engine {
	static ActionKeyword actionKeyword;
	static Method[] methods;
	public static By locator;

	public Engine() {
		actionKeyword = new ActionKeyword();
		methods = actionKeyword.getClass().getMethods();
	}

	public static void getExcecuteKeyword()
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for (int i = 0; i < methods.length; i++) {
			if (methods[i].getName().equalsIgnoreCase(Utill.keywordColumnValue)) {
				methods[i].invoke(actionKeyword);
				break;
			}
		}
	}

	public void findWebElement() {
		switch (Utill.locatorName) {
		case Constants.NAME:
			locator = Locators.getName(Utill.locatorValue);
			break;

		case Constants.XPATH:
			locator = Locators.getXpath(Utill.locatorValue);

			break;
		default:
			break;
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Utill util = new Utill();
		// Utill.fileLoc("C:\\KeywordDrivenFramework\\KeywordDriven\\KeywordDrivenFramework\\Sheets\\Keyworddriven.xlsx");
		Utill.fileLoc(Constants.EXCEL_LOCATION);
		Engine engine = new Engine();

		for (int row = 1; row <= Utill.totalRows; row++) {
			util.getCellValueExcelSheet(row, Constants.LOCATOR_COLUMN, Constants.KEYWORD_COLUMN, Constants.DATA_COLUMN);
			engine.findWebElement();

			Engine.getExcecuteKeyword();

		}
	}
}
