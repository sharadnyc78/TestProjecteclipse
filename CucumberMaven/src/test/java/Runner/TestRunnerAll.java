package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="features", // all features should run
             glue= {"stepDefination"},
             plugin={ "pretty", "html:target/cucumber-reports"},
             dryRun=false,
             monochrome=true)

public class TestRunnerAll {
	


}
