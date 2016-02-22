package Pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//@DefaultUrl("https://focus.kontur.ru/")
public class MainPage extends BasePage{

    public MainPage(WebDriver driver){super(driver);}

	@FindBy(xpath = "//*[@id='search-field']")
	public WebElement searchField;
	@FindBy(xpath = "//*[@id='SearchButton']")
	public WebElement searchButton;


	public SearchResultPage submitSearch(String entrydata){
		BasePage basePage = new BasePage(getDriver());
		basePage.clickClean(searchField);
		searchField.sendKeys(entrydata);
		searchButton.click();
		return new SearchResultPage(getDriver());
	}
	}
