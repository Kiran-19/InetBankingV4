package handlingwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWebElemetsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//KIRAN//Downloads//Eclipse//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://fs2.formsite.com/meherpavan/form1/index.html");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Kumar");
		
		// driver.findElement(By.id("RESULT_TextField-4")).sendKeys("INDIA");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Bangalore"); 
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("Test@mailinator.com");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("9864664443");
		
		WebElement list = driver.findElement(By.id("RESULT_RadioButton-6"));
		
		Select s = new Select(list);
		//s.selectByValue("Radio-0");
		//s.selectByIndex(1);
		s.selectByVisibleText("Evening");
		
	     System.out.println(s.getOptions().size());  // number of items present
		
		//System.out.println(driver.findElement(By.id("RESULT_RadioButton-7_0")).isSelected());
		//driver.findElement(By.id("RESULT_RadioButton-7_0")).click();
		
		//driver.findElement(By.id("RESULT_CheckBox-8_0")).click();
		//driver.findElement(By.id("RESULT_CheckBox-8_6")).click();
		
		driver.findElement(By.id("RESULT_TextArea-11")).sendKeys("Seleniume practice"); 
		
		driver.findElement(By.linkText("Flight Reservation")).click();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		driver.findElement(By.id("FSsubmit")).click();
		
		if(driver.getTitle().contains("Thank you")==true)
		{
			System.out.println("Test is pass");
		}
		
		
		
	}

}
