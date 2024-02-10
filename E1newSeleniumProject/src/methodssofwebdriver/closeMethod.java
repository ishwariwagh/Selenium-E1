package methodssofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();//to launch the browser
        Thread.sleep(5000); //to stop the execution for 5sec
		  driver.close();   //to close browser window
	}

}
