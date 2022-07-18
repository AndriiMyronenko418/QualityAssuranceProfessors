package Safron.Foxtrot.Tests;

import BasePageAndTestInit.TestInit;
import Safron.Foxtrot.Pages.FoxtrotHomePageHelper;
import Safron.Foxtrot.Pages.FoxtrotProductPageHelper;
import Safron.Foxtrot.Pages.FoxtrotSearchResultPageHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FoxtrotPrice extends TestInit {


    @Test
    public void testPrice() {

        FoxtrotHomePageHelper foxtrotHomePageHelper = new FoxtrotHomePageHelper(driver);
        FoxtrotSearchResultPageHelper foxtrotSearchResultPageHelper = new FoxtrotSearchResultPageHelper(driver);
        FoxtrotProductPageHelper foxtrotProductPageHelper = new FoxtrotProductPageHelper(driver);

        openUrl("https://www.foxtrot.com.ua/uk");

        foxtrotHomePageHelper.searchSpace().sendKeys("Пральна Машина");
        foxtrotHomePageHelper.searchBtn().click();

        String productPriceSearchPage = foxtrotSearchResultPageHelper.getPrice();
        String productPriceProductPage = foxtrotProductPageHelper.getPrice();

        Assert.assertTrue(foxtrotSearchResultPageHelper.getProducts().size() > 10);

        foxtrotSearchResultPageHelper.getPriceText();
        foxtrotSearchResultPageHelper.wash3676().click();
        foxtrotProductPageHelper.getPriceText();

        Assert.assertEquals(productPriceProductPage, productPriceSearchPage);
    }
}
