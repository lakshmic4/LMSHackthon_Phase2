package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
       (
    		   features = {"src/test/resources/Features"},
		glue= "steps",
		dryRun=false,
		monochrome = true,
		plugin = {"pretty","html:target/html-reports/reports.html"},
    		  
		tags="@Login"
		//tags="@HomePage"
		//tags="@User"
		//tags="@Program25" 
		//tags="@Assignment"
		              )

public class TestRunner {

}
