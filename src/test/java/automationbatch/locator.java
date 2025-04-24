package automationbatch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locator {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
    //Initialize
		
	WebDriverManager.firefoxdriver().setup();
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	////  find element by id locator
//	driver.findElement(By.id("user-name")).sendKeys("standard_user");	
//	driver.findElement(By.id("password")).sendKeys("secret_sauce");
//	driver.findElement(By.id("login-button")).click();
	
	
	////find element by name locator
//	driver.findElement(By.name("user-name")).sendKeys("standard_user");	
//	driver.findElement(By.name("password")).sendKeys("secret_sauce");
//	driver.findElement(By.name("login-button")).click();

	
	////  find element by class name locator
//	driver.findElement(By.className("input_error")).sendKeys("standard_user");	//take first portion class name
//	driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
//	driver.findElement(By.className("btn_action")).click();  // take second portion class name

	
	////  find element by link text locator
//	driver.switchTo().newWindow(WindowType.TAB);
//	driver.get("https://rahulshettyacademy.com/locatorspractice/");
//	Thread.sleep(2000);
//	
//	driver.findElement(By.linkText("Forgot your password?")).click();
//	Thread.sleep(2000);
//	
//	driver.quit();
	
	
	////  find element by partial text locator
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	Thread.sleep(2000);

	driver.findElement(By.partialLinkText("Forgot your")).click();
	Thread.sleep(2000);
	
	driver.quit();
	
	
     }
	
}
