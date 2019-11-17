package datadriventests;

import java.io.FileInputStream;
import java.lang.NullPointerException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadWriteRegistrationPage {

	public static void main(String[] args) throws IOException, NullPointerException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//KIRAN//Downloads//Eclipse//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.newtours.demoaut.com/");  // opens the URL
		
		//Getting Data from EXCEL Sheet
		
		FileInputStream  file = new FileInputStream("C://Users//KIRAN//Downloads//Eclipse//test1.xlsx");
		
		// Get the workboob instance for XLSX file
		
 		 XSSFWorkbook workbook=new XSSFWorkbook(file);
 		 
 		 // Get first sheet from the workbook
 		 
 		 // XSSFSheet sheet = workbook.getSheet(Sheet1); // providing sheet name
 		 XSSFSheet sheet = workbook.getSheetAt(0);
 		 
 		 // get first row from the sheet
 		 
 		 int rowcount = sheet.getLastRowNum();         // returns the row count
 		 
 		System.out.println("No of Records in the excel sheet:" + rowcount);
 		
 		for (int i=0;i<rowcount;i++)
 		{
 			XSSFRow currentrow = sheet.getRow(i);  // focus on current row
 			
 		    String FirstName = currentrow.getCell(0).getStringCellValue();
 		   String LastName = currentrow.getCell(1).getStringCellValue();
 		  String Phone = currentrow.getCell(2).getStringCellValue();
 		 String Email = currentrow.getCell(3).getStringCellValue();
         String Address = currentrow.getCell(4).getStringCellValue();
 		 String City = currentrow.getCell(5).getStringCellValue();
 		 String State = currentrow.getCell(6).getStringCellValue();
 		 String PostalCode = currentrow.getCell(7).getStringCellValue();
 		 String Country= currentrow.getCell(8).getStringCellValue();
 		 String UserName = currentrow.getCell(9).getStringCellValue();
 		 String Password= currentrow.getCell(10).getStringCellValue();
 		 
 		 
 		 // Registration process
 		 
 		 driver.findElement(By.linkText("REGISTER")).click();
 		 
 		 //Entering contact information
 		 
 		 driver.findElement(By.name("firstName")).sendKeys(FirstName);
 		driver.findElement(By.name("lastName")).sendKeys(LastName);
 		driver.findElement(By.name("phone")).sendKeys(Phone);
 		driver.findElement(By.name("email")).sendKeys(Email);
 		
 		 // Entering mailing information
 		driver.findElement(By.name("Address1")).sendKeys(Address);
 		driver.findElement(By.name("Address2")).sendKeys(Address);
 		driver.findElement(By.name("city")).sendKeys(City);
 		driver.findElement(By.name("state")).sendKeys(State);
 		driver.findElement(By.name("postalcode")).sendKeys(PostalCode);
 		
 		// Country selection
 		Select dropcountry = new Select(driver.findElement(By.name("country")));
 		dropcountry.selectByVisibleText(Country);
 		
 		//Enter user information
 		
 		driver.findElement(By.name("username")).sendKeys(UserName);
 		driver.findElement(By.name("password")).sendKeys(Password);
 		driver.findElement(By.name("confirmpassword")).sendKeys(Password);
 		
 		// submit form
 		
 		driver.findElement(By.name("register")).click();
 		
 		
 		
 		
 		
 		
 		 
 		}
 		 

	}

}
