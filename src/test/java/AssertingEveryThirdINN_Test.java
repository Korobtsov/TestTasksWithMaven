import Pages.CompanyRecordPage;
import Pages.SearchPage;
import Pages.SearchResultPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;


import java.util.List;

/*Asserting that every third company has INN field in its record*/
public class AssertingEveryThirdINN_Test extends BaseTestClass {
		
	private String searchFieldInput = "A";
		
	@Test
	public void VerifyINNfield(){
		/*Open Search page*/
		SearchPage searchPage = new SearchPage(driver);
		searchPage.open();
		/*Inserting data into Search field*/
		searchPage.insertDataInSearchField(searchFieldInput);
		/*Click on the search button*/
		searchPage.searchButton.click();
		SearchResultPage searchResultPage = new SearchResultPage(driver);
		CompanyRecordPage companyRecordPage = new CompanyRecordPage(driver);
		/*Adding all company links to array*/
		List<WebElement> companyLinksList = searchResultPage.companyLinks;
		/*Choosing every third company*/
		for(int i=0; i < companyLinksList.size(); i++){
			if((i+1)%3 == 0){
				companyLinksList = searchResultPage.companyLinks;
				companyLinksList.get(i).click();
				/*Asserting presence of INN field*/
				Assert.assertTrue(companyRecordPage.INNfield.isDisplayed());
				/*Search again for ability to use next company's link*/
				searchPage.insertDataInSearchField(searchFieldInput);
				searchPage.searchButton.click();
				}
		}
	}
}