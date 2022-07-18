package Safron.Foxtrot.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoxtrotHomePageElements extends BasePage {

    public FoxtrotHomePageElements(WebDriver driver) {
        super(driver);
    }

    private static final String PС_CATEGORY = "//div[@class='main-page-container']//li[@data-category='32021']";
    private static final String SEARCH_SPACE = "//input[@type='search']";
    private static final String SEARCH_BTN = "//input[@class='header-search__button evinent-search-button']";

    public WebElement pсCategory() {
        return $(PС_CATEGORY);
    }

    public WebElement searchSpace() {
        return driver.findElement(By.xpath(SEARCH_SPACE));
    }

    public WebElement searchBtn() {
        return driver.findElement(By.xpath(SEARCH_BTN));
    }
}