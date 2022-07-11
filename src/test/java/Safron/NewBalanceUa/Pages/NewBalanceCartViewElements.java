package Safron.NewBalanceUa.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewBalanceCartViewElements extends BasePage {
    public NewBalanceCartViewElements(WebDriver driver) {
        super(driver);
    }

    private static final String ARTICLE = "//div[@class='product-item-checkout__description']";
    private static final String PRICE = "//div[@class='prices product-item-checkout__price']";
    private static final String SIZE = "//span[@class='product-info__text']";

    public WebElement article() {
        return $(ARTICLE);
    }

    public WebElement price() {
        return $(PRICE);
    }

    public WebElement size() {
        return $(SIZE);
    }
}
