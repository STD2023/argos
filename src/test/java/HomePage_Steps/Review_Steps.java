package HomePage_Steps;

import Driver_Factory.Driver_Factory;
import Pages.Trolley_Page;
import io.cucumber.java.en.When;

public class Review_Steps {
	private Trolley_Page trolley = new Trolley_Page(Driver_Factory.getDriver());
	
	
	@When("User scrolls down to review section")
	public void user_scrolls_down_to_review_section() {
		
		trolley.scroll_down();
		
	    
	}

	@When("User clicks on review title")
	public void user_clicks_on_review_title() {
	    System.out.println("clicked");
	}

}
