package automationbatch;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandlerPractise {
	
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
 //Initialize
			
//	  WebDriverManager.chromedriver().setup();
//		
//	  WebDriver driver = new ChromeDriver();
//	  
//	  driver.get("https://rahulshettyacademy.com/locatorspractice/");  
//	  
//	  driver.findElement(By.xpath("//button[starts-with(@id,'visitUs')]")).click();
//	  Thread.sleep(5000);
//	  
//	  String pageTitle = driver.getTitle();
//	  System.out.println("Page Title: " + pageTitle);
//	  
//	  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//	  driver.switchTo().window(tabs.get(1));
//	  
//	  driver.close();
//	  
//	  driver.switchTo().window(tabs.get(0));
//	  
//	  Thread.sleep(3000);
//	  
//	  driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("secret_sauce");
//	  
//	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("sauce");
//	  
//	  driver.findElement(By.xpath("//button[@type='submit']")).click();
//	  
//	  Thread.sleep(3000);
//	  
//	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	  WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated
//	  		 (By.xpath("//p[text()='* Incorrect username or password']")));
//	   System.out.println(errorMsg.getText());
//	   
//	   Thread.sleep(2000);
//	  
//	   driver.quit();
	   
//////////////////////////////////
		
 //Initialize
		
		  WebDriverManager.chromedriver().setup();
			
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.saucedemo.com/");  
	   
	     //find element by Relative path using partial text
		  driver.switchTo().newWindow(WindowType.TAB);
		  driver.get("https://rahulshettyacademy.com/locatorspractice/");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//button[starts-with(@id,'visitUs')]")).click();
		  Thread.sleep(5000);
		  
		  String pageTitle = driver.getTitle();
		  System.out.println("Page Title: " + pageTitle);
		  
		  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(2));
		  
		  driver.close();

	}

}
