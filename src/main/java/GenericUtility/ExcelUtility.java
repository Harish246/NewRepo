package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public static String readDataFromExcel(String sheetName, int rowNumber, int cellNumber) throws Throwable {
		FileInputStream fis= new FileInputStream("./SEL.XLSX");
		Workbook wb =  WorkbookFactory.create (fis);
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetName);
		Row rowNum = sh.getRow(rowNumber);
		Cell cellNum = rowNum.getCell(cellNumber);
		return cellNum.getStringCellValue();
		
		
	}

}
