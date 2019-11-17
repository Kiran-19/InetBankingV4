package webdrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//KIRAN//Downloads//Eclipse//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		
		if(email.isDisplayed() && email.isEnabled())
		{
			email.sendKeys("abcd");
		}
		
		if (pass.isDisplayed() && pass.isEnabled())
		{
			pass.sendKeys("12345");
		}

		System.out.println(driver.findElement(By.xpath("//input[@id='u_0_8']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id='u_0_9']")).isSelected());
		
		if (driver.findElement(By.xpath("//input[@id='u_0_8']")).isSelected()==false)
		{
			driver.findElement(By.xpath("//input[@id='u_0_8']")).click();
		}
		
		driver.close();
		
	}

}
