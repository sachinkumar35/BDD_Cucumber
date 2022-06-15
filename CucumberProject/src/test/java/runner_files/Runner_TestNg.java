package runner_files;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		dryRun = false,  // it checks in deep so use false
//		strict = true,   it check error in deep and we don't need of this in latest eclipse
		monochrome = true, // it is used for make beautiful console 
		features = {"src/test/resources"}, // where we are putting all features file 
		glue= {"cucumber_learning"}, // package name
		plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1/json"},
		tags = "@BookingMMABook"
		)
public class Runner_TestNg extends AbstractTestNGCucumberTests {

}
