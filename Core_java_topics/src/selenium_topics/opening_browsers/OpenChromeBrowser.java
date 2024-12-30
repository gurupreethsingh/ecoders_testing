package selenium_topics.opening_browsers;

import java.time.Duration;

public class OpenChromeBrowser {

	public static void main(String[] args) 
	{
		WebDriver driver; // global
		try
		{
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// open web page. 
			driver.get("urlOfApplication");
			// implicit wait. 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			String actualTitle = driver.getTitle();
			System.out.println("Actual title is \n" + actualTitle);
			
			// after fecthing the title compare it with the expectedTitle 
			String expectedTitle = Excel.getData("Sheet1" , 0 , 0);
			
			// compare title. 
			if(actualTitle.equals(expectedTitle))
			{
				System.out.println("Test case passed. Title is matching");
			}
			else
			{
				System.out.println("Test case failed. Title is not matching");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}