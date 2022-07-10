package Safron.NewBalanceUa.Tests;

import BasePageAndTestInit.TestInit;
import Safron.NewBalanceUa.Pages.NewBalanceHeaderViewElements;
import Safron.NewBalanceUa.Pages.NewBalanceSignInViewElements;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignIn extends TestInit {

    @DataProvider(name = "user info")
    public Object[][] dpMethod() {
        return new Object[][]{
                {"elsafronitaz@gmail.com", "E8crmWqTtYU2GD7"}};
    }

    @Test(dataProvider = "user info")
    public void signIn(String email, String password) {
        openUrl("https://newbalance.ua/");

        NewBalanceHeaderViewElements newBalanceHeaderViewElements = new NewBalanceHeaderViewElements(driver);
        NewBalanceSignInViewElements newBalanceSignInViewElements = new NewBalanceSignInViewElements(driver);

        newBalanceHeaderViewElements.signInBtn().click();
        newBalanceSignInViewElements.emailField().sendKeys(email);
        newBalanceSignInViewElements.passwordField().sendKeys(password);
        newBalanceSignInViewElements.loginBtn().click();

        Assert.assertTrue(newBalanceHeaderViewElements.myAccountBtn().isDisplayed());
    }
}
