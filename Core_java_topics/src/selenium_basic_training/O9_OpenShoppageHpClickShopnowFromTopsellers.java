package selenium_basic_training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class O9_OpenShoppageHpClickShopnowFromTopsellers {
	
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
      js.executeScript("window.scrollBy(0, 600)");
      Thread.sleep(1000);

      
      for(int i =3; i<=8; i++)
      {
          Thread.sleep(1000);
          js.executeScript("window.scrollBy(0, 200)");
          Thread.sleep(1000);
          //find the shop link. 
          WebElement shoplink = driver.findElement(By.xpath("(//a[@href='/shop'])["+i+"]"));
         // (//a[@href='/shop'])[3]
        //a[@href='/our-story']
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          
          shoplink.click();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          
          String actualShopUrl = driver.getCurrentUrl();
          System.out.println(actualShopUrl);
          
          Thread.sleep(1000);
          driver.navigate().back();
          Thread.sleep(1000);
      }
      

      
      
      String expectedShopUrl = "";
      
      Thread.sleep(5000);
      driver.quit();
	}

}
