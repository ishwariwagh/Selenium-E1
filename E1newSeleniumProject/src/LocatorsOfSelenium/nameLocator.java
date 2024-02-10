package LocatorsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameLocator {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    Thread.sleep(3000);
	    
	    WebElement textfield =driver.findElement(By.name("email"));
	    textfield.sendKeys("ishawaagh2000@gmail.com");
	    Thread.sleep(3000);
	    
	    WebElement passwordfield = driver.findElement(By.name("pass"));
	    passwordfield.sendKeys("12345");
	    Thread.sleep(3000);
	    
	    WebElement loginbutton = driver.findElement(By.name("login"));
	    loginbutton.click();
	    
	    		

	}

}
