package WalmartTest_Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import WalmartTest_Base.TestBase;
import WalmartTest_Pages.Homepage;
import WalmartTest_Pages.Loginpage;
import WalmartTest_Pages.MyAccountpage;

public class MyAccountpageTest extends TestBase {

	Loginpage loginpage;
	Homepage homepage;
	MyAccountpage myaccountpage;

	public MyAccountpageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		Initialization();
		homepage = new Homepage();
		myaccountpage = homepage.useraccount(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void validatelogotest() {
		myaccountpage.validatelogo();
		
	}

	@Test
	public void getbannertexttest() {
		myaccountpage.getbannertext();

	}

	@Test
	public void verifyshoppingbtn() {
		 myaccountpage.validatelogo();
		
	}

	@Test
	public void validatequicklinktest() {
		myaccountpage.validatequicklink();

	}

	@AfterMethod
	public void teardown() {
		driver.quit();

	}

}