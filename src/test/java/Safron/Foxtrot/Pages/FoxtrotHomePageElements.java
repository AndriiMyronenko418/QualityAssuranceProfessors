package Safron.Foxtrot.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoxtrotHomePageElements extends BasePage {

    public FoxtrotHomePageElements(WebDriver driver) {
        super(driver);
    }

    private static final String PС_CATEGORY = "//div[@class='main-page-container']//li[@data-category='32021']";

    public WebElement pсCategory() {
        return $(PС_CATEGORY);
    }
}