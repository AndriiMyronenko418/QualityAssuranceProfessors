package VolodymyrHrytsiuk.Tests;

import BasePageAndTestInit.TestInit;
import VolodymyrHrytsiuk.Tests.Pages.HomePageCrowell;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrowellExperiencePractise extends TestInit {

    @Test
    public void experiencePractiseAdvertisingAndMediaCheck() {
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);
        Actions action = new Actions(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.experienceButton().click();
        homePageCrw.advertisingAndMediaSelect().click();
        action.doubleClick(homePageCrw.contactsDeploy()).perform();
        scroll(600);
        homePageCrw.falseAdvertDisAndLitig().click();
        action.doubleClick(homePageCrw.contactsDeploy()).perform();
        driver.navigate().back();
        homePageCrw.transactionsAndAgreement().click();
        action.doubleClick(homePageCrw.contactsDeploy()).perform();
        driver.navigate().back();
        homePageCrw.digitalAdvertising().click();
        action.doubleClick(homePageCrw.contactsDeploy()).perform();
        driver.navigate().back();
        homePageCrw.riskPreventAndCCounseling().click();
        action.doubleClick(homePageCrw.contactsDeploy()).perform();
        driver.navigate().back();
        homePageCrw.technologyAndBProtection().click();
        action.doubleClick(homePageCrw.contactsDeploy()).perform();
        driver.navigate().back();
        homePageCrw.trademarcCounsAndLitigation().click();
        action.doubleClick(homePageCrw.contactsDeploy()).perform();
        driver.navigate().back();
        homePageCrw.copyrightCounselingAndLitigation().click();
        action.doubleClick(homePageCrw.contactsDeploy()).perform();
        driver.navigate().back();
        homePageCrw.stateAttorneysGeneral().click();
        action.doubleClick(homePageCrw.contactsDeploy()).perform();

        Assert.assertTrue(homePageCrw.stateAttroneyMap().isDisplayed());
    }
}