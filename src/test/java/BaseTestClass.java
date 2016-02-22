import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTestClass {
	
	public WebDriver driver;
	private String sourceURL = "https://focus.kontur.ru/";
	private final int DEFAULT_IMPLICITLY_WAIT = 5;

	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.get(sourceURL);
		driver.manage().timeouts().implicitlyWait(DEFAULT_IMPLICITLY_WAIT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
		
	@After
	public void tearDown(){
		driver.quit();
	}
}
