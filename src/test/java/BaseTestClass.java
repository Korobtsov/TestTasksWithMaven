import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTestClass {
	
	public WebDriver driver;
	private final int DEFAULT_IMPLICITLY_WAIT = 5;

	/**
	 * Calling and maximizing Firefox browser
	 */
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(DEFAULT_IMPLICITLY_WAIT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}

	/**
	 * Closing browser after finishing
	 */
	@After
	public void tearDown(){
		driver.quit();
		}
}
