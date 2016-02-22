import Pages.MainPage;
import Pages.SearchResultPage;
import org.junit.Assert;
import org.junit.Test;


public class NegativeSearch_Test extends BaseTestClass {
	
	private String searchFieldInput = "Randomize";
			
	@Test
	public void search() {
		MainPage mainPage = new MainPage(driver);
		mainPage.submitSearch(searchFieldInput);
		SearchResultPage searchResultPage = new SearchResultPage(driver);
		Assert.assertTrue(driver.findElement(searchResultPage.getNoResultsFlag()).isDisplayed());
		}
	}
