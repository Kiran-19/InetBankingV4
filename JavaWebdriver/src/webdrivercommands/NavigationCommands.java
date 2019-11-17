package webdrivercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//KIRAN//Downloads//Eclipse//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com/");
		System.out.println(driver.getTitle());
	
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		driver.close();

	}

}
