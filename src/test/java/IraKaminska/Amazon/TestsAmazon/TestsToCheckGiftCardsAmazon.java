package IraKaminska.Amazon.TestsAmazon;

import BasePageAndTestInit.TestInit;
import IraKaminska.Amazon.PagesAmazon.GiftCardsPage;
import IraKaminska.Amazon.PagesAmazon.HomePageAmazon;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsToCheckGiftCardsAmazon extends TestInit {

    @Test
    public void checkEGiftCardsAmazon() {

        HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
        GiftCardsPage giftCardsPage = new GiftCardsPage(driver);

        openUrl("https://www.amazon.com");
        homePageAmazon.getDeliverDontChangeButton();
        homePageAmazon.getGiftCardsButton().click();
        scroll(100);
        giftCardsPage.getSeeOptionsEGiftCardsButton().click();
        giftCardsPage.getGiftCardStandardDesignButton().click();
        giftCardsPage.getGiftCardAnimatedDesignButton().click();
        giftCardsPage.getYourPhotoVideoGiftCardButton().click();
        scroll(200);
        giftCardsPage.getAmountDetails25Button().click();
        giftCardsPage.getAmountDetails100Button().click();
        giftCardsPage.getEnterAmountButton().sendKeys(GiftCardsPage.AMOUNT_USD);
        scroll(300);
        giftCardsPage.getEmailDeliveryButton().click();
        giftCardsPage.getEnterAnEmailButton().sendKeys(GiftCardsPage.EMAIL);
        giftCardsPage.getEnterFromWhomGiftCardButton().sendKeys(GiftCardsPage.FROM);
        giftCardsPage.getMessageAreaButton().sendKeys((GiftCardsPage.MESSAGE));
        giftCardsPage.getBuyNowButton().click();

        Assert.assertTrue(giftCardsPage.getCheck().getText().contains("Please upload an image"));
    }

    @Test
    public void checkPhysicalGiftcard() {

        HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
        GiftCardsPage giftCardsPage = new GiftCardsPage(driver);

        openUrl("https://www.amazon.com");
        homePageAmazon.getDeliverDontChangeButton();
        homePageAmazon.getGiftCardsButton().click();
        scroll(100);
        giftCardsPage.getShopNowPhysicalGiftCardsButton().click();
        giftCardsPage.getHighestAverageCustomerRewiew().click();
        scroll(300);
        giftCardsPage.getFormatGiftBoxButton().click();
        giftCardsPage.getChristmasOccasionButton().click();

        Assert.assertTrue(giftCardsPage.checkURLChristmasGiftCardsList());
    }

    @Test
    public void checkSpecialtyGiftCards() {

        HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
        GiftCardsPage giftCardsPage = new GiftCardsPage(driver);

        openUrl("https://www.amazon.com");
        homePageAmazon.getDeliverDontChangeButton();
        homePageAmazon.getGiftCardsButton().click();
        scroll(300);
        giftCardsPage.getSeeSpecialtyGiftCardsButton().click();
        giftCardsPage.getSephoraBrandButton().click();

        Assert.assertTrue(giftCardsPage.checkUrlSephoraGiftCards());
    }

    @Test
    public void checkFrequentlyAskedQuestionAboutGiftCards() {

        HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
        GiftCardsPage giftCardsPage = new GiftCardsPage(driver);

        openUrl("https://www.amazon.com");
        homePageAmazon.getDeliverDontChangeButton();
        homePageAmazon.getGiftCardsButton().click();
        scroll(5);
        giftCardsPage.getQuestionOneButton().click();
        giftCardsPage.getQuestionTwoButton().click();
        giftCardsPage.getQuestionThreeButton().click();

        Assert.assertTrue(giftCardsPage.checkFrequentlyAskedQuestions().getText().contains("Frequently asked questions"));
    }
}