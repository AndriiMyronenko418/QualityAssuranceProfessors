package NewBalance.Tests;

import BasePageAndTestInit.TestInit;
import NewBalance.Pages.NewBalanceHeaderViewHelper;
import NewBalance.Pages.NewBalanceKidsPageHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewBalanceColorFilterTest extends TestInit {

    @Test
    public void testColorFilter(){

        NewBalanceHeaderViewHelper newBalanceHeaderViewHelper = new NewBalanceHeaderViewHelper(driver);
        NewBalanceKidsPageHelper newBalanceKidsPageHelper = new NewBalanceKidsPageHelper(driver);

        openUrl("https://newbalance.ua/");
        newBalanceHeaderViewHelper.catalogBtn("Дітям").click();
        newBalanceKidsPageHelper.pinkFilter().click();

        Assert.assertTrue(newBalanceKidsPageHelper.pinkFilter().isEnabled());
        Assert.assertTrue(newBalanceKidsPageHelper.labelCircleColor().isDisplayed());
        Assert.assertEquals(newBalanceKidsPageHelper.getPinkFilterColor(), newBalanceKidsPageHelper.getLabelCircleColor());
        Assert.assertTrue(newBalanceKidsPageHelper.label().getText().contains("Рожевий"));
        for (int i = 0; i < newBalanceKidsPageHelper.products().size(); i++) {
            newBalanceKidsPageHelper.moveToProduct(i);
            Assert.assertTrue(newBalanceKidsPageHelper.productsColor("#fa9ae7").get(i).isDisplayed()); //I stopped on this step, try do this soon
        }
    }
}
