package dropdowntests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownSortedOptions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//KIRAN//Downloads//Eclipse//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("animals"));
		
		Select se = new Select(element);
		
		List originallist = new ArrayList();
		List templist = new ArrayList();
		
		List <WebElement>options=se.getOptions();
		
		for(WebElement e:options)
		{
		  originallist.add(e.getText());
		  templist.add(e.getText());
		}
		System.out.println(" Before sorting Original list:"+ originallist);
		System.out.println("Before sorting temp list:"+ templist);
		
		Collections.sort(templist);
		
		System.out.println("After sorting Original list:"+ originallist);
		System.out.println("After sorting temp list:"+ templist);
		
		if(originallist == templist)
		{
			System.out.println("Dropdown sorted");
		}
		else
		{
			System.out.println("Dropdown not sorted");
		}
		driver.close();

	}

}
