package YevheniiBondarenko.Tests.Tests;

import BasePageAndTestInit.TestInit;
import YevheniiBondarenko.Tests.Pages.MujiPageWebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyingChopsticksOnMujiE2E extends TestInit {

    @Test

    public void buyingChopstickOnMujiE2E(){
        MujiPageWebElement mujiPageWebElement = new MujiPageWebElement(driver);
        Actions actions = new Actions(driver);

        openUrl("https://www.muji.us/account");
        mujiPageWebElement.loginInputM();
        mujiPageWebElement.singingLogBtn().click();
        actions.moveToElement(mujiPageWebElement.headerMenu().get(3)).perform();
        mujiPageWebElement.chopstick().click();
        mujiPageWebElement.chopstickFilter().get(0).click();
        actions.doubleClick(mujiPageWebElement.groupOfItemsChopstick().get(1)).perform();
        mujiPageWebElement.addToCartBtn().click();
        mujiPageWebElement.checkout().click();

        Assert.assertTrue(mujiPageWebElement.cartItem().isDisplayed());
        Assert.assertTrue(mujiPageWebElement.quantity().isDisplayed());
    }
}