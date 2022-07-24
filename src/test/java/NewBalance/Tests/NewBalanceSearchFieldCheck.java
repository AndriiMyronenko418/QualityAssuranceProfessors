package NewBalance.Tests;

import BasePageAndTestInit.TestInit;
import NewBalance.Pages.NewBalanceHeaderViewElements;
import NewBalance.Pages.NewBalanceHeaderViewHelper;
import NewBalance.Pages.NewBalanceKidsPageElements;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewBalanceSearchFieldCheck extends TestInit {

    @Test(dataProvider = "search")
    public void checkSearchField(String first, String second, String third, String fourth, String fifth, String sixth,
                                 String seventh, String eighth, String ninth) {

        NewBalanceHeaderViewHelper hpVHelper = new NewBalanceHeaderViewHelper(driver);
        NewBalanceHeaderViewElements hpHeaderVE = new NewBalanceHeaderViewElements(driver);
        NewBalanceKidsPageElements hpKPageElements = new NewBalanceKidsPageElements(driver);

        openUrl("https://newbalance.ua/");
        hpHeaderVE.searchField().click();
        hpVHelper.search(first);

        Assert.assertTrue(hpKPageElements.getHeaderShoesText().getText().toLowerCase().contains(first));

        goBack();
        hpHeaderVE.searchField().click();
        hpHeaderVE.searchField().sendKeys(second);
        hpHeaderVE.searchField().sendKeys(Keys.CONTROL + "a");
        hpHeaderVE.searchField().sendKeys(Keys.CONTROL + "c");
        hpHeaderVE.searchField().clear();
        hpHeaderVE.searchField().sendKeys(Keys.CONTROL + "v" + Keys.ENTER);

        Assert.assertTrue(hpKPageElements.getHeaderShoesText().getText().toLowerCase().contains(second));

        goBack();
        hpHeaderVE.searchField().sendKeys(third + Keys.ENTER);

        Assert.assertTrue(hpHeaderVE.noResultTitle().getText().contains("РЕЗУЛЬТАТІВ НЕ ЗНАЙДЕНО"));

        goBack();
        hpHeaderVE.searchField().sendKeys(fourth + Keys.ENTER);

        Assert.assertTrue(hpHeaderVE.noResultTitle().getText().contains("РЕЗУЛЬТАТІВ НЕ ЗНАЙДЕНО"));

        goBack();
        hpHeaderVE.searchField().sendKeys(fifth + Keys.ENTER);

        Assert.assertTrue(hpHeaderVE.noResultTitle().getText().contains("РЕЗУЛЬТАТІВ НЕ ЗНАЙДЕНО"));

        goBack();
        hpHeaderVE.searchField().sendKeys(sixth + Keys.ENTER);

        Assert.assertTrue(hpHeaderVE.noResultTitle().getText().contains("РЕЗУЛЬТАТІВ НЕ ЗНАЙДЕНО"));

        goBack();
        hpHeaderVE.searchField().sendKeys(seventh + Keys.ENTER);

        Assert.assertTrue(hpHeaderVE.noResultTitle().getText().contains("РЕЗУЛЬТАТІВ НЕ ЗНАЙДЕНО"));

        goBack();
        hpHeaderVE.searchField().sendKeys(eighth + Keys.ENTER);
        Assert.assertTrue(hpHeaderVE.noResultTitle().getText().contains("РЕЗУЛЬТАТІВ НЕ ЗНАЙДЕНО"));

        goBack();
        hpHeaderVE.searchField().sendKeys(ninth + Keys.ENTER);

        Assert.assertFalse(hpKPageElements.getHeaderShoesText().getText().toLowerCase().contains(ninth));
    }

    @DataProvider(name = "search")
    public Object[][] dpMethod() {
        return new Object[][]{
                {"fresh foam arishi v5", "fuelcell shift trainer", "%", "0x00BD", "9999999", "Thrall987",
                        "Lake7854$%£$", "99999999999988888888888888888888888888777777777777777777", "    fr esh    "},
                {"new balance 520", "new balance x-shift", "!", "1f01ls", "11111 111", "Lorll111",
                        "1$R4ake7854124£$", "11199999999999988888882221248888888888888888888777777777777777777", "    fr esh1    "},
                {"new balance fresh foam roav", "new balance 545", "&", "1x0012F", "256436325", "Rilladl333",
                        "Fdrfe3254£$", "3425499999999999988888888888888888888888888777777777777777777", " 1   ce ech    "}};
    }
}
