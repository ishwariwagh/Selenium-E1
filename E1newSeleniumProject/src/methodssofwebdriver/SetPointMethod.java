package methodssofwebdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPointMethod {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();// to launch the browser
		Thread.sleep(5000);//
		driver.manage().window().maximize();//to maximize the browser window
		Thread.sleep(5000);

		Point targetPoint = new Point(600, 400);
		//to pass the x and Y co-ordinates
		
		driver.manage().window().setPosition(targetPoint);
		//to pass the x and Y co-ordinates to set position method
		
	}

}
