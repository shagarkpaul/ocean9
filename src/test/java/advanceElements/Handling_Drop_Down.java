package advanceElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Drop_Down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id = 'dropdown']"));
		
		Select s = new Select(dropdown);
		
		
		//Selecting by index 
		
		s.selectByIndex(1);
		
		//selecting by value 
		
		Thread.sleep(5000);
		
		s.selectByValue("2");
		
		
		//selecting by visible text 
		
		
		Thread.sleep(5000);
		
		s.selectByVisibleText("Option 1");
		
		Thread.sleep(5000);
		
		
		
		
		
		driver.quit();
		
		
		
		
		

	}

}
