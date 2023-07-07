package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/main/java/features"},
				glue = {"stepdefinition", "hooks"},
				monochrome = true,
				publish = true, 
				tags="@Smoke")
public class TestRunner extends AbstractTestNGCucumberTests{

}
