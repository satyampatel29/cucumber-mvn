package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (
		
		features = "src/test/java/features",
		glue= "stepdefinitions"
		
		
		)




public class testrunner {

	public testrunner() {
		// TODO Auto-generated constructor stub
	}

}
