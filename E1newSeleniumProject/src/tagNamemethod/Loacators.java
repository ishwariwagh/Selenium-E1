package tagNamemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loacators {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ishwari%20manik%20wagh/Desktop/webelement/textbox.html");
        Thread.sleep(3000);
        
        
        WebElement textBox = driver.findElement(By.tagName("input"));
        //find password textfield on the webpage
        
        textBox.sendKeys("manager");//to pass the input to password textfield
	}

}
