package YevheniiBondarenko.Tests.Tests;

import BasePageAndTestInit.TestInit;
import YevheniiBondarenko.Tests.Pages.MujiPageWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Muji1Registration extends TestInit {
    @Test
    public void mujiRegistration(){
        MujiPageWebElement mujiPageWebElement = new MujiPageWebElement(driver);

        openUrl("https://www.muji.com/");
        mujiPageWebElement.northAmericaList().get(0).click();

        sleep(1); //use until cookie show up
        mujiPageWebElement.cookieClosedBtn().click();
        mujiPageWebElement.onlineStoreBtn().click();
        mujiPageWebElement.logInBtn().get(0).click();
        mujiPageWebElement.loginInputM();
        mujiPageWebElement.singIn().click();

        Assert.assertTrue(mujiPageWebElement.myAccountBtn().isDisplayed());
    }
}