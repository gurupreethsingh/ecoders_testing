package shilpa_javacoding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class O13_OurVisionSectionAllTextsHp {
	
	public static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException
	{
		// open chrome browser.
  	  driver = new ChromeDriver();  
      System.out.println("Chrome browser opened successfully.");
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      // maximize the window. 
      driver.manage().window().maximize();
      
      // go to homepage 
      driver.get("http://localhost:5173");
//      driver.get("http://localhost:5173/");
//      driver.get("http://localhost:5173/home");
//      driver.get("http://localhost:5173/homepage");    not working.
      
      String actualUrl = driver.getCurrentUrl();
      System.out.println(actualUrl);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      JavascriptExecutor js = (JavascriptExecutor) driver;
      
   // Scroll to a specific element
      WebElement OurVision = driver.findElement(By.xpath("(//p)[28]"));
      
          Thread.sleep(1000);
          js.executeScript("arguments[0].scrollIntoView(true)",   OurVision  );
          Thread.sleep(1000);
          //find the shop link. 

          int paranumber=1;
          for(int i = 28; i<= 31; i++)
          {
        	 
        	 String OurVisionSectionTexts =  driver.findElement(By.xpath("(//p)["+i+"]")).getText();
        	 System.out.println(paranumber +" :: " + OurVisionSectionTexts);
        	 paranumber++;
        	 System.out.println("\n*******************************************************\n");
        	 Thread.sleep(500);
          }    
          Thread.sleep(5000);
          driver.quit();
	}
}
