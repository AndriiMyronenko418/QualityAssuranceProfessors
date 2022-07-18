package AndriiTest.Tests;

import AndriiTest.Pages.*;
import BasePageAndTestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelp extends TestInit {

    @Test
    public void testHelp() {

        HomePage homePage = new HomePage(driver);
        HelpPage helpPage = new HelpPage(driver);
        FAQPage faqPage = new FAQPage(driver);
        ReturnsPage returnsPage = new ReturnsPage(driver);
        TrackMyOrderPage trackMyOrderPage = new TrackMyOrderPage(driver);
        EmailUsPage emailUsPage = new EmailUsPage(driver);
        LogOnPage logOnPage = new LogOnPage(driver);
        DeliveryInfoPage deliveryInfoPage = new DeliveryInfoPage(driver);

        openUrl("https://www.vans.co.uk/");
        homePage.getAllowAllCookieBtn().click();
        homePage.getHelpBtn().click();
        helpPage.getHelpOptions().get(0).click();

        Assert.assertEquals(faqPage.getHeader().getText(), "FREQUENTLY ASKED QUESTIONS");
        Assert.assertEquals(faqPage.getSectionHeaders().size(), 9);
        Assert.assertTrue(getCurrentUrl().contains("faq"));

        goBack();
        helpPage.getHelpOptions().get(1).click();

        Assert.assertTrue(returnsPage.getHeader().getText().contains("RETURNS"));
        Assert.assertTrue(getCurrentUrl().contains("returns"));

        returnsPage.getReturnMyOrderBtn().click();
        switchToTab(2);

        Assert.assertTrue(trackMyOrderPage.getHeader().getText().contains("TRACK MY ORDER"));
        Assert.assertTrue(getCurrentUrl().contains("LogonForm"));

        switchToTab(1);
        goBack();
        helpPage.getHelpOptions().get(2).click();

        Assert.assertTrue(emailUsPage.getContactHeader().getText().contains("CONTACT US"));
        Assert.assertTrue(emailUsPage.getEmailHeader().getText().contains("EMAIL"));
        Assert.assertTrue(getCurrentUrl().contains("contact-us"));

        goBack();
        helpPage.getHelpOptions().get(3).click();

        Assert.assertTrue(logOnPage.getAccountSignInHeader().getText().contains("SIGN IN TO YOUR ACCOUNT-VANS"));
        Assert.assertTrue(logOnPage.getJoinVansFamilyHeader().getText().contains("JOIN VANS FAMILY"));
        Assert.assertTrue(getCurrentUrl().contains("LogonForm"));

        goBack();
        helpPage.getHelpOptions().get(4).click();

        Assert.assertTrue(deliveryInfoPage.getDeliveryHeader().getText().contains("DELIVERY"));
        Assert.assertTrue(getCurrentUrl().contains("delivery"));

        goBack();

        Assert.assertTrue(helpPage.getCallUsBtn().getText().contains("CALL US TOLL - FREE "));
        Assert.assertTrue(helpPage.getPhoneNumber().getText().contains("08002346152"));
    }
}