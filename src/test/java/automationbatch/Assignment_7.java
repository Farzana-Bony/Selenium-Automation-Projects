package automationbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertFalse;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_7 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		  WebDriverManager.chromedriver().setup();
			
		  WebDriver driver = new ChromeDriver();
		
		  driver.get("https://www.saucedemo.com/");
		  
		  driver.manage().window().maximize();

		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.className("submit-button")).click();
		
		Thread.sleep(5000);
		
	// Verify that the URL contains "inventory" after login --- assertTrue
		assertTrue(driver.getCurrentUrl().contains("inventory"), "URL does not contain 'inventory' after login");
		
	// Verify the exact URL after login  --- assertEquals
		assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html", "URL after login is incorrect");
		
	// Ensure you're not still on the login page --- assertNotEquals
		assertNotEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/", "Still on the login page, login failed");
		
	// Make sure no error message like "do not match" is displayed --- assertFalse
		assertFalse(driver.getPageSource().contains("do not match"), "Error message - 'Do Not Match' is displayed after login");	
	}

}
