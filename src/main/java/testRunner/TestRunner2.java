package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java//featureFiles",glue = "StepDefpackage",plugin="pretty")
public class TestRunner2 extends AbstractTestNGCucumberTests{

}
