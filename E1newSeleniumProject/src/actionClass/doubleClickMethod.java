package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickMethod {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
	     Actions act = new Actions(driver);
	     WebElement button = driver.findElement(By.xpath("//section[text()='Button']"));
	     button.click();
	     driver.findElement(By.partialLinkText("Double Click")).click();
	     
	     WebElement yesbutton = driver.findElement(By.id("btn20"));
	     act.doubleClick(yesbutton).perform();
	     
	     WebElement Nobutton = driver.findElement(By.id("btn23"));
	     act.doubleClick(Nobutton).perform();
	     
	     
	     WebElement rating3button = driver.findElement(By.id("btn26"));
	     act.doubleClick(rating3button).perform();
	}
	

}
