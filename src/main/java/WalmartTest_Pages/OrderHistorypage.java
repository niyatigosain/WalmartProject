package WalmartTest_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import WalmartTest_Base.TestBase;

public class OrderHistorypage extends TestBase{
	

	
	@FindBy(xpath = "//li[contains(@class, 'css-1kv3wpu eqw0yc03')]")
	WebElement orderhistorybtn;
	
	@FindBy(id = "view-orders-from-label")
	WebElement vieworders;
	
	@FindBy(xpath = "//div[contains(@class, 'css-1w6fbbp eflt64x0')]")
	WebElement hangtight;
	
	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//button[contains(@class,'css-vfxkzw edzik9p0')]")
	WebElement signinbtn;
	
	@FindBy(xpath="//a[@class='css-1xh2uh0 evkjyb00']")
	WebElement myacc;		
	
	
	public OrderHistorypage() {
		PageFactory.initElements(driver, this);	}
	
	public String validatetitle()
	{ 	return driver.getTitle();	}
	
	public boolean verifyorderhistorybtn() {
		return orderhistorybtn.isDisplayed();
	}
	
	public void selectyear()
	{	 Select sel= new Select(vieworders);
		sel.selectByValue("{\"date\":2021,\"count\":0}");	}
	
	public String getthetext()
	{
		return hangtight.getText();
		
	}
	


	
	
}
