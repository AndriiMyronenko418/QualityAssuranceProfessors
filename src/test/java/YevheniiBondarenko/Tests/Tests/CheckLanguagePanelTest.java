package YevheniiBondarenko.Tests.Tests;

import BasePageAndTestInit.TestInit;
import YevheniiBondarenko.Tests.Pages.DanceShopperHelper;
import YevheniiBondarenko.Tests.Pages.HomePageWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckLanguagePanelTest extends TestInit {

    @Test
    public void checkIfTheCurrencyWillChangeAfterALanguageChange() {

        HomePageWebElements homePageWebElements = new HomePageWebElements(driver);
        DanceShopperHelper danceShopperHelper = new DanceShopperHelper(driver);

        danceShopperHelper.goToDanceShopper();
        homePageWebElements.languagesMenu().get(7).click();
        sleep(2);

        Assert.assertTrue(homePageWebElements.currencyButton().getText().contains("Korean Won (KRW)"));
    }
}