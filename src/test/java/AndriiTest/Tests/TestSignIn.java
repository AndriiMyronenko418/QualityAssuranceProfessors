package AndriiTest.Tests;

import AndriiTest.Pages.DeliveryDetailsPage;
import AndriiTest.Pages.HomePage;
import BasePageAndTestInit.TestInit;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignIn extends TestInit {

    @Test
    public void testSignIn() {

        HomePage homePage = new HomePage(driver);

        openUrl("https://www.vans.co.uk/");
        homePage.getAllowAllCookieBtn().click();
        homePage.getSignInBtn().click();
        scroll(400);
        sleep(2); //wait for popup open fully
        homePage.getSignInCreateAnAccountBtn().click();
        homePage.getSignInInput("firstName").sendKeys(DeliveryDetailsPage.FIRST_NAME);
        homePage.getSignInInput("lastName").sendKeys(DeliveryDetailsPage.LAST_NAME);
        homePage.getSignInInput("birthDate").sendKeys(DeliveryDetailsPage.BIRTH_DATE);
        homePage.getSignInInput("logonId").sendKeys(DeliveryDetailsPage.EMAIL);
        homePage.getSignInInput("logonPassword").sendKeys(DeliveryDetailsPage.PASSWORD);
        homePage.getSignInInput("logonPasswordVerify").sendKeys(DeliveryDetailsPage.PASSWORD);
        homePage.getSignInSelectGender().click();

        Select genderSelect = new Select(homePage.getSignInSelectGender());

        genderSelect.selectByIndex(1);
        homePage.getSignInPrivacyPolicyCheckbox().click();
        homePage.getSignInNextBtn().click();
        Assert.assertEquals(homePage.getSignInError().getText(), "Please verify your information entered below.");
    }
}