package YevheniiBondarenko.Tests.Tests;

import BasePageAndTestInit.TestInit;
import YevheniiBondarenko.Tests.Pages.MansShoesItemPage;
import YevheniiBondarenko.Tests.Pages.WomanDressItemsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDanceShopper extends TestInit {

    @Test
    public void checkDressForDance(){

        WomanDressItemsPage womanDressItemsPage = new WomanDressItemsPage(driver);
        Actions action = new Actions(driver);

        openUrl("https://www.danceshopper.com/");
        womanDressItemsPage.goToWomanClothes().click();
        womanDressItemsPage.ballroomSkirts().click();
        action.moveToElement(womanDressItemsPage.brandList()).perform();
        womanDressItemsPage.forDSIBrand().click();
        action.moveToElement(womanDressItemsPage.brandList()).perform();
        womanDressItemsPage.forArmandoBrand().click();
        action.moveToElement(womanDressItemsPage.brandList()).perform();
        womanDressItemsPage.forEspenBrand().click();
        action.moveToElement(womanDressItemsPage.sizeList()).perform();
        womanDressItemsPage.sizeM().click();
        action.moveToElement(womanDressItemsPage.sizeList()).perform();
        womanDressItemsPage.sizeS().click();
        action.moveToElement(womanDressItemsPage.sizeList()).perform();
        womanDressItemsPage.sizeXS().click();
        action.moveToElement(womanDressItemsPage.colorList()).perform();
        womanDressItemsPage.colorBlackAndWhite().click();
        action.moveToElement(womanDressItemsPage.colorList()).perform();
        womanDressItemsPage.colorBlack().click();
        action.moveToElement(womanDressItemsPage.colorList()).perform();
        womanDressItemsPage.colorAnimal().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(656,1979)");
        womanDressItemsPage.blackWhiteDress().click();
        womanDressItemsPage.lastSizeOption().click();
        womanDressItemsPage.sizeSmall().click();

        Assert.assertTrue(womanDressItemsPage.thePriceOfDress().isDisplayed());
        Assert.assertTrue(womanDressItemsPage.theName().isDisplayed());
        Assert.assertTrue(womanDressItemsPage.addToCart().isDisplayed());
        womanDressItemsPage.addToCart().click();
    }

    @Test
    public void checkMansShoes(){

        MansShoesItemPage mansShoesItemPAge = new MansShoesItemPage(driver);
        WomanDressItemsPage womanDressItemsPage = new WomanDressItemsPage(driver);
        Actions action = new Actions(driver);

        openUrl("https://www.danceshopper.com/");
        mansShoesItemPAge.goToManClothes().click();
        mansShoesItemPAge.mansBallroomShoes().click();
        action.moveToElement(mansShoesItemPAge.mansShoesBrands()).perform();
        mansShoesItemPAge.reyroseShoesBrand().click();
        action.moveToElement(mansShoesItemPAge.mansShoesBrands()).perform();
        mansShoesItemPAge.supadanceShoesBrand().click();
        action.moveToElement(mansShoesItemPAge.mansShoesBrands()).perform();
        mansShoesItemPAge.paoulShoesBrand().click();
        action.moveToElement(mansShoesItemPAge.shoesSize()).perform();
        mansShoesItemPAge.size115().click();
        action.moveToElement(mansShoesItemPAge.shoesSize()).perform();
        mansShoesItemPAge.size125().click();
        action.moveToElement(mansShoesItemPAge.colorList()).perform();
        mansShoesItemPAge.manShoesBlack().click();
        mansShoesItemPAge.shoesSupadance().click();
        mansShoesItemPAge.conformSize().click();
        mansShoesItemPAge.footSize().click();

        Assert.assertTrue(mansShoesItemPAge.shoesModelNumber().isDisplayed());
        Assert.assertTrue(mansShoesItemPAge.shoesPrice().isDisplayed());
        womanDressItemsPage.addToCart().click();
    }
}