package LocatorsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");//to launch the web application
	    Thread.sleep(3000);
	    
	  WebElement partlink = driver.findElement(By.partialLinkText("Forgotten"));
     //to locate forgotten password link
	  partlink.click();

	}

}
