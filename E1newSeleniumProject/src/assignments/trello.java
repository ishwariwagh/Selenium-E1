package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class trello {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://trello.com/home");
		
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("username")).sendKeys("ishawagh2000@gmail.com");
        driver.findElement(By.xpath("//span[text()='Continue']")).click();
        driver.findElement(By.id("password")).sendKeys("Isha@99998888");
        driver.findElement(By.xpath("//span[text()='Log in']")).click();
        
          driver.findElement(By.xpath("//div[text()='Mock of Qspiders']")).click();
        
        //sourse
       WebElement sqlSource = driver.findElement(By.xpath("//a[text()='SQL']"));
       WebElement javaSource = driver.findElement(By.xpath("//a[text()='JAVA']"));
       WebElement manualTesting = driver.findElement(By.xpath("//a[text()='MANUAL TESTING']"));
       WebElement apiSource = driver.findElement(By.xpath("//a[text()='API']"));
       WebElement seleniumSource = driver.findElement(By.xpath("//a[text()='SELENIUM']"));
        
        //target
       Thread.sleep(2000);
       WebElement mockGiven = driver.findElement(By.xpath("h2[text()='Mock given']"));
       WebElement mockSchedule = driver.findElement(By.xpath("textarea[text()='Mock Schedule']"));
       WebElement mockPending = driver.findElement(By.xpath("textarea[text()='Mock  Pending']"));
        
       Actions act = new Actions(driver);
       
       
       
       act.dragAndDrop(seleniumSource, mockPending).perform();
       act.dragAndDrop(javaSource, mockGiven).perform();
       act.dragAndDrop(manualTesting, mockGiven).perform();
       act.dragAndDrop(apiSource, mockSchedule).perform();
       act.dragAndDrop(sqlSource, mockSchedule).perform();
        
	}

}
