package VolodymyrHrytsiuk.Tests;

import BasePageAndTestInit.TestInit;
import VolodymyrHrytsiuk.Tests.Pages.HomePageCrowell;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrowellProfessionals extends TestInit {

    @Test
    public void checkProfessionals() {
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.selectProfessionalsTitle().click();
        homePageCrw.selectJobTitlePartner().click();
        homePageCrw.selectOffice().click();
        homePageCrw.selectOfficeBrussels().click();
        homePageCrw.selectPracticeAdverAndMedia().click();
        homePageCrw.selectIndustryAeroAndDef().click();
        homePageCrw.selectLawSchoolAlbanyLS().click();
        homePageCrw.selectLandLanguageSwedish().click();
        homePageCrw.selectBarAdmissionsCalifornia().click();
        homePageCrw.selectGovernmentExperienceBankrupcyCourt().click();
        homePageCrw.acceptAllCookiesButton().click();
        homePageCrw.professionalSearchButton().click();

        Assert.assertTrue(homePageCrw.searshResultIs0().isDisplayed());
    }
}