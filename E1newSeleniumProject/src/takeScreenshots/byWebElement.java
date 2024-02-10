package takeScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class byWebElement {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[text()='Log in']"));

		File src =loginbutton.getScreenshotAs(OutputType.FILE);
		
		 File dest = new File("./screenshots/facebook LOginButton.png");
		 
		 Files.copy(src, dest);
		

	}

}
