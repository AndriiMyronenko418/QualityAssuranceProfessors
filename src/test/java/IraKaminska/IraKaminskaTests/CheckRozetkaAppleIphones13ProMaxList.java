package IraKaminska.IraKaminskaTests;

import BasePageAndTestInit.TestInit;
import IraKaminska.IraKaminskaPages.HomePageRozetka;
import IraKaminska.IraKaminskaPages.PhonesTvElectronicsPageRozetka;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckRozetkaAppleIphones13ProMaxList extends TestInit {

    @Test
    public void checkRozetkaAppleIPhones13ProMaxList() {

        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        PhonesTvElectronicsPageRozetka phonesTvElectronicsPageRozetka = new PhonesTvElectronicsPageRozetka(driver);

        openUrl("https://rozetka.com.ua/");
        homePageRozetka.exponeaClose();
        homePageRozetka.getRozetkaMenuButton().click();
        homePageRozetka.getRozetkaCatalogButton().click();
        homePageRozetka.getRozetkaPhonesTvElectronicsButton().click();
        phonesTvElectronicsPageRozetka.getCellphonesRozetkaButton().click();
        phonesTvElectronicsPageRozetka.getAppleIphonesRozetkaButton().click();
        phonesTvElectronicsPageRozetka.getAppleIphones13ProMaxRozetkaButton().click();

        Assert.assertTrue(phonesTvElectronicsPageRozetka.checkUrlAppleIphones13ProMaxRozetka());
    }
}