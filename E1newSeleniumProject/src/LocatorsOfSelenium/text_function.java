package LocatorsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class text_function {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();//actitime
		driver.manage().window().maximize();
		driver.get("http://laptop-6icsvshl/login.do");
		Thread.sleep(2000);
		
		//WebElement loginbutton=driver.findElement(By.xpath("//a[text()='Login']"));
        // loginbutton.click();
		
		WebElement loginbutton=driver.findElement(By.xpath("//a[.='Login']"));
		loginbutton.click();
		
		
	}

}
