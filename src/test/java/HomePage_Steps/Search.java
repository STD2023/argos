package HomePage_Steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Driver_Factory.Driver_Factory;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	private HomePage home=new HomePage(Driver_Factory.getDriver());
	

	@Given("User is on home_page")
	public void user_is_on_home_page() {
		
		Driver_Factory.getDriver().get("https://www.argos.co.uk");
		home.accept_cookies();
		

	}

	@When("User enters product detailon search bar")
	public void user_enters_product_detailon_search_bar() {
		
		home.enterprodut();
	    
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
	   home.clicksearch();
	}
	@Then("User should only see the list of searched products.")
	public void user_should_only_see_the_list_of_searched_products() {
		
		List<WebElement> products=Driver_Factory.getDriver().findElements(By.className("ProductCardstyles__Title-h52kot-12"));
		String eachdes;
		for(WebElement des:products) {
			
			eachdes=(des.getText());
			
		    //boolean check=eachdes.contains("Puma");
			
			//if (check) {
				//System.out.println("Pass , All description has Puma word");
			
		Assert.assertTrue(eachdes.contains("Puma"));
			
		}
	}
}
		
		
	   
	
	
	


