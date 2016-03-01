package Pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*The first page of the site. With search functionality on it*/
@DefaultUrl("https://focus.kontur.ru/")
public class SearchPage extends BasePage{

    public SearchPage(WebDriver driver){super(driver);}

	/*Element of the search field */
	@FindBy(xpath = "//*[@id='search-field']")
	public WebElement searchField;

	/*Element of the "Search" button, that starts search*/
	@FindBy(xpath = "//*[@id='SearchButton']")
	public WebElement searchButton;

	/*Method for entry data in the search field*/
	public void insertDataInSearchField(String entrydata){
		clickClean(searchField);
		searchField.sendKeys(entrydata);
	}

	}

