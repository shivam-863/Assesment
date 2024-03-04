package assesment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverchrome {
	public static WebDriver getDriver(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		return driver;

	}

}
