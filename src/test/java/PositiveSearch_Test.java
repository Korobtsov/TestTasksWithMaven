import App.FireFoxSettings;
import Pages.MainPage;
import Pages.SearchResultPage;
import org.junit.Test;

public class PositiveSearch_Test extends FireFoxSettings {
	
	private String searchFieldInput = "A";

	@Test
	public void search() {
		MainPage mainPage = new MainPage(driver);
		mainPage.submitSearch(searchFieldInput);
		SearchResultPage searchResultPage = new SearchResultPage(driver);
		searchResultPage.PositiveSearch();
		}
	}
