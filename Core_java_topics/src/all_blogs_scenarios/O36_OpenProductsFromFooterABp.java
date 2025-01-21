package all_blogs_scenarios;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class O36_OpenProductsFromFooterABp {
	
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
      driver.get("http://localhost:5173/all-blogs");
//      driver.get("http://localhost:5173/");
//      driver.get("http://localhost:5173/home");
//      driver.get("http://localhost:5173/homepage");    not working.
      
      String homePageHandle = driver.getWindowHandle();
      System.out.println("Homepage Window Handle: " + homePageHandle);
      
      String actualUrl = driver.getCurrentUrl();
      System.out.println(actualUrl);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      JavascriptExecutor js = (JavascriptExecutor) driver;

    
          Thread.sleep(1000);
          js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
          Thread.sleep(1000);
          
          //find the Products link. 
        	 WebElement Products =  driver.findElement(By.xpath("//a[normalize-space()='Products']"));
        	 Products.click();
        	 Thread.sleep(1000);
        	 
        	 Set<String> windowHandles = driver.getWindowHandles();
        	 
             List<String> windowHandlesList = new ArrayList<String>(windowHandles);
        	 
             for (String windowHandle : windowHandlesList) {
                 driver.switchTo().window(windowHandle);
                 System.out.println("windown number" + windowHandle);
                 System.out.println("Window Title: " + driver.getTitle());
                 System.out.println("Window URL: " + driver.getCurrentUrl());
                 System.out.println("*********************************************");
             }
        	 
        	 System.out.println("title of homepage page"+ driver.getTitle());
        	 Thread.sleep(1000);
        	 
        	    driver.switchTo().window(homePageHandle);
                System.out.println("Switched back to homepage.");
                System.out.println("Title of Home Page: " + driver.getTitle());
          
      Thread.sleep(5000);
      driver.quit();
	}
}
