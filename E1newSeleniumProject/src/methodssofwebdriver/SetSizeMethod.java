package methodssofwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();// to launch the browser
		Thread.sleep(5000);//
		driver.manage().window().maximize();//to maximize the browser window
		Thread.sleep(5000);
		
		Dimension targetSize = new Dimension(500, 400);//to set the width and height to dimention class
		
		driver.manage().window().setSize(targetSize);
		//to pass the dimention to setsize method
	}

}
