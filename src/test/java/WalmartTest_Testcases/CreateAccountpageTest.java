package WalmartTest_Testcases;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import WalmartTest_Base.TestBase;
import WalmartTest_Pages.CreateAccountpage;
import WalmartTest_Pages.Dealspage;
import WalmartTest_Pages.Flyerpage;
import WalmartTest_Pages.Homepage;
import WalmartTest_Pages.Loginpage;
import WalmartTest_Pages.OrderHistorypage;
import WalmartTest_TestUtil.TestUtil;

public class CreateAccountpageTest extends TestBase {

	Homepage homepage;
	Loginpage loginpage;
	Dealspage dealspage;
	Flyerpage flyerpage;
	OrderHistorypage orderhistorypage;
	CreateAccountpage createaccountpage;
	String sheetName = "accounts";

	public CreateAccountpageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		Initialization();
		homepage = new Homepage();
		loginpage= new Loginpage();
		createaccountpage= new CreateAccountpage();
	
	}

@DataProvider 
	public Object[][] getWalmartTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;

	}

	@Test(dataProvider = "getWalmartTestData", enabled=true)
	public void validatecreateaccount(String firstname, String lastname, String email, String password) {
		loginpage.createnewaccount();
		createaccountpage.createaccount(firstname, lastname, email, password);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
