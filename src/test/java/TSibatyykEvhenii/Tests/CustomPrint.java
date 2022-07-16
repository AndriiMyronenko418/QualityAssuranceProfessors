package TSibatyykEvhenii.Tests;

import BasePageAndTestInit.TestInit;
import TSibatyykEvhenii.Asserts.CcustomPrintAssert;
import TSibatyykEvhenii.Asserts.TryCatch;
import TSibatyykEvhenii.Pages.CustomPage.CustomPrintMainPage;
import TSibatyykEvhenii.Pages.CustomPage.PopUpLogin;
import org.testng.annotations.Test;

public class CustomPrint extends TestInit {

    @Test
    public void customPrintSite(){

        CustomPrintMainPage customPrintMainPages = new CustomPrintMainPage(driver);
        TryCatch tryCatch = new TryCatch(driver);
        PopUpLogin popUpLogin = new PopUpLogin(driver);
        CcustomPrintAssert assertCoPr = new CcustomPrintAssert(driver);

        openUrl("https://customprint.market/");
        tryCatch.customPrintTryCatch();
        popUpLogin.logIn();
        sleep(3);                                 //need to loading page all elements
        customPrintMainPages.coolTsherts().click();
        customPrintMainPages.mainBtn().click();
        customPrintMainPages.menCatalog().click();
        customPrintMainPages.favouriteTiShertsBtn();
        sleep(2);                                 //need to wait button reload
        
        assertCoPr.assertFavouriteBtn();
    }
}
