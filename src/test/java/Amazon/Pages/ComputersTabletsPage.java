package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ComputersTabletsPage extends BasePage {

    public ComputersTabletsPage(WebDriver driver) {
        super(driver);
    }

    private static final String LAPTOPS = "//span[text()= 'Laptops']";
    private static final String TRADITIONAL_LAPTOPS = "//span[text()= 'Traditional Laptops']";
    private static final String ENTER_MIN_PRICE = "//input[@id='low-price']";
    private static final String ENTER_MAX_PRICE = "//input[@id='high-price']";
    private static final String GO_PRICE_BUTTON = "//input[@aria-labelledby='a-autoid-1-announce']";
    private static final String SORT_BY = "//span[text()= 'Sort by:']";
    private static final String PRICE_LOW_TO_HIGH = "//li[@aria-labelledby='s-result-sort-select_1']";
    private static final String PRICE_LIST = "//span[@class='a-price-whole']";

    public WebElement getLaptopsButton() {
        return $(LAPTOPS);
    }

    public WebElement getTraditionalLaptopsButton() {
        return $(TRADITIONAL_LAPTOPS);
    }

    public WebElement getEnterMinPrice() {
        return $(ENTER_MIN_PRICE);
    }

    public WebElement getEnterMaxPrice() {
        return $(ENTER_MAX_PRICE);
    }

    public WebElement getGoPriceButton() {
        return $(GO_PRICE_BUTTON);
    }

    public WebElement getSortByButton() {
        return $(SORT_BY);
    }

    public WebElement getPriceLowToHighButton() {
        return $(PRICE_LOW_TO_HIGH);
    }

    public List<WebElement> checkPrice() {
        return $$(PRICE_LIST);
    }
}