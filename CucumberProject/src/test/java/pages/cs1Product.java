package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class cs1Product
{
@FindBy(how=How.CSS,using=("Button[type=button]"))
public static WebElement AddProduct;

@FindBy(how=How.ID,using="categorydropid")
public static WebElement Catname;

public static void select()
{
Select sc=new Select(Catname);
sc.selectByIndex(1);
}
@FindBy(how=How.ID,using="subcategorydropid")
public static WebElement Catsname;
public static void select1()
{
Select sc=new Select(Catsname);
sc.selectByIndex(2);
}
@FindBy(how=How.ID,using="prodid")
public static WebElement proname;
@FindBy(how=How.ID,using="priceid")
public static WebElement price;
@FindBy(how=How.ID,using="quantityid")
public static WebElement Quan;
@FindBy(how=How.ID,using="brandid")
public static WebElement Brand;
@FindBy(how=How.ID,using="description")
public static WebElement Des;
//@FindBy(how=How.NAME,using="input-file-preview")
//ublic static WebElement browse;
@FindBy(how=How.NAME,using="Add Product")
public static WebElement submit;
@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/form/b/i")
public static WebElement message;



}

