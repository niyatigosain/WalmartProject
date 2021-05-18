package WalmartTest_Testcases;

import WalmartTest_Base.TestBase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import WalmartTest_Pages.Flyerpage;
import WalmartTest_Pages.Homepage;
import WalmartTest_Pages.Loginpage;
import WalmartTest_Pages.MyAccountpage;
import WalmartTest_Pages.OrderHistorypage;
import WalmartTest_Pages.ShoppingCartpage;
import WalmartTest_TestUtil.TestUtil;

public class FlyerpageTest extends TestBase {

	Loginpage loginpage;
	Homepage homepage;
	ShoppingCartpage shoppingcartpage;
	MyAccountpage myaccountpage;
	OrderHistorypage orderhistorypage;
	Flyerpage flyerpage;
	TestUtil testutil;

	public FlyerpageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		Initialization();
		testutil = new TestUtil();
		homepage = new Homepage();
		flyerpage = homepage.clickonflyerpage();
		
	

	}

	@Test
	public void openflyertest() {
		testutil.switchToFrame();
	}

	@Test
	public void flyerpagetitletest() {
		String title = flyerpage.validatetitle();
		Assert.assertEquals(title, "Online Shopping Canada: Everyday Low Prices at Walmart.ca!");
	}
	
	@Test
	public void validateflyert() {
		testutil.switchToFrame();
		flyerpage.validateflyerstatus();
		
	}

	@Test
	public void selectflyertypetest()  {
		testutil.switchToFrame();
		flyerpage.selectflyertype();
		
	
	}

	@Test
	public void selectringpooltest() {

		flyerpage.selectringpool();

	}

	@Test
	public void validatepdfbtntest() {
		boolean flag = flyerpage.validatepdfbtn();
		Assert.assertTrue(flag);
	}

	@Test
	public void shoppinglisttest() {
		flyerpage.shoppinglist("toys");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
