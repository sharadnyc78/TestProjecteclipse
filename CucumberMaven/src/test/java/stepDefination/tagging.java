package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class tagging {
	
	
	@Before // import from cucumber api\ runs before all sceanrios
	
	public void setup() {
		
		System.out.println("in before Hooks");
	}
	
	
	
	@After  // runs after all scenarios
	public void teardown() {
		
		System.out.println("in After Hooks");
	}
	
	
	
	@Given("^I am using correct creds$")
	public void i_am_using_correct_creds() throws Throwable {
	    System.out.println("sceanrio1");
	}

	@Given("^I am using INcorrect creds$")
	public void i_am_using_INcorrect_creds() throws Throwable {
		 System.out.println("sceanrio2");
	}

	@Given("^i am searching for products$")
	public void i_am_searching_for_products() throws Throwable {
		 System.out.println("sceanrio3");
	}
	
	@Given("^i am searching for carts$")
	public void i_am_searching_for_carts() throws Throwable {
		 System.out.println("sceanrio4");
	}
	
	


}
