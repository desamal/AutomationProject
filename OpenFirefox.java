package ra.edge.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://news.google.com");

	}

}
