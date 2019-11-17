package handlingwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioAndCheckBoxDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//KIRAN//Downloads//Eclipse//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Kiran");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kumar");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("Test@mailinator.com");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys("7262555555");

		System.out.println(driver.findElement(By.name("radiooptions")).isSelected());
		driver.findElement(By.name("radiooptions")).click();
		driver.findElement(By.id("checkbox1")).click();
		
		
        WebElement  list = driver.findElement(By.xpath("//select[@id='Skills']"));
         Select ss = new Select(list);
         ss.selectByVisibleText("C");
         //System.out.println(s.getOptions().size());
         
         WebElement  list1 = driver.findElement(By.xpath("//select[@id='countries']"));
         Select ss1 = new Select(list1);
         ss1.selectByVisibleText("India");
         
        
         WebElement  list4 = driver.findElement(By.xpath("//select[@id='yearbox']"));
         Select year = new Select(list4);
         year.selectByVisibleText("1916");
         
         WebElement  list3 = driver.findElement(By.xpath("//select[@placeholder='Month']"));
         Select month = new Select(list3);
         month.selectByVisibleText("January");
         
         WebElement  list2 = driver.findElement(By.xpath("//select[@id='daybox']"));
         Select day = new Select(list2);
         day.selectByVisibleText("15");
         
         driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Kiran123");
 		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Kiran123");
 		
 		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
 		
 		if(driver.getCurrentUrl().contains("http://demo.automationtesting.in/WebTable.html")==true)
		{
			System.out.println("Test is pass");
		}
 		else
 		{
 			System.out.println("Test is fail");
 		}
        driver.close();
         
	}

}
