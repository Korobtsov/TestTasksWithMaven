import Pages.SearchPage;
import Pages.SearchResultPage;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test shows that Search functionality works for request without existing result
 */
public class NegativeSearch_Test extends BaseTestClass {
	
	private String searchFieldInput = "Randomize";
			
	@Test
	public void negativeSearch() {
		/**
		 * Open Search page
		 */
		SearchPage searchPage = new SearchPage(driver);
		searchPage.open();
		/**
		 * Inserting data into Search field
		 */
		searchPage.insertDataInSearchField(searchFieldInput);
		/**
		 * Click on the search button
		 */
		searchPage.pressOnSearchButton();
		/**
		 * Asserting that "No Result" message is present
		 */
		SearchResultPage searchResultPage = new SearchResultPage(driver);
		Assert.assertTrue("Asserting presence of the No result message", searchResultPage.NoResultsFlag.isDisplayed());
		}
	}
