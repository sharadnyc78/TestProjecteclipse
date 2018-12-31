package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sharad.Chauhan\\eclipse-workspace\\CucumberMaven\\features\\youtubesearch.feature",
             glue= {"stepDefination"},
             plugin={ "pretty", "html:target/cucumber-reports"})

public class TestRunner {
	


}
