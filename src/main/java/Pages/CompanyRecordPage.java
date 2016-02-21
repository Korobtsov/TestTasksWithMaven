package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompanyRecordPage {
	private WebDriver driver;
	
	public CompanyRecordPage(WebDriver driver){
		this.driver = driver;
		}
	
	By INNfield = By.xpath("//dt[.='ИНН']");

	public By getINNfield() {
		return INNfield;
	}
			
	/*
	@FindBy(how=How.XPATH, xpath="//dt[.='ИНН']")
	private WebElement INNfield;
	
	public void INNfieldAsserting(){
		Assert.assertTrue(INNfield.isDisplayed());
	}
	*/
	
}
