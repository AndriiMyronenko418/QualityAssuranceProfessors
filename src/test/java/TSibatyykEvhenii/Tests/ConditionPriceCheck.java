package TSibatyykEvhenii.Tests;

import BasePageAndTestInit.TestInit;
import TSibatyykEvhenii.Asserts.Hotline;
import TSibatyykEvhenii.Asserts.TryCatch;
import TSibatyykEvhenii.Pages.Hotline.ConditionareSectionPage;
import TSibatyykEvhenii.Pages.Hotline.HotlineSite;
import TSibatyykEvhenii.Pages.Hotline.HouseHoldSection;
import org.testng.annotations.Test;

public class ConditionPriceCheck extends TestInit {

    @Test
    public void minimalPriceConditioner(){
        HotlineSite hotlineSite = new HotlineSite(driver);
        HouseHoldSection houseHoldSection = new HouseHoldSection(driver);
        ConditionareSectionPage conditionareSectionPage = new ConditionareSectionPage(driver);
        Hotline hotline = new Hotline(driver);
        TryCatch tryCatch = new TryCatch(driver);

        openUrl("https://hotline.ua/");
        tryCatch.hotlineLanguage();
        hotlineSite.houseHoldSection().click();
        houseHoldSection.conditionsBtn().click();
        houseHoldSection.conditionsBtn().click();
        conditionareSectionPage.sortingFilter().click();
        conditionareSectionPage.priceIncreasing().click();
        sleep(2);                                                   //wait that filter change elements
        conditionareSectionPage.firstElementAfterSearchig().get(0).click();
        hotline.assertHotlinePrice();
    }
}