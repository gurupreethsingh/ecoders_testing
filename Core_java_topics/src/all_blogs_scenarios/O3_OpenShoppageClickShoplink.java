package all_blogs_scenarios;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class O3_OpenShoppageClickShoplink implements AutomationConstantsBlogs
{
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		String rootFolder = System.getProperty("user.dir");
		String screenshotFolder = rootFolder+"/failed_screenshots";
		try
		{
			// open the browser. 
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			
			// go to the webpage.// open all blogs page
			driver.get(urlOfApplication);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			String actualTitle  =  driver.getTitle();
			System.out.println("Blog page tilte :" + actualTitle);
			String expectedTitle = "All Blogs - Bonmillette";
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			if(actualTitle.equals(expectedTitle))
			{
				// find the home link. 
				WebElement homelink = driver.findElement(By.xpath("//a[@href='/shop']"));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				homelink.click();
				// you will be in homepage
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String AcutalUrl = driver.getCurrentUrl();
				System.out.println("homepage title : "+ AcutalUrl  );
				
				 String ExpectedUrl = "http://localhost:5173/shop";
				 
				 if(AcutalUrl .equals(ExpectedUrl))
	        	 {
	        		 System.out.println("url is matched, test case passed");
	        	 }
	        	 else
	        	 {
	        		 System.out.println("url didnt matched, Test case failed. Screenshot saved");
				    	TakesScreenshot ts   = (TakesScreenshot)driver; 
				    	File ramlocation = ts.getScreenshotAs(OutputType.FILE);
				    	File hardDiskLocation =new File(screenshotFolder +"/url_failedscreenshot_shop.jpg");
				    	Files.copy(ramlocation, hardDiskLocation);
	        	 }
			}	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
           Thread.sleep(5000);
           driver.quit();
	}
}
