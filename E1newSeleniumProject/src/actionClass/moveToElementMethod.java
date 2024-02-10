package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class moveToElementMethod {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
	     Actions act = new Actions(driver);
       
      WebElement homeandfurniture = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
      act.moveToElement(homeandfurniture).perform();
             
              
      
        
	}

}
