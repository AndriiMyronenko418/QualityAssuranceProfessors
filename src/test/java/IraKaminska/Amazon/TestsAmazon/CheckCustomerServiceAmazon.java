package IraKaminska.Amazon.TestsAmazon;

import BasePageAndTestInit.TestInit;
import IraKaminska.Amazon.PagesAmazon.CustomerServicePage;
import IraKaminska.Amazon.PagesAmazon.HomePageAmazon;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckCustomerServiceAmazon extends TestInit {

    @Test
    public void checkCustomerServiceAmazon() {

        HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
        CustomerServicePage customerServicePage = new CustomerServicePage(driver);

        openUrl("https://www.amazon.com/");
        homePageAmazon.getAllMenuButton().click();
        scroll(1000);
        homePageAmazon.getCustomerServiceButton().click();
        customerServicePage.getDeliveryOrderReturnBtn().click();
        goBack();
        customerServicePage.getPrimeButton().click();
        goBack();
        customerServicePage.getPaymentChargesGiftsCardBtn().click();
        goBack();
        customerServicePage.getLoginAddressSecurityBtn().click();
        goBack();
        customerServicePage.getMembershipsSubscriptionsBtn().click();
        goBack();
        customerServicePage.getKindleFifeButton().click();
        goBack();
        customerServicePage.getEBooksPrimeVideosMusicsBtn().click();
        goBack();
        customerServicePage.getAccessibilityButton().click();
        goBack();
        customerServicePage.getSomethingElseButton().click();
        goBack();

        Assert.assertTrue(customerServicePage.checkCustomerServicePage().getText().contains("Customer Service"));
    }
}