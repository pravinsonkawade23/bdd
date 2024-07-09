package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\pravin\\Cucumber-01\\src\\test\\resources\\features",
		glue = "stepDefinitions",
		tags = "@tag1",
		dryRun = false, monochrome = true		
		)

public class loginRunner {

}
