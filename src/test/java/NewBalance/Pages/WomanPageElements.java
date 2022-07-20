package NewBalance.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class WomanPageElements extends BasePage {
    public WomanPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String EVERYDAY_SHOES = "//a[@title='%s']";
    private static final String LIST_OF_SHOES = "//li[@data-product-id='WL574EVG']";
    private static final String LIST_OF_SIZE = "//div[@class='size-dropdown__body size-body']/child::div";
    private static final String ADD_TO_CART = "//button[@class='btn btn_primary product-buy js-product-buy']";

    public List<WebElement> listOfSize() {
        return $$(LIST_OF_SIZE);
    }

    public WebElement addToCart() {
        return $(ADD_TO_CART);
    }

    public WebElement getCategory(String options) {
        return $(String.format(EVERYDAY_SHOES, options));
    }

    public WebElement getFavourite() {
        return $(LIST_OF_SHOES);
    }

}