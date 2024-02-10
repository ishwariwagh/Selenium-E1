package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClickMethod {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
	     Actions act = new Actions(driver);
        WebElement button = driver.findElement(By.xpath("//section[text()='Button']"));
        act.click(button).perform();
        
      WebElement Rightclick = driver.findElement(By.partialLinkText("Right Click"));
      act.click(Rightclick).perform();
      
     WebElement BT1 = driver.findElement(By.xpath("//button[@id='btn30']"));
     act.contextClick(BT1).perform();
     
      WebElement BToption = driver.findElement(By.xpath("//div[text()='Yes']"));
      act.click(BToption).perform();
      
      WebElement BT2 = driver.findElement(By.xpath("//button[@id='btn31']"));
      act.contextClick(BT2).perform();
      
      WebElement BT2option = driver.findElement(By.xpath("//div[text()='No']"));
      act.click(BT2option).perform();
      
       
      WebElement BT3= driver.findElement(By.xpath("//button[@id='btn32']"));
      act.contextClick(BT3).perform();
             
      WebElement BT3option = driver.findElement(By.xpath("//div[text()='5']"));
      act.click(BT3option).perform();
	}

}
