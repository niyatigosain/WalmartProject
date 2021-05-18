package WalmartTest_Testcases;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;
import WalmartTest_Base.TestBase;
import WalmartTest_Pages.Dealspage;

import WalmartTest_Pages.Homepage;

public class DealspageTest extends TestBase {

	Homepage homepage;
	Dealspage dealspage;

	public DealspageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		Initialization();

		homepage = new Homepage();
		dealspage = homepage.clickondealspage();

	}

	
	@Test
	public void gettitletest() {
		driver.getTitle();
	}

	@Test
	public void validatetoyslinktest() {
		dealspage.verifytoyslink();

	}

	@Test
	public void validateapplianceslinktest() {
		dealspage.verifyapplianceslink();

	}

	@Test
	public void gethdealstexttest() {
		String text = dealspage.getdealstext();
		text.equals("HOT DEALS under $20");
	}

	@Test
	public void enteremailtest() {

		dealspage.enteremail();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
