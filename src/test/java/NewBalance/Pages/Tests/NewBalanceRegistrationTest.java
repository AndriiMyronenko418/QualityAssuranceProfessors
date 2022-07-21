package NewBalance.Pages.Tests;

import BasePageAndTestInit.TestInit;
import NewBalance.Pages.NewBalanceHeaderViewElements;
import NewBalance.Pages.NewBalanceLogInAndRegistrationPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewBalanceRegistrationTest extends TestInit {

    @Test(dataProvider = "registration_fields")
    public void newBalanceRegistration(String email, String phoneNumber, String password, String confirmPassword) {

        NewBalanceLogInAndRegistrationPage regiPage = new NewBalanceLogInAndRegistrationPage(driver);
        NewBalanceHeaderViewElements homePage = new NewBalanceHeaderViewElements(driver);

        openUrl("https://newbalance.ua/");
        homePage.signInBtn().click();
        regiPage.getRegistrationBtn().click();
        regiPage.regEmailField().sendKeys(email + Keys.ENTER);

        Assert.assertTrue(regiPage.invalidEmailMessege().isDisplayed());

        regiPage.regPhoneNumberField().sendKeys(phoneNumber + Keys.ENTER);

        Assert.assertTrue(regiPage.fillInTheField().isDisplayed());

        regiPage.regPasswordField().sendKeys(password + Keys.ENTER);

        Assert.assertTrue(regiPage.shortPasswordMessage().isDisplayed());

        regiPage.regPasswordConfirmField().sendKeys(confirmPassword + Keys.ENTER);

        Assert.assertTrue(regiPage.passwordsNotSameMessage().isDisplayed());

        regiPage.regTickWantReceiveMessages().click();
        regiPage.regTickWantReceiveRecommendations().click();
        regiPage.confirmRegistration().click();
    }

    @DataProvider(name = "registration_fields")
    public Object[][] dpMethod() {
        return new Object[][]{
                {"!324345#gmail.com", "1№", "1", "12"},
                {" 12FG<>>gmail.com", "12", "12", "21"},
                {"G35 @gmail.com", "123", "123", "127"},
                {"1235@@gmail.com", "1234", "1234", "12345"},
                {"123G@ gmail.com", "12345", "12345", "13345"},
                {"123G@gmail. com", "!1234", "!123", "!123!"},
                {"123V@gmail,com", "1<>", "1<>", "1<56"},
                {"123Vgmail,com@", "14387bv", "1<>1", "1<56"},
                {"123$@<>com.gmail", "1]", "1[]", "1/["}};
    }
}