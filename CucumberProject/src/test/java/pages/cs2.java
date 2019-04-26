package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class cs2
{
	@FindBy(how=How.ID,using="userName")
	public static WebElement username;
	@FindBy(how=How.ID,using="password")
	public static WebElement Password;
	@FindBy(how=How.ID,using="myInput")
	public static WebElement search;
	@FindBy(how=How.NAME,using="val")
	public static WebElement findsearch;

}
