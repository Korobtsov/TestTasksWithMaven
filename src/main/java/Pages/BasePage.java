package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject{
    private static final int DEFAULT_IMPLICITLY_WAIT = 15000;

    private final int implicitWait = Integer.parseInt(System.getProperty("webdriver.timeouts.implicitlywait", Integer.toString(DEFAULT_IMPLICITLY_WAIT)));

    public BasePage(WebDriver driver) {
        super(driver, DEFAULT_IMPLICITLY_WAIT);
    }

    /*Getter for default value of the wait delay*/
    protected int getImplicitWait() {
        return implicitWait;
    }

    /*Help method for click on editable fields*/
    public void clickClean(WebElement a) {
        a.clear();
        a.click();
    }

}
