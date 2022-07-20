package NewBalance.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewBalanceKidsPageElements extends BasePage {
    public NewBalanceKidsPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String PINK_FILTER = "//label[@for='colorId5554']";
    private static final String LABEL = "//div[@class='select-label__item']";
    private static final String LABEL_CIRCLE_COLOR = LABEL + "//span[@style]";
    private static final String PRODUCTS = "//a[@class='products__link']";

    public WebElement pinkFilter(){
        return $(PINK_FILTER);
    }

    public WebElement labelCircleColor(){
        return $(LABEL_CIRCLE_COLOR);
    }

    public WebElement label(){
        return $(LABEL);
    }

    public List<WebElement> products(){
        return $$(PRODUCTS);
    }
}