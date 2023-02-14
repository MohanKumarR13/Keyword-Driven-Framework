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
	public static String locatorName;
	public static String locatorValue;
	public static String keywordColumnValue;
	public static String dataColumnValue;
	public static int totalRows;

	public static void fileLoc(String loc) throws IOException {

		file = new FileInputStream(loc);
		book = new XSSFWorkbook(file);
		sheet = book.getSheet("Sheet1");
		totalRows=sheet.getLastRowNum();

	}

	public void getCellValueExcelSheet(int row, int locatorcolumn,int keywordColumn,int dataColumn) {
//		cell = sheet.getRow(row).getCell(column);
//		String cellValue = cell.getStringCellValue();
	locatorColumnValue=	sheet.getRow(row).getCell(locatorcolumn).toString().trim();
	if (!locatorColumnValue.contains("NA")) {
		
	
		locatorName=locatorColumnValue.split(":")[0].toString().trim();
		locatorValue=locatorColumnValue.split(":")[1].toString().trim();
	}else {
		locatorName="NA";
		locatorValue="NA";
	}
	keywordColumnValue=sheet.getRow(row).getCell(keywordColumn).toString().trim();
	dataColumnValue=sheet.getRow(dataColumn).toString().trim();
	System.out.println(locatorName+" : "+locatorValue+" KeyWord: "+keywordColumnValue+"Data :"+dataColumn);


		
	}
}
