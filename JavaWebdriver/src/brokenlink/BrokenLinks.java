package brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		// Initiate driver
		System.setProperty("webdriver.chrome.driver","C://Users//KIRAN//Downloads//Eclipse//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//Maximise page
		driver.manage().window().maximize();
		
		//Implicit wait for 10 sec
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Open URL of App
	      driver.get("http://www.newtours.demoaut.com/");
		// driver.get("http://testautomationpractice.blogspot.com/");
		
		//wait
		Thread.sleep(5000);
		
		//Capture links from webpage
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i=0;i<links.size();i++)
		{
			//by using href arrtribute we can get URL of required link
			
			WebElement element=links.get(i);
			String url= element.getAttribute("href");
			URL link = new URL(url);
			
			// create a connection using url object
			HttpURLConnection httpconn = (HttpURLConnection)link.openConnection();
			//wait for 2 sec
			Thread.sleep(2000);
			// establish connection
			httpconn.connect();
			
			int rescode = httpconn.getResponseCode();  // returns response code.if rescode is  above 400
			
			if (rescode>=400) 
			{
				System.out.println(url +" - "+ "is broken link");
			}
			else
			{
				System.out.println(url +" - "+ "is valid link");
			}
			
			
		}

	}

}
