package VolodymyrHrytsiuk.Tests;

import BasePageAndTestInit.TestInit;
import VolodymyrHrytsiuk.Tests.Pages.HomePageCrowell;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrowellProfessionalsGExpCheck extends TestInit {

    @Test
    public void ProfessionalsGovernmentExperienceCheck() {
        HomePageCrowell homePageCrw = new HomePageCrowell(driver);

        openUrl("https://www.crowell.com/");
        homePageCrw.selectProfessionalsTitle().click();
        homePageCrw.moveToButtonProfessionals();
        homePageCrw.getGovernmentExperience().click();

        Assert.assertEquals(54, homePageCrw.getGovExpUsaList().size());
    }
}
