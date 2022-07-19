package Amazon.Tests;

import Amazon.Pages.HomePage;
import Amazon.Pages.RegistrationPage;
import Amazon.Pages.TestUserForAmazon;
import BasePageAndTestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonRegistrationUser extends TestInit {

    @Test
    public void userRegistrationTest(){
        
        HomePage homePage = new HomePage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        TestUserForAmazon testUserForAmazon = new TestUserForAmazon();

        openUrl("https://www.amazon.com/");
        homePage.aIdOption("nav-link-accountList").click();
        homePage.aIdOption("createAccountSubmit").click();
        registrationPage.inputIdOption("ap_customer_name").sendKeys(testUserForAmazon.USERNAME);
        registrationPage.inputIdOption("ap_email").sendKeys(testUserForAmazon.USER_EMAIL);
        registrationPage.inputIdOption("ap_password").sendKeys(testUserForAmazon.PASSWORD);
        registrationPage.inputIdOption("ap_password_check").sendKeys(testUserForAmazon.PASSWORD);
        registrationPage.inputIdOption("continue").click();
        Assert.assertTrue(registrationPage.inscriptionAfterRegistration().getText().contains("Email address already in use"));
    }
}