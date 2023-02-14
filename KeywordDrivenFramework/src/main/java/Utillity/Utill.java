package Utillity;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utill {
	static FileInputStream file;
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	XSSFCell cell;
	public static String locatorColumnValue;

	public static void fileLoc(String loc) throws IOException {

		file = new FileInputStream(loc);
		book = new XSSFWorkbook(file);
		sheet = book.getSheet("Sheet1");

	}

	public void getCellValueExcelSheet(int row, int locatorcolumn,int keywordColumn,int dataColumn) {
//		cell = sheet.getRow(row).getCell(column);
//		String cellValue = cell.getStringCellValue();
	locatorColumnValue=	sheet.getRow(row).getCell(locatorcolumn).toString().trim();
		System.out.println(locatorColumnValue);
	}
}
