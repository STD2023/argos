package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Basket_Page {
	
	
	//by locators(private)
	//constructor
	//actions(public)
	
	WebDriver driver;
	
	public Basket_Page(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	private By addproduct= By.cssSelector(".styles__Container-sc-1h5mbdb-0 > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > button");
    private By new_cookies=By.id("explicit-acceptconsent-prompt");

public void add_product() {
	
	driver.findElement(addproduct).click();
	String des=driver.findElement(addproduct).getText();
	System.out.println("The chosen product is"+ des);
}

public void new_cookies() {
	driver.findElement(new_cookies).click();
}
}
