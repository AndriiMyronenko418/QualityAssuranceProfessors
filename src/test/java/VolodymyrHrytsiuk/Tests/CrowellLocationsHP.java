package VolodymyrHrytsiuk.Tests;

import BasePageAndTestInit.TestInit;
import VolodymyrHrytsiuk.Tests.Pages.HomePageCrowell;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrowellLocationsHP extends TestInit {

    @Test
    public void checkLocationsHP() {
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.getHomepageLocations().click();
        homePageCrw.acceptAllCookiesButton().click();
        homePageCrw.getLocationBrussels().click();
        goBack();
        homePageCrw.getLocationChicago().click();
        goBack();
        homePageCrw.getLocationDenver().click();
        goBack();
        homePageCrw.getLocationDoha().click();
        goBack();
        homePageCrw.getLocationIndianapolis().click();
        goBack();
        homePageCrw.getLocationLondon().click();
        goBack();
        homePageCrw.getLocationLosAngeles().click();
        goBack();
        homePageCrw.getLocationNewYork().click();
        goBack();
        homePageCrw.getLocationOrangeCounty().click();
        goBack();
        homePageCrw.getLocationSanFrancisco().click();
        goBack();
        homePageCrw.getLocationShanghai().click();
        goBack();
        homePageCrw.getLocationWashingtonDC().get(0).click();
        goBack();
        homePageCrw.getLocationSingapore().click();
        goBack();
        homePageCrw.getLocationWashingtonDC().get(1).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("Washington-DC"));
    }
}