package Safron.Foxtrot.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoxtrotProductPageElements extends BasePage {
    public FoxtrotProductPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String PRICE = "//div[@class='product-box__main_price']";

    public WebElement price() {
        return $(PRICE);
    }
}