package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
	
	
	WebDriver driver;

	public GoogleHomePage(WebDriver dr) {
		
		driver = dr;
		PageFactory.initElements(driver,this);
		
	}
		
		
		//WebElement searchbox = driver.findElement(By.name("q"));
		//searchbox.sendKeys(term);
		
		@FindBy(name = "q")
		WebElement searchbox;
		
		
		public void entersearch_Term (String term) {
			
			searchbox.sendKeys(term);
		}
		
		//WebElement searchButton = driver.findElement(By.name("btnK"));
		//searchButton.click();
		
		@FindBy(name = "btnK")
		WebElement searchButton;
		
		public void enter_search_click() {
			
			searchButton.click();
		}
		
	}

