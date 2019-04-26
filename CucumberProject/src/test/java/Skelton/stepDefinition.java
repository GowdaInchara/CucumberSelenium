package Skelton;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepDefinition {

	Person sean = new Person();
	@Given("Sean is {int} meters away from Lucia")
	public void sean_is_meters_away_from_Lucia(Integer int1) {
	    
	    sean.setDistance(int1);
	}

	@When("Sean shouts {string}")
	public void sean_shouts(String string) {
	   sean.setMessage(string);
	}

	@Then("Lucia {string} to message")
	public void lucia_listens_to_message(String flag) {
		if(flag.contentEquals("Listens"))
		{
		String message=sean.getMessage();
		Assert.assertEquals("Free Coffee", message);
		}
		else if(flag.contentEquals("cannot listen"))
		{
			String message=sean.getMessage();
			Assert.assertEquals("cannot hear", message);
		}
	    
	}


}
