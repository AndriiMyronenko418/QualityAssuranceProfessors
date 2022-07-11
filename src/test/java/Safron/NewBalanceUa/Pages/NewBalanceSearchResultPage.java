package Safron.NewBalanceUa.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewBalanceSearchResultPage extends BasePage {
    public NewBalanceSearchResultPage(WebDriver driver) {
        super(driver);
    }

    private static final String PRODUCTS = "//a[@class='products__link']";

    public List<WebElement> products() {
        return $$(PRODUCTS);
    }
}
