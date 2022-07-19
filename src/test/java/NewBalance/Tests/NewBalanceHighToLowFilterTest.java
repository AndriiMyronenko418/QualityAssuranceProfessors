package NewBalance.Tests;

import BasePageAndTestInit.TestInit;
import NewBalance.Pages.NewBalanceHeaderViewHelper;
import NewBalance.Pages.NewBalanceManShoesPageHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewBalanceHighToLowFilterTest extends TestInit {

    @Test
    public void testPriceFilter() {

        NewBalanceHeaderViewHelper newBalanceHeaderViewHelper = new NewBalanceHeaderViewHelper(driver);
        NewBalanceManShoesPageHelper newBalanceManShoesPageHelper = new NewBalanceManShoesPageHelper(driver);

        openUrl("https://newbalance.ua/");

        newBalanceHeaderViewHelper.moveToManCatalogBtn();
        newBalanceHeaderViewHelper.manAllShoesBtn().click();
        newBalanceManShoesPageHelper.shoesForRun().click();
        newBalanceManShoesPageHelper.crossCountry().click();
        newBalanceManShoesPageHelper.setShoesPriceSortJavaHigh();
        newBalanceManShoesPageHelper.sortHighLow().click();
        newBalanceManShoesPageHelper.setShoesPrice();

        Assert.assertEquals(newBalanceManShoesPageHelper.getShoesPriceSortJavaHigh(), newBalanceManShoesPageHelper.getShoesPrice());
    }
}