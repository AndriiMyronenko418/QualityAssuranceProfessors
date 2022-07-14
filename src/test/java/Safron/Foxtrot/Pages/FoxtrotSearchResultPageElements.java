package Safron.Foxtrot.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoxtrotSearchResultPageElements extends BasePage {
    public FoxtrotSearchResultPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String PRODUCT_COUNT_MESSAGE = "//label[@id='product-count-message']";

    public WebElement productCountMessage() {
        return $(PRODUCT_COUNT_MESSAGE);
    }
}