package methodssofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();// to launch the browser
		Thread.sleep(5000);//
		
		driver.manage().window().maximize();//to maximize the browser window
		Thread.sleep(5000);
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(5000);
		
		driver.close();
		//driver.quit();
		

	}

}
