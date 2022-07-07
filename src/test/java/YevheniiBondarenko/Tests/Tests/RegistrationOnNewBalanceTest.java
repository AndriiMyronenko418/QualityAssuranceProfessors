package YevheniiBondarenko.Tests.Tests;

import BasePageAndTestInit.TestInit;
import YevheniiBondarenko.Tests.Pages.NewBalanceHelper;
import YevheniiBondarenko.Tests.Pages.NewBalanceWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationOnNewBalanceTest extends TestInit {
    @Test
    public void registrationOnNewBalance(){
        NewBalanceWebElement newBalanceWebElement = new NewBalanceWebElement(driver);
        NewBalanceHelper newBalanceHelper = new NewBalanceHelper(driver);


        newBalanceHelper.goToNewBalanceUkraine();
        newBalanceWebElement.enterRegistrationBtn().get(0).click();
        newBalanceWebElement.registrationBtn().click();
        newBalanceWebElement.inputMailAndPassword().get(0).sendKeys("interdancecoach@gmail.com");
        newBalanceWebElement.inputNumber().sendKeys("0665631180");
        newBalanceWebElement.passwordField().sendKeys("1234567888");
        newBalanceWebElement.confirmPassword().sendKeys("1234567888");
        newBalanceWebElement.signUpButton().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://newbalance.ua/"));




    }
}
