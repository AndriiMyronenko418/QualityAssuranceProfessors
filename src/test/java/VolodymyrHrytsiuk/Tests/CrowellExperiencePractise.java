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
        goBack();
        homePageCrw.transactionsAndAgreement().click();
        action.doubleClick(homePageCrw.contactsDeploy()).perform();
        goBack();
        homePageCrw.digitalAdvertising().click();
        action.doubleClick(homePageCrw.contactsDeploy()).perform();
        goBack();
        homePageCrw.riskPreventAndCCounseling().click();
        action.doubleClick(homePageCrw.contactsDeploy()).perform();
        goBack();
        homePageCrw.technologyAndBProtection().click();
        action.doubleClick(homePageCrw.contactsDeploy()).perform();
        goBack();
        homePageCrw.trademarcCounsAndLitigation().click();
        action.doubleClick(homePageCrw.contactsDeploy()).perform();
        goBack();
        homePageCrw.copyrightCounselingAndLitigation().click();
        action.doubleClick(homePageCrw.contactsDeploy()).perform();
        goBack();
        homePageCrw.stateAttorneysGeneral().click();
        action.doubleClick(homePageCrw.contactsDeploy()).perform();

        Assert.assertTrue(homePageCrw.stateAttroneyMap().isDisplayed());
    }
}