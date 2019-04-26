package Skelton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.cs2;

public class CS2
{

WebDriver driver;
@Before
public void before()
{
	driver=DriverUtility.getDriver("chrome");
	PageFactory.initElements(driver, cs2.class);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Given("URL of then TestMeApp")
public void url_of_then_TestMeApp()
{
  driver.get("http://10.232.237.143:443/TestMeApp/login.htm"); 
}

@When("Lary added a Headphone to cart")
public void lary_added_a_Headphone_to_cart() 
{
	cs2.username.sendKeys("Lalitha");
	cs2.Password.sendKeys("Password123");
   
}

@When("checkout for payment")
public void checkout_for_payment() {
}

@When("fill transaction details")
public void fill_transaction_details() {
}

@Then("product has been successfully ordered")
public void product_has_been_successfully_ordered() {
}



}


