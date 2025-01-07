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

public class OpenHomopageClickHomelink implements AutomationConstantsBlogs
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
				WebElement homelink = driver.findElement(By.xpath("//a[@href='/home']"));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				homelink.click();
				// you will be in homepage
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String homepageAcutalUrl = driver.getCurrentUrl();
				System.out.println("homepage title : "+homepageAcutalUrl  );
				
				 String homepageExpectedUrl = "http://localhost:5173/home";
				 
				 if(homepageAcutalUrl .equals(homepageExpectedUrl))
	        	 {
	        		 System.out.println("Homepage url is matched, test case passed");
	        	 }
	        	 else
	        	 {
	        		 System.out.println("Homepage url didnt matched, Test case failed. Screenshot saved");
				    	TakesScreenshot ts   = (TakesScreenshot)driver; 
				    	File ramlocation = ts.getScreenshotAs(OutputType.FILE);
				    	File hardDiskLocation =new File(screenshotFolder +"/hompage_title_failedscreenshot.jpg");
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
