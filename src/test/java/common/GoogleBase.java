package common;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class GoogleBase {
	
	public WebDriver driver;
	
	public void launchBrowser() {
		
		
		 WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	    driver.get("http://www.google.com");
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	}
	
	
	public void closebrowser() {
		
		driver.close();
	}
	
	public void close_all() {
		
		driver.quit();
	}

}
