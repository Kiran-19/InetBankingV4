package robotapi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotAPIDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C://Users//KIRAN//Downloads//Eclipse//geckodriver-v0.24.0-win64//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
       driver.get("");
       
       driver.findElement(By.xpath(""));
       
       Robot robot=new Robot();
       
       Thread.sleep(3000);
       
      /* Down arroe
       3 time tab key
       enter*/
       
       robot.keyPress(KeyEvent.VK_DOWN);
       Thread.sleep(3000);
       
       robot.keyPress(KeyEvent.VK_TAB);
       Thread.sleep(3000);
       
       robot.keyPress(KeyEvent.VK_TAB);
       Thread.sleep(3000);
       
       robot.keyPress(KeyEvent.VK_TAB);
       Thread.sleep(3000);
      
       
       robot.keyPress(KeyEvent.VK_ENTER);
       Thread.sleep(3000);
	}

}
