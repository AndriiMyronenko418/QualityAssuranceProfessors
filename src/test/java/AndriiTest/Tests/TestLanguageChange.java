package AndriiTest.Tests;

import AndriiTest.Pages.HomePage;
import AndriiTest.Pages.SelectLocationPage;
import BasePageAndTestInit.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLanguageChange extends TestInit {

    @DataProvider(name = "country_setup")
    public Object[][] dpMethod() {
        return new Object[][]{
                {"United Kingdom", "English", "£", "uk"},
                {"Austria", "German", "€", "at"},
                {"France", "French", "€", "fr"}};
    }

    @Test(dataProvider = "country_setup")
    public void languageChange(String countryName, String language, String currency, String domain) {

        HomePage homePage = new HomePage(driver);
        SelectLocationPage selectLocationPage = new SelectLocationPage(driver);

        openUrl("https://www.vans.pl/");
        homePage.getAllowAllCookieBtn().click();
        homePage.getFlag().click();
        selectLocationPage.getSelectLocationDropdownList().click();
        selectLocationPage.getSelectLocationDropdownListOption(countryName).click();
        Assert.assertEquals(selectLocationPage.getLanguage().getText(), language);
        selectLocationPage.getGoBtn().click();
        for (WebElement n : homePage.getPrices()) {
            Assert.assertTrue(homePage.getPrices().get(0).getText().contains(currency));
        }
        Assert.assertTrue(getCurrentUrl().contains(domain));
    }
}