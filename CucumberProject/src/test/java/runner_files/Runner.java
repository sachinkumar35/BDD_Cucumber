package runner_files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
	dryRun = false,  // it checks in deep so use false
//	strict = true,   it check error in deep and we don't need of this in latest eclipse
	monochrome = true, // it is used for make beautiful console 
	features = {"src/test/resources"}, // where we are putting all features file 
	glue= {"cucumber_learning"}, // package name
	plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1/json"}, // it helps to generate report in html
	tags = "@Login or @Logout"
	)
public class Runner {
	
//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {return super.scenarios();}

}
