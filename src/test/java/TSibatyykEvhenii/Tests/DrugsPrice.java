package TSibatyykEvhenii.Tests;

import BasePageAndTestInit.TestInit;
import TSibatyykEvhenii.Asserts.Alteya;
import TSibatyykEvhenii.Pages.Alteya.AlteyaMAinPage;
import TSibatyykEvhenii.Pages.Alteya.AlteyaPharmacy;
import TSibatyykEvhenii.Pages.Alteya.DentistPage;
import org.testng.annotations.Test;

public class DrugsPrice extends TestInit {

    @Test
    public void checkPriceInAlteya(){

        AlteyaMAinPage alteyaMAinPage = new AlteyaMAinPage(driver);
        AlteyaPharmacy alteyaPharmacy = new AlteyaPharmacy(driver);
        DentistPage dentistPage = new DentistPage(driver);
        Alteya alteya = new Alteya(driver);

        openUrl("https://alteia.ua/");
        alteyaMAinPage.ukrainianLanguageBtn().click();
        sleep(3);                                          //use sleep for waiting to load all objects on page
        alteyaMAinPage.pharmacyBtn().click();
        alteyaMAinPage.internetPharmacyBtn().click();
        alteyaPharmacy.priceBtn().get(0).click();
        alteyaPharmacy.moveCursor(alteyaPharmacy.moveToDentist());
        alteyaPharmacy.dentist().get(0).click();
        dentistPage.prosthesis().get(4).click();
        alteya.alteyaAssert();
    }
}