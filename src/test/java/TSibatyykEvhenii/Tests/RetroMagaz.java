package TSibatyykEvhenii.Tests;

import BasePageAndTestInit.TestInit;
import TSibatyykEvhenii.Pages.RetroMagazRegistrationPage;
import TSibatyykEvhenii.Pages.RetromagazMainPage;
import org.testng.annotations.Test;

public class RetroMagaz extends TestInit {

    @Test
    public void buyXboxSeriesX() {
        RetromagazMainPage retroMag = new RetromagazMainPage(driver);
        RetroMagazRegistrationPage regPage = new RetroMagazRegistrationPage(driver);
        retroMag.goToRetroMagaz();
        retroMag.goToSearchField().sendKeys("Xbox series x");
        retroMag.listSearchFieldFrom().get(2).click();
        retroMag.listOfSearchResult().get(1).click();
        retroMag.getBuyBtn().click();
        retroMag.getToOrderBtn().get(0).click();
        regPage.setNameRegistration().get(0).sendKeys("Name");
        regPage.setSurenameRegistration().get(0).sendKeys("Surename");
        regPage.setTelNumberRegistration().get(0).sendKeys("0931223100");
        regPage.setEmailRegistration().get(0).sendKeys("anonimus@gmail.com");
        regPage.setPasRegistration().get(0).sendKeys("12345678password");
        regPage.getAgreeCheckbox().get(0).click();
        regPage.assertUrl();
    }
}
