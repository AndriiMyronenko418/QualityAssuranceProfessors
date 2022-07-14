package Safron.MLB.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MLBProductPageElements extends BasePage {
    public MLBProductPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String SIZE_XL_BTN = "//a[@aria-label='Size XL']";
    private static final String QUANTITY_CONTAINER = "//div[@class='product-quantity-container']//div[@class='drop-down-selected']";
    private static final String QUANTITY_LIST = "//li[@data-talos='labelItemOnDropdown']";
    private static final String ADD_TO_CART_BTN = "//button[@data-talos='buttonAddToCart']";
    private static final String NAME_PRODUCT = "//h1";
    private static final String PRICE_PRODUCT = "//div[@data-trk-id='pdp-price']";
    private static final String SELECT_PLAYER = "//div[@aria-label='Select Player']";
    private static final String PLAYER = "//li[@id='0 focused item']";

    public WebElement sizeXLBtn(){
        return $(SIZE_XL_BTN);
    }

    public WebElement quantityContainer(){
        return $(QUANTITY_CONTAINER);
    }

    public List<WebElement> quantityList(){
        return $$(QUANTITY_LIST);
    }

    public WebElement addToCartBtn(){
        return $(ADD_TO_CART_BTN);
    }

    public WebElement productName(){
        return $(NAME_PRODUCT);
    }

    public WebElement productPrice(){
        return $(PRICE_PRODUCT);
    }

    public WebElement selectPlayer(){
        return $(SELECT_PLAYER);
    }

    public WebElement player(){
        return $(PLAYER);
    }
}
