package com.excecution;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import Keyword.ActionKeyword;
import Utillity.Utill;

public class Engine {
	static ActionKeyword actionKeyword;
	static Method[] methods;
	static String keyWord;
	public static void getActionKeyword() {
		 actionKeyword=new ActionKeyword();
		 methods=actionKeyword.getClass().getMethods();
	}
	
	public static void getExcecuteKeyword() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for(int i=0;i<methods.length;i++) {
			if(methods[i].getName().equalsIgnoreCase(keyWord)) {
				methods[i].invoke(actionKeyword);
				break;
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Utill util = new Utill();
		//Utill.fileLoc("C:\\KeywordDrivenFramework\\KeywordDriven\\KeywordDrivenFramework\\Sheets\\Keyworddriven.xlsx");
		 Utill.fileLoc("C:\\Users\\Admin\\git\\KeywordDriven\\KeywordDrivenFramework\\Sheets\\Keyworddriven.xlsx");
		 Engine engine=new Engine();
		 int locatorcolumn=3;
		 int keywordColumn=locatorcolumn+1;
		 int dataColumn=locatorcolumn+2;

		 Engine.getActionKeyword();
		for (int row = 1; row <= 8; row++) {
			// keyWord = util.getCellValueExcelSheet(row, locatorcolumn,keywordColumn,dataColumn);
			util.getCellValueExcelSheet(row, locatorcolumn,keywordColumn,dataColumn);

			 //Engine.getExcecuteKeyword();
//			if (keyWord.equalsIgnoreCase("openBrowser")) {
//				ActionKeyword.openBrowser();
//			} else if (keyWord.equalsIgnoreCase("gotoUrl")) {
//				ActionKeyword.gotoUrl();
//			} else if (keyWord.equalsIgnoreCase("enterUserName")) {
//				ActionKeyword.enterUserName();
//			} else if (keyWord.equalsIgnoreCase("enterPassword")) {
//				ActionKeyword.enterPassword();
//			} else if (keyWord.equalsIgnoreCase("clickSignIn")) {
//				ActionKeyword.clickSignIn();
//
//			} else if (keyWord.equalsIgnoreCase("clickLink")) {
//				ActionKeyword.clickLink();
//			} else if (keyWord.equalsIgnoreCase("enterTitle")) {
//				ActionKeyword.enterTitle();
//			} else if (keyWord.equalsIgnoreCase("searchData")) {
//				ActionKeyword.searchData();
//			}

		}
	}
}
