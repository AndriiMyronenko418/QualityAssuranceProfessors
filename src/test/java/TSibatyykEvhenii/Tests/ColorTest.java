package TSibatyykEvhenii.Tests;

import BasePageAndTestInit.TestInit;
import TSibatyykEvhenii.Asserts.EldoradoAssert;
import TSibatyykEvhenii.Asserts.TryCatch;
import TSibatyykEvhenii.Pages.Eldorado.BinacularPage;
import TSibatyykEvhenii.Pages.Eldorado.EldoradoMainPage;
import TSibatyykEvhenii.Pages.Eldorado.SportSection;
import org.testng.annotations.Test;

public class ColorTest extends TestInit {

    @Test
    public void colorBinoculars() {
        EldoradoMainPage eldoradoMainPage = new EldoradoMainPage(driver);
        TryCatch tryCatch = new TryCatch(driver);
        SportSection sportSection = new SportSection(driver);
        BinacularPage binacularPage = new BinacularPage(driver);
        EldoradoAssert eldoradoAssert = new EldoradoAssert(driver);

        openUrl("https://eldorado.ua/");
        tryCatch.eldoradoLanguageChek();
        eldoradoMainPage.goToMenuBtn();
        eldoradoMainPage.sportSectionBtn().get(0).click();
        sportSection.getBinocularsSection().get(1).click();
        binacularPage.colorFilter().click();
        binacularPage.checkboxWhiteColor().click();
        binacularPage.getFirstElement().get(0).click();
        eldoradoAssert.nameOfFirstElement();

    }
}