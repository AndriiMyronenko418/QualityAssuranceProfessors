package Amazon.Tests;

import Amazon.Pages.AmazonLanguagesPage;
import Amazon.Pages.EldenRingPage;
import Amazon.Pages.HomePage;
import BasePageAndTestInit.TestInit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckCurrencyChange extends TestInit {

    @DataProvider(name = "currencyCheck")
    public Object[][] currencyList() {
        return new Object[][]{
                {" - Chilean Peso", "CLP"},
                {" - Colombian Peso", "COP"},
                {"KRW", "KRW"},
                {"TWD", "TWD"},
        };
    }

    @Test(dataProvider = "currencyCheck")
    public void currencyCheck(String currency, String value) {

        AmazonLanguagesPage amazonLanguagesPage = new AmazonLanguagesPage(driver);
        EldenRingPage eldenRingPage = new EldenRingPage(driver);
        HomePage homePage = new HomePage(driver);


        openUrl("https://www.amazon.com/");
        homePage.aIdOption("icp-nav-flyout").click();
        amazonLanguagesPage.currencyBtn().click();
        amazonLanguagesPage.spanText(currency).click();
        sleep(2);
        eldenRingPage.acceptChanges().click();
        sleep(4);
        eldenRingPage.gameUrl();
        Assert.assertTrue(eldenRingPage.currencyValue(value).getText().contains(value));
        System.out.println("Assert accepted, value confirmed");
    }
}
