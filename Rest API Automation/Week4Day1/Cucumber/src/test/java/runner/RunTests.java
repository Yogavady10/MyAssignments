package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/feature",glue="steps",publish=true,monochrome=true)
public class RunTests extends AbstractTestNGCucumberTests {

}
