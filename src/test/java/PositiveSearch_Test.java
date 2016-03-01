import Pages.SearchPage;
import Pages.SearchResultPage;
import org.junit.Assert;
import org.junit.Test;

/*Test shows that Search functionality works for request with existing result  */
public class PositiveSearch_Test extends BaseTestClass {
	
	private String searchFieldInput = "A";

	@Test
	public void positiveSearch() {
		/*Open Search page*/
		SearchPage searchPage = new SearchPage(driver);
		searchPage.open();
		/*Inserting data into Search field*/
		searchPage.insertDataInSearchField(searchFieldInput);
		/*Click on the search button*/
		searchPage.searchButton.click();
		/*Asserting that No result message is present*/
		SearchResultPage searchResultPage = new SearchResultPage(driver);
		Assert.assertTrue(searchResultPage.listOfResultsIsPrerentFlag.isDisplayed());
		}
	}
