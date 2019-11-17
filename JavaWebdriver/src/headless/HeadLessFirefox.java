package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessFirefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C://Users//KIRAN//Downloads//Eclipse//geckodriver-v0.24.0-win64//geckodriver.exe");

		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		// options.addArguments("--headless");

		WebDriver driver = new FirefoxDriver(options);

		driver.get("https://demo.nopcommerce.com/");

		System.out.println("Title of the page:" + driver.getTitle());


	}

}
