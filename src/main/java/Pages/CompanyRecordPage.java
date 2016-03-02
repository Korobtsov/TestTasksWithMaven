package Pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

/**
 * Page for record of opened company
 */
public class CompanyRecordPage extends SearchResultPage{
			
	@FindBy(how= How.XPATH, xpath="//dt[.='ИНН']")
	public WebElement INNfield;

	public CompanyRecordPage(WebDriver driver){
		super(driver);
		}

	/**
	 * Assert presence of INN field
	 */
	public void INNfieldAsserting(){
		Assert.assertTrue(INNfield.isDisplayed());
		}
}	

