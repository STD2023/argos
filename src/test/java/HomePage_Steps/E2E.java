package HomePage_Steps;

import Driver_Factory.Driver_Factory;
import Pages.Search_Page;
import Pages.Trolley_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class E2E {
	private Search_Page searchPage = new Search_Page(Driver_Factory.getDriver());
	private Trolley_Page trolley = new Trolley_Page(Driver_Factory.getDriver());
	
	@When("User selects a product to add to basket")
	public void user_selects_a_product_to_add_to_basket() throws InterruptedException {
	    searchPage.click_on_des();
	   
	}
	@When("User proceeds to basket")
	public void user_proceeds_to_basket() {
	    searchPage.proceed_to_trolley();
	}
	@When("User changes the quantity to {int}")
	public void user_changes_the_quantity_to(Integer int1) throws InterruptedException {
		
		trolley.select_quantity();
	    
	}
	@Then("The price should also change to {int} times unit price")
	public void the_price_should_also_change_to_times_unit_price(Integer int1) {
	   System.out.println("the total has changed ");
	}
	
	@When("User enters the post code")
	public void user_enters_the_post_code() {
	   trolley.enter_postcode();
	}

	@When("User selcts for collection")
	public void user_selcts_for_collection() {
	    trolley.select_collection();
	}

	@When("User scrools down to last store")
	public void user_scrools_down_to_last_store() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Selects the last store for pick up")
	public void selects_the_last_store_for_pick_up() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
