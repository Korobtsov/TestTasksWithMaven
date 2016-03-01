package Pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

/*Page for record of opened company*/
public class CompanyRecordPage extends SearchResultPage{
	private WebDriver driver;
	
	public CompanyRecordPage(WebDriver driver){
		super(driver);
		}
	
	@FindBy(how= How.XPATH, xpath="//dt[.='ИНН']")
	public WebElement INNfield;

	/*Assert presence of INN field*/
	public void INNfieldAsserting(){
		Assert.assertTrue(INNfield.isDisplayed());
	}

	
}
