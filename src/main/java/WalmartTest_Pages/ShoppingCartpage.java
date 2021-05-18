package WalmartTest_Pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import WalmartTest_Base.TestBase;
import WalmartTest_TestUtil.TestUtil;

public class ShoppingCartpage extends TestBase {

	@FindBy(xpath = "//svg[contains(@class, 'css-1wjacxm ekai0sg1')]")
	WebElement shoppingcrt;

	@FindBy(id = "walmartblue_Layer_1")
	WebElement walmartlogo;

	@FindBy(xpath = "//button[contains(@data-automation='remove-product-from-cart')]")
	WebElement remove;

	@FindBy(xpath = "//button[contains(@class='css-70qvj9 e1mwhvvs1')]")
	WebElement savelater;

	@FindBy(linkText="Proceed to checkout")
	WebElement proceedcheckout;

	@FindBy(xpath = "//a[contains(@class='ei50f4d1 css-frpsc8 elkyjhv0')]")
	WebElement babyswing;

	@FindBy(xpath = "//button[contains(@class='e5qqw234 css-1gezpl6 edzik9p0')]")
	WebElement incqtybtn;

	public ShoppingCartpage() {
		PageFactory.initElements(driver, this);
	}

	public String validatetitle() {
		return driver.getTitle();
	}

	public boolean validatelogo() {
		return walmartlogo.isDisplayed();
	}

	public void screenshot() throws IOException {
		TestUtil.takeScreenshotAtEndOfTest();
	}

	public boolean proceedcheckout() {
		return proceedcheckout.isDisplayed();
	}




	public void increaseqty() {
		babyswing.isDisplayed();
		incqtybtn.click();

	}

}
