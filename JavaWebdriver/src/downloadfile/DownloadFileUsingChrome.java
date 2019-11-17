package downloadfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileUsingChrome {

	public static void main(String[] args) throws InterruptedException {
		
	
				System.setProperty("webdriver.chrome.driver","C://Users//KIRAN//Downloads//Eclipse//chromedriver_win32//chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			    driver.get("http://demo.automationtesting.in/FileDownload.html");
			
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("Testing");
				driver.findElement(By.xpath("//button[@id='createTxt']")).click();  // generate txt file
				driver.findElement(By.xpath("//a[@id='link-to-download']")).click(); // display download and click
				
				driver.findElement(By.xpath(" //textarea[@id='pdfbox']")).sendKeys("Testing");
				driver.findElement(By.xpath("//button[@id='createPdf']")).click();  // generate pdf file
				driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click(); // display download and click
				

	}

}
