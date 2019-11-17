package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C://Users//KIRAN//Downloads//Eclipse//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.newtours.demoaut.com/");  // opens the URL
		
		System.out.println(driver.getTitle());    // Returns title of the page
		
		System.out.println(driver.getCurrentUrl());  // Returns URL of the page
		
		String text = driver.findElement(By.xpath("//b[contains(text(),'Sep 6, 2019')]")).getText(); // Returns the text of the page
		
		System.out.println(text); 

		driver.close();  // close current window
		//driver.quit();  // close multiple windows



	}

}
