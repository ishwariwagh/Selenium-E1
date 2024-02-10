package takeScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class byExplicitTypecasting {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		  File src = ts.getScreenshotAs(OutputType.FILE);
		   
		 File  dest = new File("./screenshots/google.com.jpg");
		 
		   Files.copy(src, dest);
	
		
		

	}

}
