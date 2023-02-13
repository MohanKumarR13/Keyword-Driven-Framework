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

	public static void fileLoc(String loc) throws IOException {

		file = new FileInputStream(loc);
		book = new XSSFWorkbook(file);
		sheet = book.getSheet("Sheet1");

	}

	public String getCellValueExcelSheet(int row, int column) {
		cell = sheet.getRow(row).getCell(column);
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);
		return cellValue;
	}
}
