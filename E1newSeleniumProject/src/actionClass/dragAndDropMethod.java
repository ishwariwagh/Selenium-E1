package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropMethod {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");

		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.partialLinkText("Drag Position")).click();
		
		//mobile and laptop source WebElement
		WebElement mobilechargersource = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement laptopchargersource = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement mobilecoversource = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement laptopcoversource = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
           // mobile and laptop target webElement
		WebElement mobileaccesories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement laptopaccessories = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		//to drag and drop webElement into respective target area
		Actions act =new Actions(driver);
		act.dragAndDrop(mobilecoversource, mobileaccesories ).perform();
		act.dragAndDrop(laptopcoversource,laptopaccessories  ).perform();
		act.dragAndDrop( mobilechargersource,mobileaccesories).perform();
		act.dragAndDrop(laptopchargersource,laptopaccessories).perform();
		
		
	}

}
