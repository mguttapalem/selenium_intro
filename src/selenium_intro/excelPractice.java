package selenium_intro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fis= new FileInputStream("C:\\Users\\somasekhar\\documents\\dataExcel.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet("script");
		XSSFRow row= sheet.getRow(2);
		XSSFCell cell =row.getCell(2);
		String cellvalue =cell.getStringCellValue();
		System.out.println(cellvalue);

	}

}
