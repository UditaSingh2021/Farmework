package DataRead;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	private static WebDriver driver;
	@DataProvider(name="Authentication")
	public static Object[][] credentials(){
		return new Object[][] {{"test_1","Test123"},{"test_1","Test123"}};
		
	}
		// Here we are calling the Data Provider object with its Name
		 
		  @Test(dataProvider = "Authentication")
		 
		  public void test(String sUsername, String sPassword) {
		 
		      driver = new ChromeDriver();
		 
		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		      driver.get("https://www.store.demoqa.com");
		 
		      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		 
		      // Argument passed will be used here as String Variable
		 
		      driver.findElement(By.id("log")).sendKeys(sUsername);
		 
		      driver.findElement(By.id("pwd")).sendKeys(sPassword);
		 
		      driver.findElement(By.id("login")).click();
		 
		      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
		 
		      driver.quit();
		 
}
}