package takeScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class byEventFireingWebDriverClass {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		
		  EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
		
		  File src = efwd.getScreenshotAs(OutputType.FILE);
		   
		 File  dest = new File("./screenshots/instagram.jpg");
		 
		   Files.copy(src, dest);
	}

}