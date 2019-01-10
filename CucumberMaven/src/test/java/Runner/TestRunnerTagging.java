package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sharad.Chauhan\\git\\repository3\\CucumberMaven\\features\\tagging.feature",
             glue= {"stepDefination"},
             plugin={ "pretty", "html:target/cucumber-reports"},
             dryRun=false,
             monochrome=true,
             tags= {"@smoketest , @regressiontest"}) // IMP : smoke test only, regression test  only and combination of both

// OR : "  ,  "

// AND : " " , " "

// to run only which are both smoke and regression only and not individual  : "@smoketest" ,"@regressiontest"

// "~@smoketests  :: not run these

public class TestRunnerTagging {
	


}
