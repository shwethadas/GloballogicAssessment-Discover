package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(strict = false, features = "src/test/java/featurefiles",glue={"stepDefinition"})
public class testrunner {

}
