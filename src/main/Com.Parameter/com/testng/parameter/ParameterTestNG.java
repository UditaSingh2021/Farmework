package com.testng.parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNG {
	WebDriver driver;
	@Test
	@Parameters({"url","username"})
	public void parametertest(String url,String username) {
		String Projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",Projectpath+"src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys(username);
		driver.findElement(By.id("login-signin")).click();
		
		
	}
	
}
