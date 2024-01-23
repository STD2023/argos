package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = {"src/test/java/com/features"},
		glue= {"HomePage_Steps","Hooks"},
		//tags= "@multi",
		plugin= {"pretty"},
		publish=true
		
		
		
		)
		

public class Runner {

}
