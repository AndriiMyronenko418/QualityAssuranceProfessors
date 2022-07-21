package Amazon.Tests;

import Amazon.Pages.GiftCardsAmazonPage;
import Amazon.Pages.HomePage;
import BasePageAndTestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBirthdayGiftCard extends TestInit {

    @Test
    public void checkBirthdayGiftCard() {

        HomePage homePage = new HomePage(driver);
        GiftCardsAmazonPage giftCardsAmazonPage = new GiftCardsAmazonPage(driver);

        openUrl("https://www.amazon.com");
        homePage.getDeliveryDontChangeButton();
        homePage.getHeaderSpecialSections("Gift Cards").click();
        giftCardsAmazonPage.getFilterSectionGiftCards("eGift Card").click();
        giftCardsAmazonPage.getFilterSectionGiftCards("Amazon").click();
        scroll(500);
        giftCardsAmazonPage.getFilterSectionGiftCards("Birthday").click();
        giftCardsAmazonPage.getHighestStarGiftCards().click();
        giftCardsAmazonPage.getFilterSectionGiftCards("Animation").click();

        for (int j = 0; j < giftCardsAmazonPage.getSelectedProductsList().size(); j++) {
            Assert.assertTrue(giftCardsAmazonPage.getProductTitle().get(j).getText().contains("Amazon.com eGift Card"));
        }
    }
}