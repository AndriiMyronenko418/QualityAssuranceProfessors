package Amazon.Tests;

import Amazon.Pages.GiftCardsAmazonPage;
import Amazon.Pages.HomePage;
import BasePageAndTestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckSpecialtyGiftCard extends TestInit {

    @DataProvider(name = "creation_Special_Gift_Card")
    public Object[][] CreationOptions() {
        return new Object[][]{
                {"Standard", "50", "i.pushkarchuk@lntu.edu.ua", "Iryna", "Be happy!"},
                {"Animated", "75", "kim.kaminska@gmail.com", "Anastasia", "Enjoy!"},
                {"Your Photo/Video", "100", "i.kaminska@lutsk-ntu.com.ua", "Lana", "Have fun!"}};
    }

    @Test(dataProvider = "creation_Special_Gift_Card")
    public void checkSpecialGiftCard(String design, String amount, String receiversEmail, String senderName, String message) {

        HomePage homePage = new HomePage(driver);
        GiftCardsAmazonPage giftCardsAmazonPage = new GiftCardsAmazonPage(driver);

        openUrl("https://www.amazon.com");
        homePage.getDeliveryDontChangeButton();
        homePage.getHeaderSpecialSections("Gift Cards").click();
        giftCardsAmazonPage.getSeeOptionsOfEGiftCards().click();
        giftCardsAmazonPage.getSelectGiftCardDesign(design).click();
        scroll(30);
        giftCardsAmazonPage.getSelectGigtCardInAmount(amount).click();
        scroll(50);
        giftCardsAmazonPage.getInputReceiversEmail().sendKeys(receiversEmail);
        giftCardsAmazonPage.getInputSenredName().sendKeys(senderName);
        giftCardsAmazonPage.getInputMessage().sendKeys(message);
        sleep(5);

        Assert.assertTrue(giftCardsAmazonPage.getGiftCardPrice(amount).getText().contains(amount));
        System.out.println(design + " gift card amount is: " + "$" + amount + ".");
    }
}