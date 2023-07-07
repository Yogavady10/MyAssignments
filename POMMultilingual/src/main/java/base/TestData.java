package base;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {
	public static String[][] getData(String excelFileName) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("src/main/resources/"+excelFileName+".xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][colCount];
		for(int i = 1; i < rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
			}
		}
		book.close();
		return data;
	}
}

