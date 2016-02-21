import App.FireFoxSettings;
import Pages.CompanyRecordPage;
import Pages.MainPage;
import Pages.SearchResultPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;


import java.util.List;

public class AssertingEveryThirdINN_Test extends FireFoxSettings {
		
	private String searchFieldInput = "A";
		
	@Test
	public void VerifyINNfield(){
		MainPage mainPage = new MainPage(driver);
		mainPage.submitSearch(searchFieldInput);
		SearchResultPage searchResultPage = new SearchResultPage(driver);
		CompanyRecordPage companyRecordPage = new CompanyRecordPage(driver);
		List<WebElement> companyLinksList = driver.findElements(searchResultPage.getCompanyLink());
		for(int i=0; i < companyLinksList.size(); i++){
			if((i+1)%3 == 0){
				companyLinksList = driver.findElements(searchResultPage.getCompanyLink());
				companyLinksList.get(i).click();
				Assert.assertTrue(driver.findElement(companyRecordPage.getINNfield()).isDisplayed());
				mainPage.submitSearch(searchFieldInput);
				}
		}
	} 
}