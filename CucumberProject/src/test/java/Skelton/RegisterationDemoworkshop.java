package Skelton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.RegisterPage;

public class RegisterationDemoworkshop {
	WebDriver driver;
	@Before
	public void init()
	{
		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, RegisterPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Given("url of the demowebshop")
	public void url_of_the_demowebshop() {
	    driver.get("http://demowebshop.tricentis.com/register");
	   
	}

	@When("user enters the data for registration")
	public void user_enters_the_data_for_registration() {
		   RegisterPage.gender.click();
		   RegisterPage.firstname.sendKeys("inchara");
		   RegisterPage.lastname.sendKeys("Gowdaa");
		   RegisterPage.email.sendKeys("incharaa.gowda2@gmail.com");
		   RegisterPage.password.sendKeys("123abc");
		   RegisterPage.confirmpassword.sendKeys("123abc");
		   RegisterPage.registerbutton.click();
	    
	}

	@Then("user is registered successfully")
	public void user_is_registered_successfully() {
	   Assert.assertTrue(RegisterPage.message.getText().contains("Your registration completed"));
	}



}
