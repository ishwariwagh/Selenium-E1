package LocatorsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		WebElement usNTB = driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']"));
		usNTB.sendKeys("ishwari");
		
		WebElement pwTB= driver.findElement(By.cssSelector("input[type='password']"));
		pwTB.sendKeys("1234567");
		Thread.sleep(1000);
		
		WebElement loginbutton=driver.findElement(By.cssSelector("button[type='submit']"));
		loginbutton.click();
		
		

	}

}
