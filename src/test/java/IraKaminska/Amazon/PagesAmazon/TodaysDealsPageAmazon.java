package IraKaminska.Amazon.PagesAmazon;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TodaysDealsPageAmazon extends BasePage {

    public TodaysDealsPageAmazon(WebDriver driver) {
        super(driver);
    }

    private static final String AVAILABLE_TODAYS_DEALS = "//span[text()= 'Available']";
    private static final String PRIME_DEALS = "//i[@class='a-icon a-icon-prime PrimeFilter-module__checkboxLabelIcon_3gXLnwZ72n2cHxB4bZjQ01']";
    private static final String BEST_DEAL = "//span[text()= 'Best deal']";
    private static final String DISCOUNT_50_OFF = "//span[text()= '50% off or more']";
    private static final String PRICE_50_TO_100 = "//span[text()= '$50 to $100']";
    private static final String HIGHESR_AVERAGE_CUSTOMER_REVIEW = "//i[@class='a-icon a-icon-star a-star-4']";
    private static final String SORT_BY = "//span[@id='sorting_dropdown0']";
    private static final String DISCOUNT_HIGH_TO_LOW = "//a[@id='sorting_dropdown0_2']";
    private static final String SORTED_TODAYS_DEALS = "//span[@id='sorting_dropdown0']";

    public WebElement getAvailableTodaysDealsButton() {
        return $(AVAILABLE_TODAYS_DEALS);
    }

    public WebElement getPrimeDealsButton() {
        return $(PRIME_DEALS);
    }

    public WebElement get50OffAndMoreDiscountButton() {
        return $(DISCOUNT_50_OFF);
    }

    public WebElement getBestDealButton() {
        return $(BEST_DEAL);
    }

    public WebElement getPrice50To100Button() {
        return $(PRICE_50_TO_100);
    }

    public WebElement getHighestAvarageCustomerReviewButton() {
        return $(HIGHESR_AVERAGE_CUSTOMER_REVIEW);
    }

    public WebElement getSortByButton() {
        return $(SORT_BY);
    }

    public WebElement getDiscountHighToLow() {
        return $(DISCOUNT_HIGH_TO_LOW);
    }

    public WebElement checkSortedTodaysDeals() {
        return $(SORTED_TODAYS_DEALS);
    }
}