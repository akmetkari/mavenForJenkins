package mavenForJenkins;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UITest {

	@Test
	public void uiSampleTest()
	{
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		Assert.assertEquals(title, "Google");
	}
	
	
}
