package downloadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFileUsingFireFox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C://Users//KIRAN//Downloads//Eclipse//geckodriver-v0.24.0-win64//geckodriver.exe");

		// creating Firefox profile object
		FirefoxProfile Profile = new FirefoxProfile();
		
		// Set preference to not to show file download confirmation dialog using

		Profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/plain,application/zip");  // set MIME types :  https://www.sitepoint.com/mime-types-complete-list/
		Profile.setPreference("browser.download.manager.showWhenStarting", false);
        Profile.setPreference("pdfjs.disabled",true);  // only for pdf file

		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(Profile);

		WebDriver driver = new FirefoxDriver(option);

		driver.get("http://demo.automationtesting.in/FileDownload.html");

		driver.findElement(By.id("textbox")).sendKeys("Testing");
		driver.findElement(By.id("createTxt")).click();  // generate txt files
		driver.findElement(By.id("link-to-download")).click(); // display download and click

		driver.findElement(By.xpath(" //textarea[@id='pdfbox']")).sendKeys("Testing");
		driver.findElement(By.xpath("//button[@id='createPdf']")).click();  // generate pdf file
		driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click(); // display download and click


	}

}
