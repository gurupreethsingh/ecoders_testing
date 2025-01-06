package selenium_basic_training;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class O1_OpenChrome
{
	
	O1_OpenChrome()
	{
		// default constructor.
		System.out.println("Running constructor");
	}
	public static WebDriver driver;  // global varaible. (static or non static)
	int a =10; // non static variable. 
	static int c = 30;// global static variable
	
	public static void main(String[] args)
	{
      int b =10;  // local varaible. cannot be make static or non static.
      try
      {
    	 // open chrome browser.
    	  driver = new ChromeDriver();  
        System.out.println("Chrome browser opened successfully.");
        
        // make the program stop for 5 seconds. 
        Thread.sleep(5000);
        
        // close the browser. 
        driver.quit();
        
        O1_OpenChrome c1 = new O1_OpenChrome();
        O1_OpenChrome c2 = new O1_OpenChrome();
        System.out.println(c1.a);
        System.out.println(c);
        System.out.println(b);
        
        System.out.println(c1);
        System.out.println(c2);
        
        System.out.println(c1.getClass());
      }
      catch(Exception ex)
      {
    	  ex.printStackTrace();
    	  System.out.println("Unable to open chrome");
      }
	}
}