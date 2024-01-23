package HomePage_Steps;

import Driver_Factory.Driver_Factory;
import Pages.Basket_Page;
import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class New_Steps {
	
	private Basket_Page basket =new Basket_Page(Driver_Factory.getDriver());
	
	
	@When("User selects a item from the displayed product")
	public void user_selects_a_item_from_the_displayed_product() {
	    System.out.println("Prioduct selected");
	    basket.add_product();
	    
	}
	@Then("The product should be added in basket")
	public void the_product_should_be_added_in_basket() {
	    System.out.println("Added to basket");
	}

}
