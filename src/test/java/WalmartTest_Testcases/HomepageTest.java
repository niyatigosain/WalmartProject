package WalmartTest_Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import WalmartTest_Base.TestBase;
import WalmartTest_Pages.Dealspage;
import WalmartTest_Pages.Flyerpage;
import WalmartTest_Pages.Homepage;
import WalmartTest_Pages.Loginpage;
import WalmartTest_Pages.OrderHistorypage;

public class HomepageTest extends TestBase {

	Homepage homepage;
	Loginpage loginpage;
	Dealspage dealspage;
	Flyerpage flyerpage;
	OrderHistorypage orderhistorypage;

	public HomepageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		Initialization();
		homepage = new Homepage();
	}

	@Test(priority = 1)
	public void gettitlepage() {
		driver.getTitle();
	}

	@Test(priority = 2)
	public void validatedealslink() {
		boolean flag = homepage.delaspage();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void gettextpagetitle() {
		String title = homepage.getpagetitle();
		Assert.assertEquals(title, "Online Shopping Canada: Everyday Low Prices at Walmart.ca!");
	}

	@Test(priority = 4)
	public void validatetoyslink() {
		boolean flags = homepage.toyspage();
		Assert.assertTrue(flags);
	}

	@Test(priority = 5)
	public void logintest() {
		loginpage = homepage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 6)
	public void loginordertest() {
		orderhistorypage = homepage.loginorder(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void openflyerpage()
	{ homepage.flyerpage();}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
