package Safron.JollyBell.Tests;

import BasePageAndTestInit.TestInit;
import Safron.JollyBell.Pages.JollyHeaderViewHelper;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCurrency extends TestInit {

    @DataProvider(name = "currencies")
    public Object[][] dpMethod() {
        return new Object[][]{
                {"USD"},
                {"EUR"},
                {"UAH"}};
    }

    @Test(dataProvider = "currencies")
    public void testCurrency(String currency) {

        JollyHeaderViewHelper jollyHeaderViewHelper = new JollyHeaderViewHelper(driver);

        openUrl("https://jolybell.com/");
        jollyHeaderViewHelper.headerBtns().get(1).click();
        if (!(jollyHeaderViewHelper.currencySwitcher(currency).isSelected())) {
            jollyHeaderViewHelper.currencySwitcher().click();
            jollyHeaderViewHelper.currency(currency).click();
        }
        for (WebElement element : jollyHeaderViewHelper.prices()) {
            Assert.assertTrue(element.getText().contains(currency));
        }
    }
}
