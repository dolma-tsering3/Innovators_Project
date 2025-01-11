package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
  // connecting features to steps :
     features = "Features",
        glue = "steps"

)


public class TestRunner extends AbstractTestNGCucumberTests {

}
