package week7.day1.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/main/java/week7/day1/feature/CreateLead.feature"},
				glue="week7/day1/steps")
public class CreateLeadRunner extends AbstractTestNGCucumberTests{

}
