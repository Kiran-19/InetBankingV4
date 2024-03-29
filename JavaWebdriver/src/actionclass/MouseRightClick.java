package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//KIRAN//Downloads//Eclipse//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
         WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
         
         act.contextClick(button).build().perform();
         
         driver.findElement(By.xpath("/html/body/ul/li[3]")).click();
         
         System.out.println(driver.switchTo().alert().getText());
         driver.switchTo().alert().accept();
         
	}

}
