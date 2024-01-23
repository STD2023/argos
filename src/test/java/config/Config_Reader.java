package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader  { 
	
	private Properties prop;
	
	public Properties config() {
	
	 prop=new Properties();
	
	try {
		FileInputStream file= new FileInputStream("./src/test/java/config/config.properties");
	    try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	

	return prop;
	
	
}
}
