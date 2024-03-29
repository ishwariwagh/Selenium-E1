package takeScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class byDowncasting {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		RemoteWebDriver nwd =(RemoteWebDriver)driver;
		File src = nwd.getScreenshotAs(OutputType.FILE);
		
		 File dest = new File("./screenshots/Flipkart.jpg");
		 
		 Files.copy(src, dest);
		
		
		
		

	}

}
