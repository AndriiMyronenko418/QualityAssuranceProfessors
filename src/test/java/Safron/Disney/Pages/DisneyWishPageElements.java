package Safron.Disney.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DisneyWishPageElements extends BasePage {
    public DisneyWishPageElements(WebDriver driver) {
        super(driver);
    }
    private static final String PRODUCT_NAME_WISH = "//div[@data-pid='464022334657']//div[@class='product__tile_name']";
    private static final String PRODUCT_PRICE_WISH = "//div[@data-pid='464022334657']//span[@class='range']";

    public WebElement productNameWish(){
        return $(PRODUCT_NAME_WISH);
    }
    public WebElement productPriceWish(){
        return $(PRODUCT_PRICE_WISH);
    }
}
