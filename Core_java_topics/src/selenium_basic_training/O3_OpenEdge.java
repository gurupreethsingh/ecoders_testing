package selenium_basic_training;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class O3_OpenEdge {

	public static void main(String[] args)
	{
      try
      {
    	 // open chrome browser.
        WebDriver driver = new EdgeDriver();  
        System.out.println("Edge browser opened successfully.");
        
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