package NewBalance.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartViewPage extends BasePage {

    public CartViewPage(WebDriver driver) {
        super(driver);
    }

    private static final String CART_ITEM_SIZE = "//span[@class='product-info__text']";
    private static final String CART_ITEM_NAME = "//h5[@class='product-item-checkout__title']";
    private static final String CART_ITEM_PRICE = "//span[@class='prices__price'][contains(text(),'3 999 грн')]";

    public WebElement itemSize() {
        return $(CART_ITEM_SIZE);
    }

    public WebElement itemName() {
        return $(CART_ITEM_NAME);
    }

    public WebElement itemPrice() {
        return $(CART_ITEM_PRICE);
    }

    private String itemSize;
    private String itemName;
    private String itemPrice;

    public void setCartItemSize() {
        itemSize = itemSize().getText().substring(0, 2);
    }

    public String getCartItemSize() {
        return this.itemSize;
    }

    public void setCartItemName() {
        itemName = itemName().getText();
    }

    public String getCartItemName() {
        return this.itemName;
    }

    public void setCartItemPrice() {
        itemPrice = itemPrice().getText();
    }

    public String getCartItemPrice() {
        return this.itemPrice;
    }
}