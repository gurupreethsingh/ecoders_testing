package selenium_basic_training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class O7_OpenMyAccountFromHp {
	
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
      WebElement MyAccountLink = driver.findElement(By.xpath("(//button)[1]"));
     // (//button)[1]
    //a[@href='/our-story']
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      MyAccountLink.click();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      // no user , go to login page. 
      
      String loginpageUrl = driver.getCurrentUrl();
      System.out.println(loginpageUrl);
      
      // if user is already logged in. 
//      String dashboardpageUrl = driver.getCurrentUrl();
//      System.out.println(dashboardpageUrl);
      
      String expectedUrl = "";
      
      Thread.sleep(5000);
      driver.quit();
	}

}
