package selenium_basic_training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class O8_OpenShoppageFromHpClickShopnowHeroSection {
	
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
      js.executeScript("window.scrollBy(0, 500)");
      Thread.sleep(1000);
      
      //find the shop link. 
      WebElement shoplink = driver.findElement(By.xpath("(//a[@href='/shop'])[2]"));
     // (//a[@href='/shop'])[3]
    //a[@href='/our-story']
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      shoplink.click();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      String actualShopUrl = driver.getCurrentUrl();
      System.out.println(actualShopUrl);
      
      String expectedShopUrl = "";
      
      Thread.sleep(5000);
      driver.quit();
	}

}
