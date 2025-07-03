package automationbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	    //Initialize
		
		  WebDriverManager.chromedriver().setup();
			
		  WebDriver driver = new ChromeDriver();
		
		  driver.get("https://www.saucedemo.com/");
		  
		  driver.manage().window().maximize();
		  
		//XPath (Relative) 
		  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		  
		//XPath (Relative) 
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		  
		//CSS Selector
		  driver.findElement(By.cssSelector("input#login-button")).click();
		  
		  Thread.sleep(3000);
		  
		  
		//CSS Selector
		  driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-bike-light")).click();
		  
		  //driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-fleece-jacket")).click();
		  //driver.findElement(By.cssSelector("button[id*='add-to-cart-test.allthethings()']")).click();
		  
		  Thread.sleep(3000);
		  
		//Full Absolute XPath
		  driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();

		  Thread.sleep(3000);
		  
		//CSS Selector
		  driver.findElement(By.cssSelector("#checkout")).click();
		  
		  Thread.sleep(3000);
		  
		//XPath (Relative) 
		  driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Mina");
		  
		//CSS Selector
		  driver.findElement(By.cssSelector("#last-name")).sendKeys("Rima");
		  
		//XPath (Relative) 
		  driver.findElement(By.xpath("//input[contains(@data-test,'postalCode')]")).sendKeys("12345");
		  		  
		//CSS Selector
		  driver.findElement(By.cssSelector("input#continue")).click();
		  
		  Thread.sleep(3000);
		  
		//XPath (Relative) 
		  driver.findElement(By.xpath("//button[@data-test='finish']")).click();
		  
		  Thread.sleep(3000);
		  
		//CSS Selector
		  driver.findElement(By.cssSelector("button#back-to-products")).click();
		  
		  Thread.sleep(3000);
		  
		  driver.quit();
		    
		  
	}

}
