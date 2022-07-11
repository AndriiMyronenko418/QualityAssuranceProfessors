package Safron.NewBalanceUa.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewBalanceProductPageElements extends BasePage {
    public NewBalanceProductPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String SIZE_BOARD = "//div[contains(@class,'size-body_')]";
    private static final String GET_TO_CART = "//button[@class='btn btn_primary product-buy js-product-buy']";
    private static final String ARTICLE = "//div[@class='product-info__code']";
    private static final String PRICE = "//span[@class='product-page-prices__price_new']";

    public List<WebElement> sizeBoard(){
        return $$(SIZE_BOARD);
    }

    public WebElement getToCartBtn(){
        return $(GET_TO_CART);
    }

    public WebElement article(){
        return $(ARTICLE);
    }

    public WebElement price(){
        return $(PRICE);
    }
}
