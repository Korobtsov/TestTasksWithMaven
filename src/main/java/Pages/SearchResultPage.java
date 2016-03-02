package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class SearchResultPage extends SearchPage {
	
	@FindBy(xpath = "//*[@class='clearList']")
    public WebElement listOfResultsIsPrerentFlag;

	@FindBy(xpath = "//*[@class='nothingFound']")
	public WebElement NoResultsFlag;

    @FindBy(xpath = "//*[@class='marR12 js-subject-link']")
	public WebElement companyLink;

    @FindBys(@FindBy(xpath = "//*[@class='marR12 js-subject-link']"))
    public List<WebElement> companyLinks;

	public SearchResultPage(WebDriver driver){super(driver);}
}
