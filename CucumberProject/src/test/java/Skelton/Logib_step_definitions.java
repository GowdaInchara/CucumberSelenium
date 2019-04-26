package Skelton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logib_step_definitions 
{
	WebDriver driver;
	
	@Before
	public void before()
	{
		driver=DriverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void aftertest()                                                        
	{
	 driver.close();	
	}
	
	
	@Given("The URL of TestMe App")
	public void the_URL_of_TestMe_App() {
		
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}
	
	@When("user enters {word} as Username")
	public void user_enters_as_Username(String username) {
	driver.findElement(By.id("userName")).sendKeys(username);
	    
	}
	
	@When("User enters {word} as Password")
	public void user_enters_as_Password(String Password) {
    driver.findElement(By.id("password")).sendKeys(Password);
	   
	}

	@Then("user s in (Home|AdminHome)")
	public void user_s_in_Home_Page() {
		driver.findElement(By.name("Login")).click();
		Assert.assertTrue(driver.getTitle().contains("Home"));
	 
	}

	@When("user enters invalid data")
	public void user_enters_invalid_data(io.cucumber.datatable.DataTable dataTable) {
		List <List<String>> list= dataTable.asLists();
		for(List<String> list2:list) {
			for(String s:list2)
			{
				System.out.println(s+"\t");
			}
			System.out.println();
		}
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new cucumber.api.PendingException();
	}

	@Then("user is n loginPage")
	public void user_is_n_loginPage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}




}
