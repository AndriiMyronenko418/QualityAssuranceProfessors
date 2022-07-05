package AndriiTest;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage extends BasePage {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    private static final String PRODUCT_NAME = "//h1[contains(@class, 'product')]";
    private static final String PRODUCT_PRICE = "//*[contains(@*, 'price-container')]//*[contains(@*, 'offer-price')]";
    private static final String PRODUCT_COLOR = "//*[contains(@*, 'selected-color')]";
    private static final String SELECT_A_SIZE = "//select[@id='attr-size']";
    private static final String PRODUCT_SIZE_OPTION = "//option[@value='%s']";
    private static final String ADD_TO_CART = "//button[@data-add-to-cart-text='add to cart']";
    private static final String PROCEED_TO_CHECKOUT_BTN = "//*[@class='mini-cart-actions cart-actions']//a[contains(text(), 'Proceed to checkout')]";

    //constant
    private String testedName;
    private String testedColor;
    private String testedPrice;

    public String getTestedNameS() {
        return this.testedName;
    }

    public void getProductNameText() {
        testedName = $(PRODUCT_NAME).getText();
    }

    public String getTestedPriceS() {
        return this.testedPrice;
    }

    public void getProductPriceText() {
        testedPrice = $(PRODUCT_PRICE).getText();
    }

    public String getTestedColorS() {
        return this.testedColor;
    }

    public void getProductColorText() {
        testedColor = $(PRODUCT_COLOR).getText();
    }

    public WebElement getSizeSelector() {
        return $(SELECT_A_SIZE);
    }

    public WebElement getAddToCart() {
        return $(ADD_TO_CART);
    }

    public WebElement getSize(String testedSize) {
        return $(String.format(PRODUCT_SIZE_OPTION, testedSize));
    }

    public WebElement getProceedToCheckoutBtn() {
        return $(PROCEED_TO_CHECKOUT_BTN);
    }
}
