package methodssofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000); //to stop the execution for 5sec
		
		
		driver.navigate().back();
		Thread.sleep(5000); //to stop the execution for 5sec
		
		
		driver.navigate().forward();
		Thread.sleep(5000); //to stop the execution for 5sec
		
        driver.navigate().refresh();
        Thread.sleep(5000); //to stop the execution for 5sec
        
        driver.close();
	}

}
