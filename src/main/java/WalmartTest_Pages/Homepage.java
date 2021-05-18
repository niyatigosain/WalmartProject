package WalmartTest_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WalmartTest_Base.TestBase;

public class Homepage extends TestBase{

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//button[contains(@class,'css-vfxkzw edzik9p0')]")
	WebElement signinbtn;
	
	@FindBy(xpath="//a[@class='css-1xh2uh0 evkjyb00']")
	WebElement myacc;		

	@FindBy(linkText="Deals")
	WebElement deals;	
	
	@FindBy(xpath="//svg[@class='css-1wjacxm ekai0sg1']")
	WebElement shoppingcart;	

	@FindBy(css=".e18kvv91")
	WebElement flyers;	
	
	@FindBy(linkText="Toys")
	WebElement toys;
	
	@FindBy(xpath = "//a[contains(@aria-label, 'Order History')]")
	WebElement orderhistorybtn;
	
	@FindBy(id = "view-orders-from-label")
	WebElement vieworders;
	
	@FindBy(xpath = "//div[contains(@class, 'css-1w6fbbp eflt64x0')]")
	WebElement hangtight;
	
	@FindBy(xpath = "//span[contains(@class, 'css-hl2cc3 evkjyb03')]")
	WebElement useraccount;
	

	public Homepage()
	{		PageFactory.initElements(driver, this);	}
	
	public boolean signinlink()
	{		  return myacc.isSelected();	}
	
	public boolean delaspage()
	{		return deals.isDisplayed();	}
		
	public String getpagetitle()
	{		return driver.getTitle();	}	
	
	public boolean toyspage()
	{		return toys.isDisplayed();	}	
		
	public void flyerpage()
	{		 flyers.click();	}	
	
	public Loginpage login(String un, String pw)
	{		
		myacc.click();
		username.sendKeys(un);
		password.sendKeys(pw);
		signinbtn.click();

		return new Loginpage();
	}
	
	public OrderHistorypage loginorder(String un, String pw)
	{		
		myacc.click();
		username.sendKeys(un);
		password.sendKeys(pw);
		signinbtn.click();
		useraccount.click();
		orderhistorybtn.click();
		
		return new OrderHistorypage();
	}

	
	public MyAccountpage useraccount(String un, String pw)
	{		
		myacc.click();
		username.sendKeys(un);
		password.sendKeys(pw);
		signinbtn.click();
		useraccount.click();
			
		return new MyAccountpage();
	}

	
	public Flyerpage clickonflyerpage()
	{
		flyers.click();
		return new Flyerpage();
		
	}
	
	public Dealspage clickondealspage()
	{
		deals.click();
		return new Dealspage();
		
	}
	

	}

