package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	//by locators(private)
	//constructor
	//actions(public)
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	private By searchbar=By.id("searchTerm");

	
	private By searchbutton=By.className("_2mKaC");
	
	private By cookies=By.id("explicit-consent-prompt-accept");
	


public String getLoginPageTitle() {
	
	return driver.getTitle();
}



public void enterprodut() {
	
	driver.findElement(searchbar).sendKeys("puma");
}



public void clicksearch() {
	
	driver.findElement(searchbutton).click();
}

public void accept_cookies() {
	
	driver.findElement(cookies).click();
}
}









