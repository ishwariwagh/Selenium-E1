package LocatorsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class className {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        
        WebElement passtextBox = driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));
        passtextBox.sendKeys("manager");

	}

}
