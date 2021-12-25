package steps;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GoogleHomePage;


public class Ocean9GoogleSearch extends GoogleBase{
	
	
	
	@Given("i am on google page")
	public void i_am_on_google_page() {
		
		
	    
		launchBrowser();
	    
		
	}

	@When("i enter search {string}")
	public void i_enter_search(String term) {
		
		
		GoogleHomePage ghp = new GoogleHomePage(driver);
		ghp.entersearch_Term(term);
		
	   
		
	}

	@When("i click on google search button")
	public void i_click_on_google_search_button() {
		
		//WebElement searchButton = driver.findElement(By.name("btnK"));
		//searchButton.click();
		
		GoogleHomePage ghp = new GoogleHomePage(driver);
		ghp.enter_search_click();
		
	   
	}

	@Then("i receive related search reults")
	public void i_receive_related_search_reults() {
		
		WebElement results = driver.findElement(By.id("result-stats"));
		String search_found = results.getText();
		
		System.out.println("==============================================================================================================");
		System.out.println(search_found);
		System.out.println("===============================================================================================================");
		
		driver.close();
		
	    
	}

}
