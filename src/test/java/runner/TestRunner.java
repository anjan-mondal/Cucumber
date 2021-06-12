package runner;



import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(features = {"src/test/java/features"} , 
				 plugin = {"json:target/cucumber.json", "pretty"},
				 glue = "stepDef")
public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
	}
}