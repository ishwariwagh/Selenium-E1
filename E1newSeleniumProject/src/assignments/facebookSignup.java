package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookSignup {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/r.php");
		
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
		Select daySelect= new Select(dayDropdown) ;
		  boolean result1 = daySelect.isMultiple();
		   System.out.println("Day Dropdown is multiple?"+result1);
		  
		  
		  List<WebElement> dayoption = daySelect.getOptions();
		  for(WebElement we:dayoption)
		  {
			  System.out.println(we.getText());
		  }  
		  daySelect.selectByIndex(19);
		  
		  
		  
		  Select monthSelect= new Select(monthDropdown) ;  
		  boolean result2 = monthSelect.isMultiple();

		  System.out.println("Month Dropdown is multiple?"+result2);
		  
		 List<WebElement> monthoption = monthSelect.getOptions();
		 for(WebElement we1: monthoption)
		 {
			 System.out.println(we1.getText());
			 
		 }
		 monthSelect.selectByValue("3");
	

		
		
	}

}
