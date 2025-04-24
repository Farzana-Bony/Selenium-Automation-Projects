package automationbatch;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Initialize
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");

		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.className("submit-button")).click();
		
		Thread.sleep(5000);
		
		
	    // Print the title after the login
	    String pageTitle = driver.getTitle();
	    System.out.println("Page Title After Login: " + pageTitle);
	    
	    Thread.sleep(3000);
	    
	    //Close the browser
	    driver.quit();

	}

}
