package NewBalance.Tests;

import BasePageAndTestInit.TestInit;
import NewBalance.Pages.NewBalanceHeaderViewHelper;
import NewBalance.Pages.NewBalanceManShoesPageHelper;
import org.testng.annotations.Test;

public class NewBalancePriceFilterTest extends TestInit {

    @Test
    public void testPriceFilter() {

        NewBalanceHeaderViewHelper newBalanceHeaderViewHelper = new NewBalanceHeaderViewHelper(driver);
        NewBalanceManShoesPageHelper newBalanceManShoesPageHelper = new NewBalanceManShoesPageHelper(driver);

        openUrl("https://newbalance.ua/");

        newBalanceHeaderViewHelper.moveToManCatalogBtn();
        newBalanceHeaderViewHelper.manAllShoesBtn().click();
        newBalanceManShoesPageHelper.moveSlider();
    }
}
