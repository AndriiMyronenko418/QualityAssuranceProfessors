package Safron.Disney.Tests;

import BasePageAndTestInit.TestInit;
import Safron.Disney.Pages.DisneyBackToSchoolPageElements;
import Safron.Disney.Pages.DisneyBackToSchoolPageHelper;
import Safron.Disney.Pages.DisneyHeaderViewElements;
import Safron.Disney.Pages.DisneyWishPageHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCartAndWish extends TestInit {

    @Test
    public void testCartAndWishList() {

        DisneyHeaderViewElements disneyHeaderViewElements = new DisneyHeaderViewElements(driver);
        DisneyBackToSchoolPageHelper disneyBackToSchoolPageHelper = new DisneyBackToSchoolPageHelper(driver);
        DisneyBackToSchoolPageElements disneyBackToSchoolPageElements = new DisneyBackToSchoolPageElements(driver);
        DisneyWishPageHelper disneyWishPageHelper = new DisneyWishPageHelper(driver);

        openUrl("https://www.shopdisney.com/");

        disneyHeaderViewElements.backToSchoolCategoryBtn().click();
        disneyBackToSchoolPageHelper.setTextNameProduct();
        disneyBackToSchoolPageHelper.setTextPriceProduct();
        scroll(350);
        disneyBackToSchoolPageHelper.moveToProduct();
        disneyBackToSchoolPageElements.productQuickShopBtn().click();
        disneyBackToSchoolPageHelper.setTextNameProductCart();
        disneyBackToSchoolPageHelper.setTextPriceProductCart();
        disneyBackToSchoolPageElements.addWishBtn().click();
        disneyBackToSchoolPageHelper.popUpWishBtnClick();
        disneyWishPageHelper.setTextProductNameWish();
        disneyWishPageHelper.setTextProductPriceWish();

        Assert.assertEquals(disneyBackToSchoolPageHelper.getTextNameProduct(), disneyBackToSchoolPageHelper.getTextNameProductCart());
        Assert.assertEquals(disneyBackToSchoolPageHelper.getTextPriceProduct(), disneyBackToSchoolPageHelper.getTextPriceProductCart());
        Assert.assertEquals(disneyBackToSchoolPageHelper.getTextNameProductCart(), disneyWishPageHelper.getTextProductNameWish());
        Assert.assertEquals(disneyBackToSchoolPageHelper.getTextPriceProductCart(), disneyWishPageHelper.getTextProductPriceWish());
    }
}
