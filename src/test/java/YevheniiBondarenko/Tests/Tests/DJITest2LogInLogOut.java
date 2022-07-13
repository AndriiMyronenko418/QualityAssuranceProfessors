package YevheniiBondarenko.Tests.Tests;

import BasePageAndTestInit.TestInit;
import YevheniiBondarenko.Tests.Pages.DJIWebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.openqa.selenium.Keys.ENTER;

public class DJITest2LogInLogOut extends TestInit {
    @Test
    public void djiTest2LogInLogOut() {
        DJIWebElement djiWebElement = new DJIWebElement(driver);
        Actions action = new Actions(driver);

        openUrl("https://dji-kyiv.com/");
        djiWebElement.enter().click();
        djiWebElement.inputEmail().sendKeys("interdancecoach@gmail.com");
        djiWebElement.inputPassword().sendKeys("1234567888",ENTER);

        Assert.assertTrue(djiWebElement.userName().isDisplayed());

        action.moveToElement(djiWebElement.userName()).perform();
        djiWebElement.exitUserAccount().click();
    }
}