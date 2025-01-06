package selenium_basic_training;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class O2_OpenFirefox
{
	public static WebDriver driver;
	
	public static void main(String[] args)
	{
      try
      {
    	 // open chrome browser.
        driver = new FirefoxDriver();  
        System.out.println("Firefox browser opened successfully.");
        
        // make the program stop for 5 seconds. 
        Thread.sleep(5000);
        
        // close the browser. 
        driver.quit();
      }
      catch(Exception ex)
      {
    	  ex.printStackTrace();
    	  System.out.println("Unable to open browser");
      }
	}
}