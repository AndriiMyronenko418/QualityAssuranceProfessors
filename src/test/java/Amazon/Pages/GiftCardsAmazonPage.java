package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GiftCardsAmazonPage extends BasePage {

    public GiftCardsAmazonPage(WebDriver driver) {
        super(driver);
    }

    private static final String FILTERS_FOR_GIFT_CARDS = "//span[@class='a-size-base a-color-base'][text()= '%s']";
    private static final String HIGHEST_STAR_GIFT_CARDS = "//i[@class='a-icon a-icon-star-medium a-star-medium-4']";
    private static final String SELECTED_PRODUCTS_LIST = "//div[@class='a-section a-spacing-base']";
    private static final String TITLE_OF_SELECTED_AMAZON_BRAND_EGIFT_CARDS = "//span[@class='a-size-base-plus a-color-base a-text-normal']";

    public WebElement getFilterSectionGiftCards(String filtersName) {
        return $(String.format(FILTERS_FOR_GIFT_CARDS, filtersName));
    }

    public WebElement getHighestStarGiftCards() {
        return $(HIGHEST_STAR_GIFT_CARDS);
    }

    public List<WebElement> getSelectedProductsList() {
        return getElementsByVisibility(SELECTED_PRODUCTS_LIST);
    }

    public List<WebElement> getProductTitle() {
        return $$(TITLE_OF_SELECTED_AMAZON_BRAND_EGIFT_CARDS);
    }
}