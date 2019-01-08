package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="C:\\Users\\Sharad.Chauhan\\git\\repository3\\Cucumber\\features\\urapp.feature",
glue= {"stepDefination"})

public class TestRunner {

}
