package Safron.NewBalanceUa.Tests;

import BasePageAndTestInit.TestInit;
import Safron.NewBalanceUa.Pages.NewBalanceHeaderViewHelper;
import Safron.NewBalanceUa.Pages.NewBalanceSearchResultHelper;
import org.testng.annotations.Test;

public class TestSearch extends TestInit {

    @Test
    public void testSearch() {

        NewBalanceHeaderViewHelper newBalanceHeaderViewHelper = new NewBalanceHeaderViewHelper(driver);
        NewBalanceSearchResultHelper newBalanceSearchResultHelper = new NewBalanceSearchResultHelper(driver);

        openUrl("https://newbalance.ua/");

        newBalanceHeaderViewHelper.search("574");
        newBalanceSearchResultHelper.assertSearchResult("5");
    }
}
