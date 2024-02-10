package syncronized;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
       WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
       
       driver.get("https://www.shoppersstack.com/");
       
      driver.findElement(By.xpath("//spam[text()='APPLE iPhone 14 Pro'}")).click();
      
      driver.findElement(By.id("Cheak Delivery")).sendKeys("411103");
      
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='check']")));
      driver.findElement(By.xpath("//button[@id='check']")).click();
	}

}
