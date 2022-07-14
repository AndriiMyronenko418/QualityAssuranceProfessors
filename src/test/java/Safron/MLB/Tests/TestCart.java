package Safron.MLB.Tests;

import BasePageAndTestInit.TestInit;
import Safron.MLB.Pages.MLBCartPageHelper;
import Safron.MLB.Pages.MLBHeaderViewHelper;
import Safron.MLB.Pages.MLBNewYorkYankeesPageElements;
import Safron.MLB.Pages.MLBProductPageHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCart extends TestInit {

    @Test
    public void testCart(){

        MLBHeaderViewHelper mlbHeaderViewHelper = new MLBHeaderViewHelper(driver);
        MLBNewYorkYankeesPageElements mlbNewYorkYankeesPageElements = new MLBNewYorkYankeesPageElements(driver);
        MLBProductPageHelper mlbProductPageHelper = new MLBProductPageHelper(driver);
        MLBCartPageHelper mlbCartPageHelper = new MLBCartPageHelper(driver);

        openUrl("https://www.mlbshop.com/");

        mlbHeaderViewHelper.closePopUP().click();
        mlbHeaderViewHelper.moveToMen();
        mlbHeaderViewHelper.newYorkYankees().click();
        mlbNewYorkYankeesPageElements.tShort().click();
        mlbProductPageHelper.choosePlayer();
        mlbProductPageHelper.sizeXLBtn().click();
        mlbProductPageHelper.chooseQuantity(1);
        mlbProductPageHelper.setNameOfProduct();
        mlbProductPageHelper.setPriceOfProduct();
        mlbProductPageHelper.addToCart();
        mlbCartPageHelper.setNameOfProduct();
        mlbCartPageHelper.setEachPriceOfProduct();

        Assert.assertEquals(mlbProductPageHelper.getNameOfProduct(), mlbCartPageHelper.getNameOfProduct());
        Assert.assertEquals(mlbProductPageHelper.getPriceOfProduct(), mlbCartPageHelper.getEachPriceOfProduct());
    }
}
