package all_blogs_scenarios;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class O2_OpenHomepageClickLogoFromAllBlogs implements AutomationConstantsBlogs
{
	public static WebDriver driver;   // global variable.
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		String rootFolder = System.getProperty("user.dir");
		String screenshotFolder = rootFolder+"/failed_screenshots";
		
		try
		{
			// open the chrome browser. 
		    driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.manage().window().maximize();
		    
		    // enter the url of the application. 
		    driver.get(urlOfApplication);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    // get the title of the page. 
		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    
		    // expected title 
		    String expectedTitle = "All Blogs - Bonmillette";
		    

		         if(actualTitle.equals(expectedTitle))
		         {
		        	 System.out.println("Title matched, Test case passed.");
		        	 // find the logo and click on that. 
		        	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        	 WebElement logo = driver.findElement(By.xpath("//img[@class='w-20 h-20']"));
		        	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        	 logo.click();
		        	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        	 
		        	 // here in homepage , match the title of homepage. if not take screenshot. 
		        	 String homepageAcutalTitle = driver.getTitle();
		        	 String homepageExpectedTitle = "Homepage - Bonmillette";
		        	 
		        	 if(homepageAcutalTitle.equals(homepageExpectedTitle))
		        	 {
		        		 System.out.println("Homepage title is matched, test case passed");
		        	 }
		        	 else
		        	 {
		        		 System.out.println("Homepage Title didnt matched, Test case failed. Screenshot saved");
					    	TakesScreenshot ts   = (TakesScreenshot)driver; 
					    	File ramlocation = ts.getScreenshotAs(OutputType.FILE);
					    	File hardDiskLocation =new File(screenshotFolder +"/hompage_title_failedscreenshot.jpg");
					    	Files.copy(ramlocation, hardDiskLocation);
		        	 }
		        	 
		         }
		         else
		         {
		        	 System.out.println("Title didnt matched, Test case failed. Screenshot saved");
			    	TakesScreenshot ts   = (TakesScreenshot)driver; 
			    	File ramlocation = ts.getScreenshotAs(OutputType.FILE);
			    	File hardDiskLocation =new File(screenshotFolder +"/all_blogs_title.jpg");
			    	Files.copy(ramlocation, hardDiskLocation);
			    	
		         }
		    
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
	    	
		}
	   
	    // make the program sleep for 5 mins. 
	    Thread.sleep(5000); 
	    // close the browser. 
	    driver.quit();
	    
	}
}
