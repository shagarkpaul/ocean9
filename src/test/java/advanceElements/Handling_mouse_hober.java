package advanceElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_mouse_hober {
	
	
	public static void main(String[] args) {
		
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement im2 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
		
		
		//(//img[@alt='User Avatar'])[2]
		
		Actions act = new Actions(driver);
		
		act.moveToElement(im2).build().perform();
		
		
		
	}

}
