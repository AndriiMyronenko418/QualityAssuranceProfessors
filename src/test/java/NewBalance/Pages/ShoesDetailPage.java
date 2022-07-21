package NewBalance.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoesDetailPage extends BasePage {
    public ShoesDetailPage(WebDriver driver) {
        super(driver);
    }

    private static final String PRODUCT_SIZE = "//p[@data-size-val='61110']";
    private static final String PRODUCT_NAME = "//h2[@class='product-info__title']";
    private static final String PRODUCT_PRICE = "//span[@data-price='3999']";

    public WebElement productSize() {
        return $(PRODUCT_SIZE);
    }

    public WebElement productName() {
        return $(PRODUCT_NAME);
    }

    public WebElement productPrice() {
        return $(PRODUCT_PRICE);
    }

    private String testedSize;
    private String testedName;
    private String testedPrice;

    public void setProductSizeText() {
        testedSize = productSize().getText().substring(0, 2);
    }

    public String getTestedSize() {
        return this.testedSize;
    }

    public void setProductNameText() {
        testedName = productName().getText();
    }

    public String getTestedName() {
        return this.testedName;
    }

    public void setProductPriceText() {
        testedPrice = productPrice().getText();
    }

    public String getTestedPrice() {
        return this.testedPrice;
    }
}