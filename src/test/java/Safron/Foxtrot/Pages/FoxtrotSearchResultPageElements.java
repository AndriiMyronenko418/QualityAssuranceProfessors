package Safron.Foxtrot.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FoxtrotSearchResultPageElements extends BasePage {

    public FoxtrotSearchResultPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String PRODUCT_COUNT_MESSAGE = "//label[@id='product-count-message']";
    private static final String PRODUCTS = "//div[contains(@class,'card js-card sc-product')]";
    private static final String WASH3676 = "//div[@data-id='3676']//a[@class='card__title']";

    public WebElement productCountMessage() {
        return $(PRODUCT_COUNT_MESSAGE);
    }

    public WebElement price() {
        return $(PRODUCT_COUNT_MESSAGE);
    }

    public List<WebElement> getProducts() {
        return $$(PRODUCTS);
    }

    public WebElement wash3676() {
        return $(WASH3676);
    }
}