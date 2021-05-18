package WalmartTest_Testcases;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import WalmartTest_Base.TestBase;
import WalmartTest_Pages.Homepage;
import WalmartTest_Pages.Loginpage;

public class LoginpageTest extends TestBase {

	Loginpage loginpage;
	Homepage homepage;

	public LoginpageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		Initialization();
		homepage = new Homepage();
		loginpage = homepage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void loginpagetitletest() {
		String title = loginpage.validatetitle();
		Assert.assertEquals(title, "Walmart Canada");
	}

	@Test(priority = 2)
	public void walmartlogotest() {
		boolean flag = loginpage.validatelogo();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void checkbox() {
		loginpage.verifycheckbox();
	}

	@Test(priority = 4)
	public void signinbtntest() {
		loginpage.verifysigninbtn();
	}

	@Test(priority = 5)
	public void verifycreateacctest() {
		loginpage.verifycreateacc();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
