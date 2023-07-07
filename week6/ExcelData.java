package week6;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	public String[][] getData(String excelFileName) throws IOException {
		// To open workbook
		XSSFWorkbook book = new XSSFWorkbook("./testData/" + excelFileName + ".xlsx");
		// To get first sheet of workbook
		XSSFSheet sheet = book.getSheetAt(0);
		// To get total number of rows
		int rowCount = sheet.getLastRowNum();
		// To get total number of columns
		short colCount = sheet.getRow(0).getLastCellNum();
		//create 2D array for storing excel values
		String[][] data = new String[rowCount][colCount];
		// Iterate through rows
		for(int i = 1; i <= rowCount; i++) {
			// To get each row values
			XSSFRow row = sheet.getRow(i);
			for(int j = 0; j < colCount; j++) {
				// To get each cell value
				XSSFCell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
				System.out.println(data);
			}
		}
		// Close the book
		book.close();
		return data;
	}
}