package pages;

import static org.junit.Assert.assertArrayEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.util.DriverUtility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy1 {
	WebDriver driver;
	@Before
	public void before()
	{
		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, cs1Product.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	}

	@Given("Url of TestMeApp")
	public void url_of_TestMeApp() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("User enters Admin as username")
	public void user_enters_Admin_as_username() {
		driver.findElement(By.id("userName")).sendKeys("Admin");
	}

	@When("User enters Password{int} as password")
	public void user_enters_Password_as_password(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("Password456"); 
		driver.findElement(By.name("Login")).click();
		cs1Product.AddProduct.click();
		cs1Product.Catname.click();
		cs1Product.select();
		cs1Product.Catsname.click();
		cs1Product.select1();
		cs1Product.proname.sendKeys("HP Laptop");
		cs1Product.price.sendKeys("47800");
		cs1Product.Quan.sendKeys("1");
		cs1Product.Brand.sendKeys("HP");
		cs1Product.Des.sendKeys("1TB GUI Harddisk");
		//cs1Product.browse;
		cs1Product.submit.click();
   Assert.assertTrue(cs1Product.message.getText().contains(" HP Laptop is added Succesfully !!!"));
	}

	@Then("HomePage will be displayed")
	public void homepage_will_be_displayed() {


	}

	@After
	public void after()
	{
		//driver.close();
	}

}
