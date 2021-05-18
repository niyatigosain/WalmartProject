package WalmartTest_Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import WalmartTest_TestUtil.TestUtil;
import WalmartTest_TestUtil.WebEventListener;

public class TestBase {

// Creating variables and initializing them
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;


// 1.)Reading config.properties class by creating the constructor
	public TestBase() {
	
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\User\\eclipse-workspace\\WalmartTest\\src\\main\\java\\WalmartTest_Config\\Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

// 2.)Initializing the browser either chrome or firefox		

	public static void Initialization() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\User\\Desktop\\Software Testing\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\User\\Desktop\\Software Testing\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		

//3.) Applying  delete cookies, maximize windows, implicit wait & timeout customizable
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}
}
