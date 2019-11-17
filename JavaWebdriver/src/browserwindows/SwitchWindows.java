package browserwindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//KIRAN//Downloads//Eclipse//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
		
		//System.out.println(driver.getTitle());
		
		Set <String> s = driver.getWindowHandles();
		
		for(String i:s)
		{
			String t = driver.switchTo().window(i).getTitle();
			
			if(t.contains("Sakinalium | Home"))
			{
				driver.close();
			}
			
		}
        
		
	}

}
