package Safron.Foxtrot.Tests;

import BasePageAndTestInit.TestInit;
import Safron.Foxtrot.Pages.CatalogViewElements;
import Safron.Foxtrot.Pages.FoxtrotHomePageHelper;
import Safron.Foxtrot.Pages.FoxtrotMonitorPageElements;
import Safron.Foxtrot.Pages.FoxtrotSearchResultPageHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCount extends TestInit {

    @Test
    public void testCount() {

        FoxtrotHomePageHelper foxtrotHomePageHelper = new FoxtrotHomePageHelper(driver);
        FoxtrotSearchResultPageHelper foxtrotSearchResultPageHelper = new FoxtrotSearchResultPageHelper(driver);
        CatalogViewElements catalogView = new CatalogViewElements(driver);
        FoxtrotMonitorPageElements foxtrotMonitorPageElements = new FoxtrotMonitorPageElements(driver);

        openUrl("https://www.foxtrot.com.ua/uk");

        foxtrotHomePageHelper.moveToPС();
        catalogView.monitor().click();
        foxtrotMonitorPageElements.filterBtnSamsung().click();
        foxtrotMonitorPageElements.okBtn().click();
        foxtrotSearchResultPageHelper.getCountText("SAMSUNG");

        Assert.assertEquals(Integer.parseInt(foxtrotSearchResultPageHelper.getCount()), foxtrotMonitorPageElements.monitors().size());
    }
}