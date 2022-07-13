package YevheniiBondarenko.Tests.Tests;

import BasePageAndTestInit.TestInit;
import YevheniiBondarenko.Tests.Pages.DJIWebElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DJITest2LogInLogOut extends TestInit {

    @Test
    public void djiTest2LogInLogOut() {
        DJIWebElements djiWebElement = new DJIWebElements(driver);
        Actions action = new Actions(driver);

        openUrl("https://dji-kyiv.com/");
        djiWebElement.enter().click();
        djiWebElement.inputEmail().sendKeys("interdancecoach@gmail.com");
        djiWebElement.inputPassword().sendKeys("1234567888", Keys.ENTER);

        Assert.assertTrue(djiWebElement.userName().isDisplayed());

        action.moveToElement(djiWebElement.userName()).perform();
        djiWebElement.exitUserAccount().click();
    }
}