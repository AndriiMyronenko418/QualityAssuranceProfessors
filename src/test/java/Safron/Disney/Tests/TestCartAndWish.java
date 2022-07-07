package Safron.Disney.Tests;
import BasePageAndTestInit.TestInit;
import Safron.Disney.Pages.DisneyBackToSchoolPageElements;
import Safron.Disney.Pages.DisneyBackToSchoolPageHelper;
import Safron.Disney.Pages.DisneyHeaderViewElements;
import Safron.Disney.Pages.DisneyWishPageHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCartAndWish extends TestInit {
    @Test
    public void test6(){
        openUrl("https://www.shopdisney.com/");

        DisneyHeaderViewElements disneyHeaderViewElements = new DisneyHeaderViewElements(driver);
        disneyHeaderViewElements.backToSchoolCategoryBtn().click();

        DisneyBackToSchoolPageHelper disneyBackToSchoolPageHelper = new DisneyBackToSchoolPageHelper(driver);
        disneyBackToSchoolPageHelper.setTextNameProduct();
        disneyBackToSchoolPageHelper.setTextPriceProduct();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");

        disneyBackToSchoolPageHelper.moveToProduct();

        DisneyBackToSchoolPageElements disneyBackToSchoolPageElements = new DisneyBackToSchoolPageElements(driver);
        disneyBackToSchoolPageElements.productQuickShopBtn().click();

        disneyBackToSchoolPageHelper.setTextNameProductCart();
        disneyBackToSchoolPageHelper.setTextPriceProductCart();

        Assert.assertEquals(disneyBackToSchoolPageHelper.getTextNameProduct(), disneyBackToSchoolPageHelper.getTextNameProductCart());
        Assert.assertEquals(disneyBackToSchoolPageHelper.getTextPriceProduct(), disneyBackToSchoolPageHelper.getTextPriceProductCart());

        disneyBackToSchoolPageElements.addWishBtn().click();
        disneyBackToSchoolPageHelper.popUpWishBtnClick();

        DisneyWishPageHelper disneyWishPageHelper = new DisneyWishPageHelper(driver);
        disneyWishPageHelper.setTextProductNameWish();
        disneyWishPageHelper.setTextProductPriceWish();

        Assert.assertEquals(disneyBackToSchoolPageHelper.getTextNameProductCart(), disneyWishPageHelper.getTextProductNameWish());
        Assert.assertEquals(disneyBackToSchoolPageHelper.getTextPriceProductCart(), disneyWishPageHelper.getTextProductPriceWish());
    }
}
