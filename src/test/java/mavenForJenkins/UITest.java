package mavenForJenkins;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UITest {

	WebDriver driver;
	@Parameters("Browser")
	
	@Test
	public void uiSampleTest(String BrowserName)
	{
		
		System.out.println("Parameter value is "+BrowserName);
		if (BrowserName.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else 
		{
			driver = new ChromeDriver();
		}
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		Assert.assertEquals(title, "Google");
	}
	
	
}
