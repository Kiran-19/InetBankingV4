package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C://Users//KIRAN//Downloads//Eclipse//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		//Login
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Admin-->UserManagement-->Users
		
		Actions act=new Actions(driver);
		
		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement usermg=driver.findElement(By.id("menu_admin_UserManagement"));
		WebElement user = driver.findElement(By.id("menu_admin_viewSystemUsers"));
		
		/*act.moveToElement(admin).build().perform();      // mouseover on admin
		act.moveToElement(usermg).build().perform();       // mouse over on usermanagement 
		act.moveToElement(user).click().build().perform();  // mouse over on user and click the options*/
		
		act.moveToElement(admin).moveToElement(usermg).moveToElement(user).click().build().perform();
		
		
	}

}
