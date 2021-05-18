package WalmartTest_Pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WalmartTest_Base.TestBase;

public class Loginpage extends TestBase {

	@FindBy(xpath = "//button[contains(@class,'css-vfxkzw edzik9p0')]")
	WebElement signinbtn;
	
	@FindBy(xpath="//a[@class='css-1xh2uh0 evkjyb00']")
	WebElement myacc;	

	@FindBy(linkText = "Create account")
	WebElement createacc;

	@FindBy(xpath = "//a[contains(@class, 'css-1si6i1z ezalzhu0')]")
	WebElement walmartlogo;

	@FindBy(xpath = "//label[@class='css-1jg09os ega94xn0']")
	WebElement checkbox;
	
	@FindBy(xpath = "//label[@class='css-0 e18kvv91']")
	WebElement Flyerlink;

//3.) Initialize page objects for current class in a constructor
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}

//4.) Actions: different feature on login page

	public String validatetitle()
	{		return driver.getTitle();	}

	public boolean validatelogo()
	{		return walmartlogo.isDisplayed();	}



	public boolean verifycheckbox() {
		return checkbox.isSelected();
	}

	public boolean verifysigninbtn() {
		return signinbtn.isEnabled();
	}

	public boolean verifycreateacc() {
		return createacc.isDisplayed();
	}

	public CreateAccountpage createnewaccount()
	{
		myacc.click();
		createacc.click();
		return new CreateAccountpage();
			}


	}

