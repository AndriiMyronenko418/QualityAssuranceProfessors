package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

import java.util.List;

public class GiftCardsAmazonPage extends BasePage {

    public GiftCardsAmazonPage(WebDriver driver) {
        super(driver);
    }

    private static final String FILTERS_FOR_GIFT_CARDS = "//span[@class='a-size-base a-color-base'][text()= '%s']";
    private static final String HIGHEST_STAR_GIFT_CARDS = "//i[@class='a-icon a-icon-star-medium a-star-medium-4']";
    private static final String SELECTED_PRODUCTS_LIST = "//div[@class='a-section a-spacing-base']";
    private static final String TITLE_OF_SELECTED_AMAZON_BRAND_EGIFT_CARDS = "//span[@class='a-size-base-plus a-color-base a-text-normal']";
    private static final String SEE_OPTIONS_OF_EGIFT_CARDS = "//a[text()= 'See options']";
    private static final String SELECT_GIFT_CARD_DESIGN = "//button[@class='a-button-text gc-customizationType-button'][contains(text(), '%s')]";
    private static final String SELECT_GIFT_CARD_AMOUNT = "//button[@value='%s']";
    private static final String ENTER_RECEIVERS_EMAIL = "//textarea[@id='gc-order-form-recipients']";
    private static final String ENTER_SENDER_NAME = "//input[@id='gc-order-form-senderName']";
    private static final String ENTER_MESSAGE = "//textarea[@id='gc-order-form-message']";
    private static final String GIFT_CARD_PRICE = "//span[@class='a-color-price a-text-bold'][contains(text(), '%s')]";

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

    public WebElement getSeeOptionsOfEGiftCards() {
        return $(SEE_OPTIONS_OF_EGIFT_CARDS);
    }

    public WebElement getSelectGiftCardDesign(String option) {
        return $(String.format(SELECT_GIFT_CARD_DESIGN, option));
    }

    public WebElement getSelectGigtCardInAmount(String option) {
        return $(String.format(SELECT_GIFT_CARD_AMOUNT, option));
    }

    public WebElement getInputReceiversEmail() {
        return $(ENTER_RECEIVERS_EMAIL);
    }

    public WebElement getInputSenredName() {
        return $(ENTER_SENDER_NAME);
    }

    public WebElement getInputMessage() {
        return $(ENTER_MESSAGE);
    }

    public WebElement getGiftCardPrice(String option) {
        return $(String.format(GIFT_CARD_PRICE, option));
    }
}