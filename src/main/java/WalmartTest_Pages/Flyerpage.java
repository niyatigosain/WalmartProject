package WalmartTest_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WalmartTest_Base.TestBase;

public class Flyerpage extends TestBase {

	@FindBy(css = ".e18kvv91")
	WebElement flyerlink;

	@FindBy(id = "flipp-iframe")
	WebElement popupwindow;

	@FindBy(xpath = "	//tr[@role='listitem']")
	WebElement weekendflyer;

	@FindBy(xpath = "// img[class='wishabi-flyerview-rightarrow-image']")
	WebElement rightarrowbtn;

	@FindBy(xpath = "// img[class='wishabi-flyerview-leftarrow-image']")
	WebElement leftarrowbtn;

	@FindBy(xpath = "// div[class='css-1urziy7 e1647nq83']")
	WebElement ringpool;

	@FindBy(xpath = "// button[class='css-2ze04u edzik9p0']")
	WebElement viewdetailsbtn;

	@FindBy(xpath = "// button[class='css-ktyipj edzik9p0']")
	WebElement closebtn;

	@FindBy(xpath = "// div[class='flatsheettopbar-menu-item-title']")
	WebElement shoppinglist;

	@FindBy(id = "// input[class='shopping_list_free_text_input']")
	WebElement inputbar;

	@FindBy(id = "// input[class='goog-inline-block goog-custom-button-inner-box']")
	WebElement additembtn;

	@FindBy(id = "// div[class='flatsheettopbar-pdf goog-inline-block goog-custom-button']")
	WebElement pdfprintbtn;

	public Flyerpage() {
		PageFactory.initElements(driver, this);
	}

	public String validatetitle() {
		flyerlink.click();
		return driver.getTitle();
	}

	public void openflyer() {

		flyerlink.click();

	}

	public boolean validateflyerstatus() {
		boolean flag = weekendflyer.isDisplayed();
		return flag;
	}

	public void selectflyertype()  {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", weekendflyer);
		weekendflyer.click();
		
	}

	public Flyerpage selectringpool() {
		flyerlink.click();
		weekendflyer.click();
		leftarrowbtn.click();
		ringpool.click();
		viewdetailsbtn.click();
		driver.navigate().back();
		return new Flyerpage();
	}

	public boolean validatepdfbtn() {
		return pdfprintbtn.isDisplayed();
	}

	public void shoppinglist(String item) {
		shoppinglist.click();
		inputbar.sendKeys(item);
		additembtn.click();

	}

}
