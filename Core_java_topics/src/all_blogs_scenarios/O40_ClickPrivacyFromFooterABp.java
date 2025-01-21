package all_blogs_scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class O40_ClickPrivacyFromFooterABp {
	
	public static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException
	{
		// open chrome browser.
  	  driver = new ChromeDriver();  
      System.out.println("Chrome browser opened successfully.");
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      // maximize the window. 
      driver.manage().window().maximize();
      
      // go to all blogs page 
      driver.get("http://localhost:5173/all-blogs");
//      driver.get("http://localhost:5173/");
//      driver.get("http://localhost:5173/home");
//      driver.get("http://localhost:5173/homepage");    not working.
      
      String actualUrl = driver.getCurrentUrl();
      System.out.println(actualUrl);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      JavascriptExecutor js = (JavascriptExecutor) driver;

    
          Thread.sleep(1000);
          js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
          Thread.sleep(1000);
          //find the  privacy link. 
        	 WebElement privacy =  driver.findElement(By.xpath("//a[@href='/privacy-policy']"));
        	privacy.click();
        	 System.out.println(privacy );
        	 System.out.println("\n*******************************************************\n");
        	 Thread.sleep(500);
          
      Thread.sleep(5000);
      driver.quit();
	}

}
