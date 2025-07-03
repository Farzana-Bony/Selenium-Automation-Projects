package automationbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    //Initialize
		
		  WebDriverManager.chromedriver().setup();
			
		  WebDriver driver = new ChromeDriver();
		
		  driver.get("https://trytestingthis.netlify.app/");
		  
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.cssSelector("#fname")).sendKeys("John");
		  
		  driver.findElement(By.cssSelector("#lname")).sendKeys("Doe");
		  
		//radio button
		  WebElement radioButton = driver.findElement(By.id("female"));
		  
		  radioButton.click();
		  
		  assert radioButton.isSelected();
		  
		  System.out.println("Selected radio button : " + radioButton.isSelected());
		  
	   //static dropdown
		  
	      // Locate the dropdown element
	      WebElement dropdown = driver.findElement(By.id("option")); 
	      
	      // Create Select instance
	      Select select = new Select(dropdown);

	      // Select by visible text
	      select.selectByVisibleText("Option 2");
	      
	      // Optional: Verify selection
	        WebElement selectedOption = select.getFirstSelectedOption();  //It returns the first selected option in the dropdown
	        System.out.println("Selected dropdown option: " + selectedOption.getText());
	    
	   	 //dropdown1	  
	        
			   // Locate the dropdown element
			   WebElement dropdown1 = driver.findElement(By.id("owc")); 
			   
			   // Create Select instance
			   Select options1 = new Select(dropdown1);
			   
			   // Select by visible text
			   options1.selectByVisibleText("Option 1");
			   
			    // Optional: Verify selection
		        WebElement selectedOption1 = options1.getFirstSelectedOption();  //It returns the first selected option in the dropdown
		        System.out.println("Selected dropdown1 option: " + selectedOption1.getText());
		  
		 
	  //checkbox - multiple
         
	        
	    // Locate checkboxes
	       //WebElement checkbox1 = driver.findElement(By.name("option1"));
	       WebElement checkbox1 = driver.findElement(By.xpath("(//input[@id='moption'])[1]")); 
	       checkbox1.click();
	     
	     
	       //WebElement checkbox3 = driver.findElement(By.name("option3"));
	       WebElement checkbox3 = driver.findElement(By.xpath("(//input[@id='moption'])[3]"));
	       checkbox3.click();
		 
	       Thread.sleep(3000);
	        
	 	   assert checkbox1.isSelected();
	 	   assert checkbox3.isSelected();
		  
	    // Confirm they are checked
	        System.out.println("Checkbox 1 selected: " + checkbox1.isSelected());
	        System.out.println("Checkbox 3 selected: " + checkbox3.isSelected());
		  
		  
		// Pick a Date

	        // Locate the date input
	        WebElement dateInput = driver.findElement(By.id("day"));

	        // Set a date
	        dateInput.sendKeys("04/29/2025");

	        // Optional: Confirm the date is set
	        String selectedDate = dateInput.getAttribute("value"); //it returns the selected date string (e.g., "YYYY-MM-DD").
	        System.out.println("Selected date: " + selectedDate);
	        
       //Upload a File
	      
	        // Locate the file input element
	        WebElement uploadElement = driver.findElement(By.id("myfile"));

	        // Set the file path (must be absolute)
	        String filePath = "C:\\Users\\tasni\\OneDrive\\Pictures\\profile.jpg";
	        uploadElement.sendKeys(filePath);

	        // Optional: Verify file was attached
	        String uploadedFile = uploadElement.getAttribute("value");   // 'value' typically contains the path of the uploaded file.
	        System.out.println("Uploaded file path: " + uploadedFile);  // due to security, it may only show the file name, not the full path 

		 //Enter a Long Message
	        
	        // Locate the textarea
	        WebElement messageBox = driver.findElement(By.name("message"));
	        messageBox.clear();

	        // Enter a long message (100+ characters)
	        messageBox.sendKeys("This is a sample message used to test text area input in Selenium automation. It should be long enough to validate.");

	        // Optional: Print entered value (if needed)
	        System.out.println("Entered message: " + messageBox.getAttribute("value"));
	        
	        Thread.sleep(3000);
 
		//Click Submit button
	        
	        // Click submit button
	        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-success"));
	        submitButton.click();
	        
	        Thread.sleep(3000);
	        
	     //Optional: Check for confirmation message
	        try {
	            WebElement confirmation = driver.findElement(By.id("confirmationMessage")); 
	            System.out.println("Form submitted successfully: " + confirmation.getText());
	        } catch (Exception e) {
	            System.out.println("Confirmation message not found.");
	        }
	        
	        
	        

	}

}
