package selenium_basic_training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class O30_GetSnackTextFromFooterHp {
	
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

    
          Thread.sleep(1000);
          js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
          Thread.sleep(1000);
          //find the shop link. 
        	 String smartSnackText =  driver.findElement(By.xpath("//p[@class='font-bold text-xl']")).getText();
        	 System.out.println(smartSnackText );
        	 System.out.println("\n*******************************************************\n");
        	 Thread.sleep(500);
          
      Thread.sleep(5000);
      driver.quit();
	}

}
