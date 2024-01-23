package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Trolley_Page {
	
	WebDriver driver;
	
	public Trolley_Page(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	private By quantity= By.id("quantity9540437");
	
	private By postcode=By.id("basket-FulfilmentSelectorForm");
	
	private By collection=By.cssSelector("[data-test=fulfilment-deliver-button]");
	
	private By scrolltoreview= By.cssSelector("#reviews-accordion-accordion-control-reviews-accordion > h3 > div");
	
	private By feature_des= By.cssSelector(".product-description-content-text > p:nth-child(2)");
	
	
	public void select_quantity() throws InterruptedException{
		
		WebElement number=driver.findElement(quantity);
		
		Select select=new Select(number);
		
		select.selectByVisibleText("3");
		
		Thread.sleep(2000);
		
		
	}
	
	public void enter_postcode() {
		
		driver.findElement(postcode).sendKeys("TW134TN");
		
		
	}
	
	public void select_collection() {
		
		driver.findElement(collection).click();
	}
	
	public void scroll_down() {
		
		Actions action =new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		String des= driver.findElement(feature_des).getText();
		System.out.println("Picked up "+ des);
		
		
	}
	
	

}
