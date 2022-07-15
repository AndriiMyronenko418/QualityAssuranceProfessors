package IraKaminska.Amazon.TestsAmazon;

import BasePageAndTestInit.TestInit;
import IraKaminska.Amazon.PagesAmazon.FragrancePageAmazon;
import IraKaminska.Amazon.PagesAmazon.HomePageAmazon;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckWomensFragranceAmazon extends TestInit {

    @Test
    public void checkWomensFragranceAmazon() {

        HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
        FragrancePageAmazon fragrancePageAmazon = new FragrancePageAmazon(driver);

        openUrl("https://www.amazon.com/");
        homePageAmazon.getAllMenuButton().click();
        homePageAmazon.getSeeAllButton().click();
        homePageAmazon.getBeautyAndPersonalCareButton().click();
        homePageAmazon.getFragranceButton().click();
        fragrancePageAmazon.getWomensFragranceButton().click();

        Assert.assertTrue(fragrancePageAmazon.checkResults().getText().contains("RESULTS"));
    }
}