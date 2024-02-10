package LocatorsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mailsacWebsite {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://mailsac.com/");
	    Thread.sleep(3000);
	    
	    WebElement textfield = driver.findElement(By.id("field_a1xtj")) ;
		textfield.sendKeys("pradhanya_varma");
		
		 WebElement button = driver.findElement(By.tagName("button")) ;
			button.click();
		
	 

	}

}
