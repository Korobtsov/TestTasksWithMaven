package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class SearchResultPage extends SearchPage {

	public SearchResultPage(WebDriver driver){super(driver);}

    /*Element is present if previous search was successful*/
	@FindBy(xpath = "//*[@class='clearList']")
    public WebElement listOfResultsIsPrerentFlag;

    /*Element is present if nothing were found by search*/
	@FindBy(xpath = "//*[@class='nothingFound']")
	public WebElement NoResultsFlag;

    /*Element complies to a company record's link*/
	@FindBy(xpath = "//*[@class='marR12 js-subject-link']")
	public WebElement companyLink;

    /*All company record's links*/
    @FindBys(@FindBy(xpath = "//*[@class='marR12 js-subject-link']"))
    public List<WebElement> companyLinks;

}
