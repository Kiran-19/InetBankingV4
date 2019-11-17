package headless;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessHTMLUnitDriver {

	public static void main(String[] args) {

		HtmlUnitDriver driver = new HtmlUnitDriver();

		driver.get("https://demo.nopcommerce.com/");

		System.out.println("Title of the page:" + driver.getTitle());
		System.out.println("Title of the page:" + driver.getCurrentUrl());

	}

}
