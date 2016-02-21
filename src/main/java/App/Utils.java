package App;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {
	
	private WebDriver driver;
	
	public Utils(WebDriver driver){
		this.driver = driver;
	}
		
	public void clickClean(WebElement a) {
		a.clear();
		a.click();
		}
}
