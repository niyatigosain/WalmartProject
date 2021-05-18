package WalmartTest_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WalmartTest_Base.TestBase;

public class Dealspage extends TestBase {

	@FindBy(linkText = "Deals")
	WebElement dealslink;

	@FindBy(css = ".e1s46ex61")
	WebElement hotdeals;

	@FindBy(css = "#o33cpHj0")
	WebElement toyslink;

	@FindBy(css = "#yrJjIrx3")
	WebElement applianceslink;

	@FindBy(id = "SubscriptionForm")
	WebElement emailaddress;

	public Dealspage() {
		PageFactory.initElements(driver, this);
	}

	public void opendeals() {

		dealslink.click();

	}

	public String validatetitle() {
		return driver.getTitle();
	}

	public boolean verifytoyslink() {
		return toyslink.isDisplayed();
	}

	public boolean verifyapplianceslink() {
		return applianceslink.isDisplayed();
	}

	public String getdealstext() {
		return hotdeals.getText();

	}

	public void enteremail() {
		emailaddress.sendKeys("sunnyroad100@gmail.com");

	}

}
