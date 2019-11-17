package datadriventests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadingDataFromExcelReg {

	public static void main(String[] args) throws IOException {
		
		FileInputStream  file = new FileInputStream("C://Users//KIRAN//Downloads//Eclipse//Registration.xlsx");
		
 		 XSSFWorkbook workbook=new XSSFWorkbook(file);
 		 
 		 // XSSFSheet sheet = workbook.getSheet(Sheet1); // providing sheet name
 		 XSSFSheet sheet = workbook.getSheetAt(0);
 		 
 		 int rowcount = sheet.getLastRowNum();         // returns the row count
 		 
 		int  colcount = sheet.getRow(0).getLastCellNum();  // returns column/cell count
 		
 		for (int i=0;i<rowcount;i++)
 		{
 			XSSFRow currentrow = sheet.getRow(i);  // focus on current row
 			
 			for ( int j=0;j<colcount;j++)
 	 		 {
 	 			 String value = currentrow.getCell(j).toString(); // read value from excel
 	 			 System.out.print("   "  + value);
 	 			 
 	 		 }
 			System.out.println();
 		}
 		 

	}

}
