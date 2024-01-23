package Hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Driver_Factory.Driver_Factory;
import config.Config_Reader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hook {
	
	private Config_Reader config;
	
	private Driver_Factory driverfactory;
	
	private Properties prop;
	
	private WebDriver driver;
	
     
	
	@Before(order=0)
	public void get_Property() {
		config =new Config_Reader();
		
		prop=config.config();
		
	}
	@Before(order=1)
	public void set_driver() {
		
	driverfactory=new Driver_Factory();
	
	driverfactory.driver_init(prop.getProperty("browser"));
	
	}
	
	
	
	
}
