package IraKaminska.Amazon.TestsAmazon;

import BasePageAndTestInit.TestInit;
import IraKaminska.Amazon.PagesAmazon.HomePageAmazon;
import IraKaminska.Amazon.PagesAmazon.RegistryPageAmazon;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckRegistryAmazon extends TestInit {

    @Test
    public void checkRegistryAmazon() {

        HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
        RegistryPageAmazon registryPageAmazon = new RegistryPageAmazon(driver);

        openUrl("https://www.amazon.com/");
        homePageAmazon.getDeliverDontChangeButton();
        homePageAmazon.getRegisrtyButton().click();
        registryPageAmazon.getWeddingRegistryButton().click();
        goBack();
        registryPageAmazon.getBabyRegistryButton().click();
        goBack();
        registryPageAmazon.getBirthdayRegistryButton().click();
        goBack();
        registryPageAmazon.getCustomGiftListButton().click();
        goBack();
        registryPageAmazon.getHolidayGiftList().click();
        goBack();

        Assert.assertTrue(registryPageAmazon.checkRegistryPage().getText().contains("Find a registry or gift list"));
    }
}