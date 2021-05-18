package WalmartTest_Testcases;


import org.testng.Assert;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import WalmartTest_Base.TestBase;
import WalmartTest_Pages.Homepage;
import WalmartTest_Pages.Loginpage;
import WalmartTest_Pages.MyAccountpage;
import WalmartTest_Pages.OrderHistorypage;
import WalmartTest_Pages.ShoppingCartpage;

public class OrderHistorypageTest extends TestBase{
	
	Loginpage loginpage; 
	Homepage homepage;
	ShoppingCartpage shoppingcartpage;
	MyAccountpage myaccountpage;
	OrderHistorypage orderhistorypage;

	public OrderHistorypageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() 
	{
		Initialization();		

		homepage = new Homepage();
		orderhistorypage = homepage.loginorder(prop.getProperty("username"), prop.getProperty("password"));

	}
		
	@Test(priority=1)
	public void verifyorderpagetest() {
		String title = orderhistorypage.validatetitle();
		Assert.assertEquals(title, "Shop Walmart.ca: Online Shopping & Everyday Low Prices");
	}
	
	@Test(priority=2)
	public void orderbtntest() {
			boolean flag = orderhistorypage.verifyorderhistorybtn();
			Assert.assertTrue(flag);}
	
	@Test(priority=3)
	public void selectyeartest()
	{
		orderhistorypage.selectyear();	
	}
	@Test(priority=4)
	public void gettexttest()
	{
		String msg=orderhistorypage.getthetext();
		msg.equals("Hang tight—If you placed or updated an order a moment ago, "
				+ "it may take up to 10 minutes for your order details to appear. Please check back shortly!");
			}
	
		
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
