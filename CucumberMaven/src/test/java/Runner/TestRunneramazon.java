package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sharad.Chauhan\\git\\repository3\\CucumberMaven\\features\\amazon.feature",
             glue= {"stepDefination"},
             plugin={ "pretty", "html:target/cucumber-reports"},
             dryRun=false,
             monochrome=true)

public class TestRunneramazon {
	


}
