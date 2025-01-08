package selenium_basic_training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class O4_OpenBlogsFromHp {
	
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
      
      //find the shop link. 
      WebElement allBlogsLink = driver.findElement(By.xpath("//a[@href='/all-blogs']"));
    //a[@href='/our-story']
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      allBlogsLink.click();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      String actualAllBlogsUrl = driver.getCurrentUrl();
      System.out.println(actualAllBlogsUrl);
      
      String expectedUrl = "";
      
      Thread.sleep(5000);
      driver.quit();
	}

}
