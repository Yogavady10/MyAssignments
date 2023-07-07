package week7.day2.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/main/java/week7/day2/feature/CreateLead.feature"},
				glue={"week7/day2/steps", "week7/day2/hooks"},
				monochrome=true,
				publish=true,
				tags = "@Regression")
public class CreateLeadRunner extends AbstractTestNGCucumberTests{

}
