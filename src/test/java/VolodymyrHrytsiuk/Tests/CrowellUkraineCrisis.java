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
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
        homePageCrw.ukrCrisisInsights().click();
        driver.navigate().back();
        homePageCrw.ukrCrisisWebinars().click();
        driver.navigate().back();
        homePageCrw.acceptAllCookiesButton().click();
        homePageCrw.ukrCrisisPressCoverage().click();
        driver.navigate().back();
        homePageCrw.ukrExternalResourses().click();

        Assert.assertTrue(homePageCrw.ofacRecentActions().isDisplayed());
    }
}