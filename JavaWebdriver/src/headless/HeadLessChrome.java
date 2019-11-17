package headless;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C://Users//KIRAN//Downloads//Eclipse//chromedriver_win32//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		// options.setHeadless(true);
		options.addArguments("--headless");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://demo.nopcommerce.com/");

		System.out.println("Title of the page:" + driver.getTitle());


	}

}
