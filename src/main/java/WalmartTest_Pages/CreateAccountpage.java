package WalmartTest_Pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WalmartTest_Base.TestBase;

public class CreateAccountpage extends TestBase {

	@FindBy(xpath = "//button[contains(@class,'css-vfxkzw edzik9p0')]")
	WebElement signinbtn;

	@FindBy(xpath = "//a[@class='css-1xh2uh0 evkjyb00']")
	WebElement myacc;

	@FindBy(linkText = "Create account")
	WebElement createacc;

	@FindBy(id = "firstName")
	WebElement firstname;

	@FindBy(id = "lastName")
	WebElement lastname;

	@FindBy(id = "email")
	WebElement emailaddress;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//label[contains(@class,'css-1jg09os ega94xn0')]")
	WebElement agreecheckbox;

	@FindBy(xpath = "//button[contains(@class,'css-vfxkzw edzik9p0')]")
	WebElement createaccbtn;

	public CreateAccountpage() {
		PageFactory.initElements(driver, this);
	}

	public void createaccount(String ftname, String ltname, String email, String pwd) {
		firstname.sendKeys(ftname);
		lastname.sendKeys(ltname);
		emailaddress.sendKeys(email);
		password.sendKeys(pwd);
		agreecheckbox.click();
		createaccbtn.click();
	}

}
