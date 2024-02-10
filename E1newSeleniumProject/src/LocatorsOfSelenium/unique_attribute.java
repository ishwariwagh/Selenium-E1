package LocatorsOfSelenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unique_attribute {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/signin");
		
		Thread.sleep(2000);
		
		WebElement usn = driver.findElement(By.xpath("//input[@name='emailId']"));
		usn.sendKeys("ishawagh2000@gmail.com");
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='mui-2']"));
		password.sendKeys("Isha9999@8888");
		Thread.sleep(3000);
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		
	}

}
