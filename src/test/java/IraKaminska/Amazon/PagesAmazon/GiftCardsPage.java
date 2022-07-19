package IraKaminska.Amazon.PagesAmazon;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GiftCardsPage extends BasePage {

    public GiftCardsPage(WebDriver driver) {
        super(driver);
    }

    private static final String OCCASION_JUST_BECAUSE = "//a[@aria-label='Just because']";
    private static final String OCCASION_BIRTHDAY = "//a[@aria-label='Birthday gift cards']";
    private static final String OCCASION_THANK_YOU = "//a[@aria-label='Thank you gift cards']";
    private static final String OCCASION_WORKPLACE = "//a[@aria-label='Workplace gift cards']";
    private static final String OCCASION_WEDDING = "//a[@aria-label='Wedding gift cards']";
    private static final String OCCASION_CONGRATS = "//a[@aria-label='Congratulations gift cards']";
    private static final String SEE_ALL_OCCASION = "//a[text()= 'See all occasions']";
    private static final String CHECK_ALL_OCCASIONS = "//h3[text()= 'All Occasions']";
    private static final String SEE_OPTIONS_EGIFT_CARDS = "//a[text()= 'See options']";
    private static final String STANDARD_DESIGN_GIFT_CARDS = "//button[@id='gc-customization-type-button-Designs']";
    private static final String ANIMATED_DESIGN_GIGT_CARD = "//button[@id='gc-customization-type-button-Animated']";
    private static final String YOUR_PHOTO_VIDEO_IN_GIFT_CARD = "//button[@id='gc-customization-type-button-Upload']";
    private static final String AMOUNT_DETAILS_25 = "//button[@id='gc-mini-picker-amount-1']";
    private static final String AMOUNT_DETAILS_100 = "//button[@id='gc-mini-picker-amount-4']";
    private static final String ENTER_AMOUNT = "//input[@id='gc-order-form-custom-amount']";
    private static final String EMAIL_DELIVERY = "//button[@id='gc-delivery-mechanism-button-Email-announce']";
    private static final String ENTER_AN_EMAIL_AREA = "//textarea[@placeholder='Enter an email for each recipient']";
    private static final String ENTER_FROM_WHOM_GIFT_CARD = "//input[@id='gc-order-form-senderName']";
    private static final String MESSAGE_AREA = "//textarea[@id='gc-order-form-message']";
    private static final String BUY_NOW_BUTTON = "//input[@id='gc-buy-box-bn']";
    private static final String ERROR = "//div[@class='a-box a-alert-inline a-alert-inline-error gc-inline-error']";
    private static final String SHOP_NOW_PHYSICAL_GIFT_CARD = "//a[text()= 'Shop now']";
    private static final String HIGHEST_AVERAGE_CUSTOMER_REWIEW = "//i[@class='a-icon a-icon-star-medium a-star-medium-4']";
    private static final String FORMAT_GIFT_BOX = "//span[text()= 'Gift Box']";
    private static final String CHRISTMAS_OCCASION = "//span[text()= 'Christmas']";
    private static final String SEE_SPECIALTY_GIFT_CARDS = "//a[text()= 'See all brands']";
    private static final String SEPHORA_BRAND_GIFT_CARDS = "//img[@alt='Sephora link image']";
    private static final String FREQUENTLY_ASKED_QUESTIONS = "//div[@itemprop='name']";
    private static final String HEADER_FREQUENTLY_ASKED_QUESTION = "//strong[text()= 'Frequently asked questions about Amazon.com gift cards']";

    public static final String AMOUNT_USD = "1000";
    public static final String EMAIL = "i.pushkarchuk@lntu.edu.ua";
    public static final String FROM = "Iryna Kaminska";
    public static final String MESSAGE = "Enjoy! Be blessed!";

    public WebElement getOccasionJustBecauseButton() {
        return $(OCCASION_JUST_BECAUSE);
    }

    public WebElement getOccasionBirthdayButton() {
        return $(OCCASION_BIRTHDAY);
    }

    public WebElement getOccasionThankYouButton() {
        return $(OCCASION_THANK_YOU);
    }

    public WebElement getOccasionWorkplaceButton() {
        return $(OCCASION_WORKPLACE);
    }

    public WebElement getOccasionWeddingutton() {
        return $(OCCASION_WEDDING);
    }

    public WebElement getOccasionCongratsButton() {
        return $(OCCASION_CONGRATS);
    }

    public WebElement getSeeAllOccasionsButton() {
        return $(SEE_ALL_OCCASION);
    }

    public WebElement checkOccasionGiftCards() {
        return $(CHECK_ALL_OCCASIONS);
    }

    public WebElement getSeeOptionsEGiftCardsButton() {
        return $(SEE_OPTIONS_EGIFT_CARDS);
    }

    public WebElement getGiftCardStandardDesignButton() {
        return $(STANDARD_DESIGN_GIFT_CARDS);
    }

    public WebElement getGiftCardAnimatedDesignButton() {
        return $(ANIMATED_DESIGN_GIGT_CARD);
    }

    public WebElement getYourPhotoVideoGiftCardButton() {
        return $(YOUR_PHOTO_VIDEO_IN_GIFT_CARD);
    }

    public WebElement getAmountDetails25Button() {
        return $(AMOUNT_DETAILS_25);
    }

    public WebElement getAmountDetails100Button() {
        return $(AMOUNT_DETAILS_100);
    }

    public WebElement getEnterAmountButton() {
        return $(ENTER_AMOUNT);
    }

    public WebElement getEmailDeliveryButton() {
        return $(EMAIL_DELIVERY);
    }

    public WebElement getEnterAnEmailButton() {
        return $(ENTER_AN_EMAIL_AREA);
    }

    public WebElement getEnterFromWhomGiftCardButton() {
        return $(ENTER_FROM_WHOM_GIFT_CARD);
    }

    public WebElement getMessageAreaButton() {
        return $(MESSAGE_AREA);
    }

    public WebElement getBuyNowButton() {
        return $(BUY_NOW_BUTTON);
    }

    public WebElement getCheck() {
        return $(ERROR);
    }

    public WebElement getShopNowPhysicalGiftCardsButton() {
        return $$(SHOP_NOW_PHYSICAL_GIFT_CARD).get(0);
    }

    public WebElement getHighestAverageCustomerRewiew() {
        return $(HIGHEST_AVERAGE_CUSTOMER_REWIEW);
    }

    public WebElement getFormatGiftBoxButton() {
        return $(FORMAT_GIFT_BOX);
    }

    public WebElement getChristmasOccasionButton() {
        return $(CHRISTMAS_OCCASION);
    }

    public boolean checkURLChristmasGiftCardsList() {
        return driver.getCurrentUrl().contains("format_browse");
    }

    public WebElement getSeeSpecialtyGiftCardsButton() {
        return $(SEE_SPECIALTY_GIFT_CARDS);
    }

    public WebElement getSephoraBrandButton() {
        return $(SEPHORA_BRAND_GIFT_CARDS);
    }

    public boolean checkUrlSephoraGiftCards() {
        return driver.getCurrentUrl().contains("Sephora");
    }

    public WebElement getQuestionOneButton() {
        return $$(FREQUENTLY_ASKED_QUESTIONS).get(0);
    }

    public WebElement getQuestionTwoButton() {
        return $$(FREQUENTLY_ASKED_QUESTIONS).get(1);
    }

    public WebElement getQuestionThreeButton() {
        return $$(FREQUENTLY_ASKED_QUESTIONS).get(2);
    }

    public WebElement checkFrequentlyAskedQuestions() {
        return $(HEADER_FREQUENTLY_ASKED_QUESTION);
    }
}