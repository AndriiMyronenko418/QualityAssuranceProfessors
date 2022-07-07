package AndriiTest;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends BasePage {
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    private static final String PRODUCT_NAME = "//h3[contains(@class, 'info-name')]";
    private static final String PRODUCT_COLOR = "//dt[contains(text(), 'Color')]//following-sibling::dd[contains(@*, 'detail')]";
    private static final String PRODUCT_PRICE = "//*[contains(@*, 'detail-total')]";
    private static final String PRODUCT_SIZE = "//dt[contains(text(), 'Size')]//following-sibling::dd[contains(@*, 'detail')]";
    private static final String CHECKOUT_SECURELY = "//*[@*='checkout-action-container']//a[contains(@title, 'CHECKOUT')]";

    private String testedName;
    private String testedColor;
    private String testedPrice;
    private String testedSize;

    public WebElement getCheckoutSecurelyBtn() {
        return $(CHECKOUT_SECURELY);
    }

    public String getTestedNameS() {
        return this.testedName;
    }

    public void getProductNameText() {
        testedName = $(PRODUCT_NAME).getText();
    }

    public String getTestedColorS() {
        return this.testedColor;
    }

    public void getProductColorText() {
        testedColor = $(PRODUCT_COLOR).getText().split("/")[0];
    }

    public String getTestedPriceS() {
        return this.testedPrice;
    }

    public void getProductPriceText() {
        testedPrice = $(PRODUCT_PRICE).getText();
    }

    public String getTestedSizeS() {
        return this.testedSize;
    }

    public void getProductSizeText() {
        testedSize = $(PRODUCT_SIZE).getText();
    }
}
