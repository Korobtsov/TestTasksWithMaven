package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends MainPage{

	public SearchResultPage(WebDriver driver){super(driver);}

	By listOfResultsIsPrerentFlag = By.xpath("//*[@class='clearList']");
	By NoResultsFlag = By.xpath("//*[@class='nothingFound']");
	By companyLink = By.xpath("//a[@class='marR12 js-subject-link']");
	
	public By getCompanyLink(){
		return companyLink;
	}

	public By getListOfResultsIsPrerentFlag() {
		return listOfResultsIsPrerentFlag;
	}

	public By getNoResultsFlag() {
		return NoResultsFlag;
	}
}
