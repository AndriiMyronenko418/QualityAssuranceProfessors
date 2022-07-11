package Safron.NewBalanceUa.Tests;

import BasePageAndTestInit.TestInit;
import Safron.NewBalanceUa.Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCart extends TestInit {

    @Test
    public void testCart(){

        NewBalanceHeaderViewHelper newBalanceHeaderViewHelper = new NewBalanceHeaderViewHelper(driver);
        NewBalanceSearchResultPage newBalanceSearchResultPage = new NewBalanceSearchResultPage(driver);
        NewBalanceProductPageElements newBalanceProductPageElements = new NewBalanceProductPageElements(driver);
        NewBalanceProductPageHelper newBalanceProductPageHelper = new NewBalanceProductPageHelper(driver);
        NewBalanceCartViewHelper newBalanceCartViewHelper = new NewBalanceCartViewHelper(driver);

        openUrl("https://newbalance.ua/");

        newBalanceHeaderViewHelper.search("997");
        newBalanceSearchResultPage.products().get(0).click();
        newBalanceProductPageElements.sizeBoard().get(3).click();
        newBalanceProductPageElements.getToCartBtn().click();
        newBalanceHeaderViewHelper.cartClick();
        newBalanceProductPageHelper.setArticle();
        newBalanceProductPageHelper.setPrice();
        newBalanceProductPageHelper.setSize();
        newBalanceCartViewHelper.setArticle();
        newBalanceCartViewHelper.setPrice();
        newBalanceCartViewHelper.setSize();

        Assert.assertEquals(newBalanceProductPageHelper.getArticle(), newBalanceCartViewHelper.getArticle());
        Assert.assertEquals(newBalanceProductPageHelper.getPrice(), newBalanceCartViewHelper.getPrice());
        Assert.assertEquals(newBalanceProductPageHelper.getSize(), newBalanceCartViewHelper.getSize());
    }
}
