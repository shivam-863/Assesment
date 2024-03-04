package assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class demoqa {
	public static void main(String[] args) {
		
		
		String url ="https://demoqa.com/webtables";
		WebDriver driver = driverchrome.getDriver(url);
		
		WebElement edit = driver.findElement(By.linkText(" "));
		edit.click();
	}

}
