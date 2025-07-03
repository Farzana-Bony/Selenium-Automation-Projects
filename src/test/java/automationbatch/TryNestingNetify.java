package automationbatch;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TryNestingNetify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    //Initialize
		
		  WebDriverManager.chromedriver().setup();
			
		  WebDriver driver = new ChromeDriver();
		
		  driver.get("https://trytestingthis.netlify.app/");
		  
		  driver.manage().window().maximize();
		  
//		  driver.findElement(By.cssSelector("#fname")).sendKeys("Mina");
//		  
//		  driver.findElement(By.cssSelector("#lname")).sendKeys("Rima");
//		  
//	//radio button
//		  WebElement radioButton = driver.findElement(By.id("female"));
//		  
//		  radioButton.click();
//		  
//		  assert radioButton.isSelected();
//		  
//		  System.out.println("Selected radio option : " + radioButton.isSelected());
//	
//    //Static dropdown
//		  
//	      // Locate the dropdown element
//	      WebElement dropdown = driver.findElement(By.id("option")); 
//	      
//	      // Create Select instance
//	      Select options = new Select(dropdown);
//
//	      // Select by visible text
//	      options.selectByVisibleText("Option 2");
//	      
//	      // Optional: Verify selection
//	        WebElement selectedOption = options.getFirstSelectedOption();  //It returns the first selected option in the dropdown
//	        System.out.println("Selected dropdown option: " + selectedOption.getText());
//		  
//	 //dropdown	  
//	        
//		   // Locate the dropdown element
//		   WebElement dropdown1 = driver.findElement(By.id("owc")); 
//		   
//		   // Create Select instance
//		   Select options1 = new Select(dropdown1);
//		   
//		   // Select by visible text
//		   options1.selectByVisibleText("Option 1");
//		   
//		    // Optional: Verify selection
//	        WebElement selectedOption1 = options1.getFirstSelectedOption();  //It returns the first selected option in the dropdown
//	        System.out.println("Selected dropdown1 option: " + selectedOption1.getText());
//	        
// 
//		  
//	//Checkbox
//       WebElement checkboxBtn = driver.findElement(By.xpath("(//input[@id='moption'])[1]"));   // Locate checkboxes by Xpath using index
//       //WebElement checkboxBtn = driver.findElement(By.name("option1"));
//       checkboxBtn.click();
//       
//       
//       WebElement checkboxBtn1 = driver.findElement(By.xpath("(//input[@id='moption'])[3]"));   // Locate checkboxes by Xpath using index
//       //WebElement checkboxBtn1 = driver.findElement(By.name("option3"));
//       checkboxBtn1.click();
//
//		  
//		 assert checkboxBtn.isSelected();
//		 assert checkboxBtn1.isSelected();
//		 
//			  
//		// Confirm they are checked
//		   System.out.println("Checkbox 1 selected: " + checkboxBtn.isSelected());
//		   System.out.println("Checkbox 3 selected: " + checkboxBtn1.isSelected());
		 
		 
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	Thread.sleep(3000);
	
	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	
	  System.out.println();
	  
	  System.out.println("Another website : https://rahulshettyacademy.com/dropdownsPractise/ ");
	  
	  System.out.println();
	
	//radio button
	  WebElement radioButton1 = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2"));
	  
	  radioButton1.click();
	  
	  assert radioButton1.isSelected();
	  
	  System.out.println("Selected radio option from another website : " + radioButton1.isSelected());
	  
	  //Check for information popup
      try {
          driver.findElement(By.id("MultiCityModelAlert")).click();
          System.out.println("Information Popup is visible");
      } catch (Exception e) {
          System.out.println("Information Popup not found.");
      }
      
      Thread.sleep(3000);
    
      
      //one way
	  WebElement radioButton2 = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
	  
	  radioButton2.click();
	  
	  assert radioButton2.isSelected();
	  
	 //dynamic dropdown
	  
      // Locate the dropdown element
      driver.findElement(By.id("divpaxinfo")).click();
      
      int i = 0;
       
      while(i<4)
      {
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    	  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("hrefIncAdt")));
    	  WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("hrefIncInf")));
    	  element.click();
    	  element1.click();
    	  i++;
      }
      
      Thread.sleep(3000);
      
      driver.findElement(By.id("hrefDecInf")).click();
      
      Thread.sleep(3000);
      
      driver.findElement(By.id("btnclosepaxoption")).click();
      
      
      //Auto Suggestion Dropdown
      
      driver.findElement(By.id("autosuggest")).sendKeys("Ban");
      
    //Working with index  
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      WebElement item = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='ui-menu-item'][2]")));
      item.click();
      
      
      
////Not working     
//      
//      List<WebElement> suggestions = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//      
// 
//      for(WebElement suggestion : suggestions)
//      {
//    	  System.out.println("selected Option : " + suggestion.getText());
//    	  if(suggestion.getText().equalsIgnoreCase("Bangladesh"))
//    	  {
//    		  System.out.println("selected Option : " + suggestion.getText());
//    		  suggestion.click();
//    		  break;
//    	  }
//    	  
//      }
      
      
      
      
      
 
	  
	  
	  
	
	
		  
		  
		  
		  
		  

	}

}
