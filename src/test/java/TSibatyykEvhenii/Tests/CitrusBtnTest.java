package TSibatyykEvhenii.Tests;

import BasePageAndTestInit.TestInit;
import TSibatyykEvhenii.Asserts.Citrus;
import TSibatyykEvhenii.Asserts.TryCatch;
import TSibatyykEvhenii.Pages.Citrus.CitrusMainPage;
import org.testng.annotations.Test;

public class CitrusBtnTest extends TestInit {

    @Test
    public void testCitrus(){
    
        CitrusMainPage citrusMainPage = new CitrusMainPage(driver);
        TryCatch tryCatch = new TryCatch(driver);
        Citrus citrus = new Citrus(driver);

        openUrl("https://www.ctrs.com.ua/");
        tryCatch.tryToChangeLanguage();
        citrusMainPage.goToNoutBooksSection().click();
        citrusMainPage.elementFromNoutBookSection().click();
        citrusMainPage.getAppleFiltre();
        sleep(3);                                          //need time for filter restoring
        citrusMainPage.takeElementAfterFiltered().get(0).click();
        citrus.assertForCitrus();
    }
}
