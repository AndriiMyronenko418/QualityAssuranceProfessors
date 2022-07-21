package NewBalance.Tests;

import BasePageAndTestInit.TestInit;
import NewBalance.Pages.NewBalanceHeaderViewHelper;
import NewBalance.Pages.NewBalanceManShoesPageHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewBalancePriceFilterTest extends TestInit {

    @Test
    public void testPriceFilter() {

        NewBalanceHeaderViewHelper newBalanceHeaderViewHelper = new NewBalanceHeaderViewHelper(driver);
        NewBalanceManShoesPageHelper newBalanceManShoesPageHelper = new NewBalanceManShoesPageHelper(driver);

        openUrl("https://newbalance.ua/");
        newBalanceHeaderViewHelper.moveToManCatalogBtn();
        newBalanceHeaderViewHelper.manAllShoesBtn().click();
        newBalanceManShoesPageHelper.enterMinPrice("2000");
        newBalanceManShoesPageHelper.enterMaxPrice("7000");
        newBalanceManShoesPageHelper.setShoesPriceInt();
        newBalanceManShoesPageHelper.setShoesDiscountPrice();
        newBalanceManShoesPageHelper.sort("дешеві").click();

        for (Integer n : newBalanceManShoesPageHelper.getShoesDiscountPrice()) {
            Assert.assertTrue(n <= 7000 && n >= 2000);
        }
        for (Integer n : newBalanceManShoesPageHelper.getShoesPriceInt()) {
            Assert.assertTrue(n <= 7000 && n >= 2000);
        }

        newBalanceManShoesPageHelper.sort("дорогі").click();
        newBalanceManShoesPageHelper.setShoesPriceInt();
        newBalanceManShoesPageHelper.setShoesDiscountPrice();

        for (Integer n : newBalanceManShoesPageHelper.getShoesDiscountPrice()) {
            Assert.assertTrue(n <= 7000 && n >= 2000);
        }
        for (Integer n : newBalanceManShoesPageHelper.getShoesPriceInt()) {
            Assert.assertTrue(n <= 7000 && n >= 2000);
        }
    }
}