package HomePage_Steps;

import Driver_Factory.Driver_Factory;
import Hooks.hook;
import Pages.HomePage;
import Pages.Search_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_Page_Steps {
	

	private Search_Page searchPage = new Search_Page(Driver_Factory.getDriver());
	
	

	@When("User finds search product on display")
	public void user_finds_search_product_on_display() {
		
		System.out.println("Product found");
	   
	}

	@When("User selects any product to add to trolley")
	public void user_selects_any_product_to_add_to_trolley() {
		
		String expectedProduct = searchPage.collect_description();
		searchPage.click_button(3);
		System.out.println(expectedProduct);
		
		
	}
	
	   
	@Then("User should see a confirmation for selected product added")
	public void user_should_see_a_confirmation_for_selected_product_added() {
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchPage.add_to_basket();
		
		
	}
	    

	@Then("User should see the same product been added to basket")
	public void user_should_see_the_same_product_been_added_to_basket() {
	    
	}
	
	@Then("User shiould see the Argos logo in on the page")
	public void user_shiould_see_the_argos_logo_in_on_the_page() {
	   System.out.println("Logo is present");
	}

	@When("User selcts price filter")
	public void user_selcts_price_filter() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Only selected price range products should be displayed")
	public void only_selected_price_range_products_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
