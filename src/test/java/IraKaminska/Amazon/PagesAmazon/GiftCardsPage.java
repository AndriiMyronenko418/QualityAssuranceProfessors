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
}