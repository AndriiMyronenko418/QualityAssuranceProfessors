package Safron.NewBalanceUa.Tests;

import BasePageAndTestInit.TestInit;
import Safron.NewBalanceUa.Pages.NewBalanceHeaderViewElements;
import Safron.NewBalanceUa.Pages.NewBalanceHeaderViewHelper;
import Safron.NewBalanceUa.Pages.NewBalanceManShoesPageElements;
import Safron.NewBalanceUa.Pages.NewBalanceManShoesPageHelper;
import org.testng.annotations.Test;

public class TestSizeBoard extends TestInit {

    @Test
    public void testManShoesSize() {

        NewBalanceHeaderViewElements newBalanceHeaderViewElements = new NewBalanceHeaderViewElements(driver);
        NewBalanceHeaderViewHelper newBalanceHeaderViewHelper = new NewBalanceHeaderViewHelper(driver);
        NewBalanceManShoesPageElements newBalanceManShoesPageElements = new NewBalanceManShoesPageElements(driver);
        NewBalanceManShoesPageHelper newBalanceManShoesPageHelper = new NewBalanceManShoesPageHelper(driver);

        openUrl("https://newbalance.ua/");

        newBalanceHeaderViewHelper.moveToManCatalogBtn();
        newBalanceHeaderViewElements.manAllShoesBtn().click();
        newBalanceManShoesPageHelper.setUsSizeList();
        newBalanceManShoesPageElements.ukSizeBtn().click();
        newBalanceManShoesPageHelper.setUkSizeList();
        newBalanceManShoesPageElements.euSizeBtn().click();
        newBalanceManShoesPageHelper.setEuSizeList();
        newBalanceManShoesPageElements.uaSizeBtn().click();
        newBalanceManShoesPageHelper.setUaSizeList();

        newBalanceManShoesPageHelper.assertsBoardsNotEquals();
    }
}
