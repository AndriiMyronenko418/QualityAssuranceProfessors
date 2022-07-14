package Safron.NewBalanceUa.Tests;

import BasePageAndTestInit.TestInit;
import Safron.NewBalanceUa.Pages.NewBalanceHeaderViewElements;
import Safron.NewBalanceUa.Pages.NewBalanceHeaderViewHelper;
import Safron.NewBalanceUa.Pages.NewBalanceManShoesPageHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFilterLowHigh extends TestInit {

    @Test
    public void testFilter(){
        NewBalanceHeaderViewElements newBalanceHeaderViewElements = new NewBalanceHeaderViewElements(driver);
        NewBalanceHeaderViewHelper newBalanceHeaderViewHelper = new NewBalanceHeaderViewHelper(driver);
        NewBalanceManShoesPageHelper newBalanceManShoesPageHelper = new NewBalanceManShoesPageHelper(driver);

        openUrl("https://newbalance.ua/");

        newBalanceHeaderViewHelper.moveToManCatalogBtn();
        newBalanceHeaderViewElements.manAllShoesBtn().click();
        newBalanceManShoesPageHelper.shoesForRun().click();
        newBalanceManShoesPageHelper.crossCountry().click();
        newBalanceManShoesPageHelper.setShoesPriceSortJava();
        newBalanceManShoesPageHelper.sortLowHigh().click();
        newBalanceManShoesPageHelper.setShoesPriceLToH();

        Assert.assertEquals(newBalanceManShoesPageHelper.getShoesPriceSortJava(), newBalanceManShoesPageHelper.getShoesPriceLToH());
    }
}
