package Safron.MLB.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MLBCartPageElements extends BasePage {
    public MLBCartPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String NAME_PRODUCT = "//a[@data-talos='linkProductCart']";
    private static final String EACH_PRICE = "//div[@class='cart-item-price-container']//span[@class='footnote color-grey-medium unit-price']";

    public WebElement productName(){
        return $(NAME_PRODUCT);
    }

    public WebElement eachPrice(){
        return $(EACH_PRICE);
    }
}
