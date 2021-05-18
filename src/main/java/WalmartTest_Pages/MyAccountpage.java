package WalmartTest_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import WalmartTest_Base.TestBase;

public class MyAccountpage extends TestBase {

	@FindBy(css = "	#walmartaccountlogo_a")
	WebElement circlewalmartlogo;

	@FindBy(xpath = "//div[@class='css-15d3kon e1lo459p5']")
	WebElement welcomebanner;

	@FindBy(css = "	.evu2eli21")
	WebElement startshoppingbutton;


	
	@FindBy(css = ".css-o861vg")
	WebElement quicklink;

	public MyAccountpage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validatelogo() {
		return circlewalmartlogo.isDisplayed();
	}

	public String getbannertext() {
		String text = welcomebanner.getText();
		return text;

	}

	public boolean verifyshoppingbtn() {
		return startshoppingbutton.isDisplayed();
	}

	public boolean validatequicklink() {
		return quicklink.isDisplayed();

	}

}
