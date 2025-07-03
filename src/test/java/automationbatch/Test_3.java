package automationbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
    //Initialize	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	
	// Store the main window handle - Google
	String mainWindowHandle = driver.getWindowHandle();
	
	//Print the title of the main window
    String pageTitle = driver.getTitle();
    System.out.println("Page Title Of The Main Window: " + pageTitle);
    
	//Open a new tab and switch it
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.bing.com");
	Thread.sleep(2000);
	
	
	//Print the title of the new window
    String pageTitle1 = driver.getTitle();
    System.out.println("Page Title Of The New Window: " + pageTitle1);
	
    //Close the new window
    driver.close();
    
    //Switch back to the main Google window
    driver.switchTo().window(mainWindowHandle);
    Thread.sleep(2000);
    
    String pageTitle2 = driver.getTitle();
    System.out.println("Page Title Of The Main Window Again To Confirm The Switch.: " + pageTitle2);
    
    //close the browser
    driver.quit();

}
}