package downloadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadZipFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://Users//KIRAN//Downloads//Eclipse//geckodriver-v0.24.0-win64//geckodriver.exe");

		// creating Firefox profile object
		FirefoxProfile Profile = new FirefoxProfile();
		// Set preference to not to show file download confirmation dialog using

		Profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");  // set MIME types :  https://www.sitepoint.com/mime-types-complete-list/
		Profile.setPreference("browser.download.manager.showWhenStarting", false);


		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(Profile);

		WebDriver driver = new FirefoxDriver(option);

		driver.get("http://testingmasters.com/student-corner/downloads/");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id=\"tablepress-7\"]/tbody/tr[1]/td[5]/a")).click();


	}

}
