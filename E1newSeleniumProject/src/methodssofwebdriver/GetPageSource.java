package methodssofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		

	}

	}


