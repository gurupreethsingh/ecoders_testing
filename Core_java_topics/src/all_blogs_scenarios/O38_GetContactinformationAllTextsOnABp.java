package all_blogs_scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class O38_GetContactinformationAllTextsOnABp {
	
	public static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException
	{
		// open chrome browser.
  	  driver = new ChromeDriver();  
      System.out.println("Chrome browser opened successfully.");
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      // maximize the window. 
      driver.manage().window().maximize();
      
      // go to all-blogs page 
      driver.get("http://localhost:5173/all-blogs");
//      driver.get("http://localhost:5173/");
//      driver.get("http://localhost:5173/home");
//      driver.get("http://localhost:5173/homepage");    not working.
      
      String actualUrl = driver.getCurrentUrl();
      System.out.println(actualUrl);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      JavascriptExecutor js = (JavascriptExecutor) driver;
      
   // Scroll to a specific element
      driver.findElement(By.xpath("//input[@placeholder='Search blogs...']")).sendKeys("Millet");
      //driver.findElement(By.xpath("//*[local-name()='svg' and @ class=\"cursor-pointer text-blue-500\" ]"));
      String contactInformation = driver.findElement(By.xpath("//div[@class ='contact_information w-full md:w-1/3 text-center md:text-start']")).getText();
      System.out.println(contactInformation);
             
          
      Thread.sleep(5000);
      driver.quit();
	}

}
