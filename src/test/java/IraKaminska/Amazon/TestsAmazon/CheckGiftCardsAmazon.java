package IraKaminska.Amazon.TestsAmazon;

import BasePageAndTestInit.TestInit;
import IraKaminska.Amazon.PagesAmazon.GiftCardsPage;
import IraKaminska.Amazon.PagesAmazon.HomePageAmazon;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckGiftCardsAmazon extends TestInit {

    @Test
    public void checkGiftCardsAmazon() {

        HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
        GiftCardsPage giftCardsPage = new GiftCardsPage(driver);

        openUrl("https://www.amazon.com");
        homePageAmazon.getDeliverDontChangeButton();
        homePageAmazon.getGiftCardsButton().click();
        giftCardsPage.getOccasionJustBecauseButton().click();
        goBack();
        giftCardsPage.getOccasionBirthdayButton().click();
        goBack();
        giftCardsPage.getOccasionThankYouButton().click();
        goBack();
        giftCardsPage.getOccasionWorkplaceButton().click();
        goBack();
        giftCardsPage.getOccasionWeddingutton().click();
        goBack();
        giftCardsPage.getOccasionCongratsButton().click();
        goBack();
        giftCardsPage.getSeeAllOccasionsButton().click();

        Assert.assertTrue(giftCardsPage.checkOccasionGiftCards().getText().contains("All Occasions"));
    }
}