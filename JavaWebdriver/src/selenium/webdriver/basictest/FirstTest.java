package selenium.webdriver.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) {
	
     System.setProperty("webdriver.gecko.driver", "C://Users//KIRAN//Downloads//Eclipse//geckodriver-v0.24.0-win64//geckodriver.exe");
     
     // FirefoxDriver driver = new  FirefoxDriver();  // Invoke the browser
     
     WebDriver driver = new  FirefoxDriver();
     
     driver.get("http://newtours.demoaut.com/");    // Open URL in the application
     
     driver.findElement(By.name("userName")).sendKeys("mercury");  // Enter username
     
     driver.findElement(By.name("password")).sendKeys("mercury");     // Enter password
     
     driver.findElement(By.name("login")).click();             // click on signin button
     
        // Validation
     String exptitle="Welcome: Mercury Tours";
     
       String acttitle= driver.getTitle();
       
       if(exptitle.equals(acttitle))
       {
    	   System.out.println("test is passed");
       }
       else
       {
    	   System.out.println("test is failed");
       }
     
       driver.close();  // close the browser
		
	}

}
