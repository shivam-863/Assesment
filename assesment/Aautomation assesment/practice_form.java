package assesment;


	import java.util.List;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

	public class practice_form {

		private static Object Js;

		public static void main(String[] args) throws InterruptedException {
			String url = "https://demoqa.com/automation-practice-form";
			WebDriver driver = driverchrome.getDriver(url);
			WebElement FName = driver.findElement(By.id("firstName"));
			FName.sendKeys("Shivam");
			driver.findElement(By.id("lastName")).sendKeys("Shivam");
			driver.findElement(By.id("userEmail")).sendKeys("shivampatel863@gmail.com");
			driver.findElement(By.id("userNumber")).sendKeys("94728842525");
			
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement OpenCalander = driver.findElement(By.className("react-datepicker__input-container"));
	//		WebElement address= driver.findElement(By.id("currentAddress"));
         	js.executeScript("arguments[0].scrollIntoView();", OpenCalander);

			
	//GENDER   SECTION LEFT
			driver.findElement(By.xpath("//div[@id='genterWrapper']/div[2]/div[1]")).click();
			driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[2]")).click();
			driver.findElement(By.id("currentAddress")).sendKeys("M.M University");	
			//DOB
			
			OpenCalander.click();		
			Thread.sleep(2000);
			
			WebElement DropDownYear = driver.findElement(By.className("react-datepicker__year-select"));
			DropDownYear.click();
			Select yearselect =new Select(DropDownYear);
			yearselect.selectByVisibleText("2021");
			
			WebElement DropDownMonth = driver.findElement(By.className("react-datepicker__month-select"));
			DropDownMonth.click();
			Select monthselect =new Select(DropDownMonth);
			monthselect.selectByVisibleText("June");
			
			
			List<WebElement> dates = driver.findElements(By.xpath("//div[@class='react-datepicker']/div[2]/div[2]/div/div"));
			System.out.println(dates.size());
			for(WebElement date:dates) {
				if(date.getText().equals("18")) {
					date.click();	
				}
			}	
	//CURRENT ADDRESS
//			driver.findElement(By.id("currentAddress")).sendKeys("M.M University");	
	//
//			WebElement DropState = driver.findElement(By.id("stateCity-wrapper"));
//			DropState.click();
//			Select State =new Select(DropState);
//			State.selectByVisibleText("Haryana");
//			WebElement Dropcity = driver.findElement(By.className(""));
//			Dropcity.click();
//			Select City  =new Select(Dropcity);
//			City.selectByVisibleText("Karnal");
			
		
			Thread.sleep(2000);
			//driver.quit();
		}
		

	}


