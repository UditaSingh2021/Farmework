import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {


WebDriver driver;

@BeforeMethod
public void Setup()
{
	String Projectpath=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver","C:/Users/user/eclipse-workspace/TestNG_Framework/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://signup.ebay.com/pa/crte?");
}

}
