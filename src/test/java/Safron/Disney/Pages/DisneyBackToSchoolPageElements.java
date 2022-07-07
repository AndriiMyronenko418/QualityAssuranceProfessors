package Safron.Disney.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DisneyBackToSchoolPageElements extends BasePage {
    public DisneyBackToSchoolPageElements(WebDriver driver) {
        super(driver);
    }
    private static final String FIRST_PRODUCT_NAME = "//div[@data-pid='464022334657']//a[@class='product__tile_link']";
    private static final String FIRST_PRODUCT_PRICE = "//div[@data-pid='464022334657']//div[@class='price']";
    private static final String PRODUCT_QUICK_SHOP = "//div[@data-pid='464022334657']//a[@data-toggle='modal']";
    private static final String PRODUCT_NAME_CART = "//h1[@class='product-name cart--desktop']";
    private static final String PRODUCT_PRICE_CART = "//div[@class='prices cart--desktop']//span[@class='sales final-price-red-color']";
    private static final String ADD_BAG_PRODUCT_BTN = "//div[@class='row cart-and-ipay']//button[@data-pid='464022334657']";
    private static final String ADD_WISH_BTN = "//span[@class='button--secondary ']";

    public WebElement firstProductName(){
        return $(FIRST_PRODUCT_NAME);
    }
    public WebElement firstProductPrice(){
        return $(FIRST_PRODUCT_PRICE);
    }
    public WebElement productQuickShopBtn(){
        return $(PRODUCT_QUICK_SHOP);
    }
    public WebElement productPriceCart(){
        return $(PRODUCT_PRICE_CART);
    }
    public WebElement productNameCart(){
        return $(PRODUCT_NAME_CART);
    }
    public WebElement addBagProductBtn(){
        return $(ADD_BAG_PRODUCT_BTN);
    }
    public WebElement addWishBtn(){
        return $(ADD_WISH_BTN);
    }

}
