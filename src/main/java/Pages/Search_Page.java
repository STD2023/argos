package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search_Page {
	
	
WebDriver driver;
int random = 3;
private By product_description=By.cssSelector(".ProductCardstyles__Title-h52kot-12");

private By add_to_basket_button= By.cssSelector(".ProductCardstyles__Wrapper-h52kot-1.dWoMVd");

//private By add_to_basket= By.cssSelector(".Buttonstyles__Button-sc-42scm2-2.dEQSbW");

private By add_basket_button= By.cssSelector(".styles__Container-sc-1h5mbdb-0 > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(1)");

private By add_to_trolley=By.cssSelector("[data-test=component-att-button-basket]");

private By add_product_by_des= By.cssSelector("[id=\"product-title-9540437\"]>div.ProductCardstyles__Title-h52kot-12.PQnCV");

private By go_to_trolley=By.cssSelector("[data-test=\"add-to-trolley-button-button\"]");



	public Search_Page(WebDriver driver) {
		
		this.driver=driver;
		
	}
	

public String collect_description() {
	
	List<String>collected_des= new ArrayList<String>();
	
	List<WebElement> des= driver.findElements(product_description);
	
	for(WebElement e: des) {
		
		System.out.println(e);		
		collected_des.add(e.getText());		
	}
	
	System.out.println("This is list >>>>>>>> "+collected_des);
	return collected_des.get(random);
	
}

public void click_button(int buttonIndex){
	
	//List<String>collected_button= new ArrayList<String>();
	List<WebElement> basket_buttons=driver.findElements(add_to_basket_button);
	for(int i=0; i<=(basket_buttons.size());i++) {
		
		if(i == buttonIndex ) {
			basket_buttons.get(i).click();
			break;
		}

	}
	
	
}

public void add_to_basket(){
	
	driver.findElement(add_basket_button).click();
	
}

public void add_to_trolley() {
	
	driver.findElement(add_to_trolley).click();
}

public void click_on_des() {
	
	driver.findElement(add_product_by_des).click();
}

public void proceed_to_trolley() {
	
	driver.findElement(go_to_trolley).click();
}
}


