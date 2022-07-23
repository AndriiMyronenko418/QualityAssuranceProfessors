package NewBalance.Tests;

import BasePageAndTestInit.TestInit;
import NewBalance.Pages.NewBalanceHeaderViewElements;
import NewBalance.Pages.NewBalanceKidsPageElements;
import YevheniiBondarenko.Tests.Pages.NewBalanceWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewBalanceCheckTheSizeFilterOfKidsShoes extends TestInit {

    @Test
    public void checkFilterOfKidsShoes() {

        NewBalanceHeaderViewElements hpHeaderVE = new NewBalanceHeaderViewElements(driver);
        NewBalanceKidsPageElements hpKPageElements = new NewBalanceKidsPageElements(driver);
        NewBalanceWebElement hpWElement = new NewBalanceWebElement(driver);

        openUrl("https://newbalance.ua/");
        hpHeaderVE.getHeaderOption("Дітям").click();
        hpWElement.shoes().click();

        for (int i = 0; i < hpKPageElements.getKidsShoeSizes().size(); i++) {
            hpKPageElements.listOfColourSizes().get(i).click();

            Assert.assertEquals(hpKPageElements.getKidsShoeSizes().get(i), hpKPageElements.getSizeFromHeader());
            System.out.println("Value from the size table = " + (hpKPageElements.getKidsShoeSizes().get(i)) + "; "
                    + "Value from header = " + hpKPageElements.getSizeFromHeader());
            goBack();
        }
    }
}