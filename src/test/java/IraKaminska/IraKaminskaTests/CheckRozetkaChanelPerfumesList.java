package IraKaminska.IraKaminskaTests;

import BasePageAndTestInit.TestInit;
import IraKaminska.IraKaminskaPages.BeautyHealthPageRozetka;
import IraKaminska.IraKaminskaPages.HomePageRozetka;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckRozetkaChanelPerfumesList extends TestInit {

    @Test
    public void checkRozetkaChanelPerfumesList() {

        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        BeautyHealthPageRozetka beautyHealthPageRozetka = new BeautyHealthPageRozetka(driver);

        openUrl("https://rozetka.com.ua/");
        homePageRozetka.exponeaClose();
        homePageRozetka.getRozetkaMenuButton().click();
        homePageRozetka.getRozetkaCatalogButton().click();
        homePageRozetka.getRozetkaBeautyAndHealthButton().click();
        beautyHealthPageRozetka.getWomenPerfumesButton().click();
        beautyHealthPageRozetka.getChanelPerfumesButton().click();

        Assert.assertTrue(beautyHealthPageRozetka.checkWomenChanelPerfumes().getText().contains("Chanel"));
    }
}