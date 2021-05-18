package WalmartTest_Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import WalmartTest_Base.TestBase;
import WalmartTest_Pages.Homepage;
import WalmartTest_Pages.Loginpage;
import WalmartTest_Pages.ShoppingCartpage;

public class ShoppingCartpageTest extends TestBase {

	Loginpage loginpage;
	Homepage homepage;
	ShoppingCartpage shoppingcartpage;

	public ShoppingCartpageTest() {
		super();
	}
 
	@BeforeMethod
	public void setup() {
		Initialization();
		shoppingcartpage = new ShoppingCartpage();
		homepage = new Homepage();
		loginpage = homepage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test
	public void verifycartpagetest() {
		String title = shoppingcartpage.validatetitle();
		Assert.assertEquals(title, "Online Shopping Canada: Everyday Low Prices at Walmart.ca!");
	}

	@Test
	public void verifylogotest() {
		boolean flag = shoppingcartpage.validatelogo();
		Assert.assertTrue(flag);
	}

	@Test
	public void screenshottest() throws IOException {
		shoppingcartpage.screenshot();
	}



	


	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
