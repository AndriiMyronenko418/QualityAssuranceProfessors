package AndriiTest.Tests;

import AndriiTest.Pages.DeliveryDetailsPage;
import AndriiTest.Pages.HomePage;
import AndriiTest.Pages.TrackMyOrderPage;
import BasePageAndTestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTrackMyOrder extends TestInit {

    @Test
    public void testTrackMyOrder() {

        HomePage homePage = new HomePage(driver);
        TrackMyOrderPage trackMyOrderPage = new TrackMyOrderPage(driver);

        openUrl("https://www.vans.co.uk/");
        homePage.getAllowAllCookieBtn().click();
        homePage.getTrackMyOrder().click();
        trackMyOrderPage.getOrderNumberInput().sendKeys(DeliveryDetailsPage.ORDER_NUMBER);
        trackMyOrderPage.getEmailAddressInput().sendKeys(DeliveryDetailsPage.EMAIL);
        trackMyOrderPage.getCheckStatusBtn().click();

        Assert.assertTrue(trackMyOrderPage.getHeader().getText().contains("TRACK MY ORDER"));
        Assert.assertTrue(trackMyOrderPage.getErrorMassage().getText().contains("VERIFY YOUR ORDER INFORMATION"));
    }
}