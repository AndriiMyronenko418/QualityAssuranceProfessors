package VolodymyrHrytsiuk.Tests;

import BasePageAndTestInit.TestInit;
import VolodymyrHrytsiuk.Tests.Pages.HomePageCrowell;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrowellUkraineCrisis extends TestInit {

    @Test
    public void checkUkraineCrisis() {
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.ukrCrisisCenter().click();
        switchToNextTab();
        homePageCrw.ukrCrisisInsights().click();
        goBack();
        homePageCrw.ukrCrisisWebinars().click();
        goBack();
        homePageCrw.acceptAllCookiesButton().click();
        homePageCrw.ukrCrisisPressCoverage().click();
        goBack();
        homePageCrw.ukrExternalResourses().click();

        Assert.assertTrue(homePageCrw.ofacRecentActions().isDisplayed());
    }
}