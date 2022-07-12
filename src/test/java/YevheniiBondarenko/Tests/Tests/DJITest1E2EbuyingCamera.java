package YevheniiBondarenko.Tests.Tests;

import BasePageAndTestInit.TestInit;
import YevheniiBondarenko.Tests.Pages.DJIWebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DJITest1E2EbuyingCamera extends TestInit {

    @Test

    public void djiTestOne(){
        DJIWebElement djiWebElement = new DJIWebElement(driver);
        Actions action = new Actions(driver);

        openUrl("https://dji-kyiv.com/");
        action.moveToElement(djiWebElement.mainProductMenu().get(2)).perform();
        djiWebElement.action2().click();
        djiWebElement.action2Items().get(0).click();
        djiWebElement.buyBtn().click();
        djiWebElement.closedPopUp().click();

        Assert.assertTrue(djiWebElement.cardItemNumber().isDisplayed());
    }
}