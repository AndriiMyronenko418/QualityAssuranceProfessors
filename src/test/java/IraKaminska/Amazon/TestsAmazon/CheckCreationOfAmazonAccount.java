package IraKaminska.Amazon.TestsAmazon;

import BasePageAndTestInit.TestInit;
import IraKaminska.Amazon.PagesAmazon.CreateAccountPageAmazon;
import IraKaminska.Amazon.PagesAmazon.HomePageAmazon;
import IraKaminska.Amazon.PagesAmazon.SignInAmazonPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckCreationOfAmazonAccount extends TestInit {

    @Test
    public void checkCreationOfAmazonAccount() {
        HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
        SignInAmazonPage signInAmazonPage = new SignInAmazonPage(driver);
        CreateAccountPageAmazon createAccountPageAmazon = new CreateAccountPageAmazon(driver);

        openUrl("https://www.amazon.com/");
        homePageAmazon.getSignInButton().click();
        signInAmazonPage.getCreateAmazonAccountButton().click();
        createAccountPageAmazon.getSignUpInput("firstAndLastName").sendKeys(createAccountPageAmazon.FIRST_AND_LAST_NAME);
        createAccountPageAmazon.getMobileNumberOrEmail().sendKeys(createAccountPageAmazon.MOBILE_NUMBER_OR_EMAIL);
        createAccountPageAmazon.getPasswordInput().sendKeys(createAccountPageAmazon.PASSWORD);
        createAccountPageAmazon.getReenterPassword().sendKeys(createAccountPageAmazon.REENTER_PASSWORD);
        createAccountPageAmazon.getContinueButton().click();

        Assert.assertTrue(createAccountPageAmazon.checkNewPazzlePage().getText().contains("Solve this puzzle"));
    }
}