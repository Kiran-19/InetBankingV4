package selenium.webdriver.basictest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
	
     System.setProperty("webdriver.gecko.driver", "C://Users//KIRAN//Downloads//Eclipse//geckodriver-v0.24.0-win64//geckodriver.exe");
     
     // FirefoxDriver driver = new  FirefoxDriver();  // Invoke the browser
     
     WebDriver driver = new  FirefoxDriver();
     
     driver.get("https://www.facebook.com/");    // Open URL in the application
     
     
        // Validation
     String exptitle="Facebook – log in or sign up";
     
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
