package IraKaminska.IraKaminskaTests;

import BasePageAndTestInit.TestInit;
import IraKaminska.IraKaminskaPages.HomePageRozetka;
import IraKaminska.IraKaminskaPages.PhonesTVElectronicsPageRozetka;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckRozetkaAppleIphones13ProMaxList extends TestInit {

    @Test
    public void checkRozetkaAppleIPhones13ProMaxList() {
        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        openUrl("https://rozetka.com.ua/");
        sleep(4);
        if (driver.findElements(By.xpath("//span[@class='exponea-close-cross']")).size()>0) {
            driver.findElements(By.xpath("//span[@class='exponea-close-cross']")).get(0).click();
        }
        sleep(4);
        homePageRozetka.clickRozetkaManuBtn().click();
        sleep(4);
        homePageRozetka.clickRozetkaCatalogBtn().click();
        sleep(4);
        homePageRozetka.ClickRozetkaPhonesTVElectronicsBtn().click();
        sleep(4);
        PhonesTVElectronicsPageRozetka phonesTVElectronicsPageRozetka = new PhonesTVElectronicsPageRozetka(driver);
        phonesTVElectronicsPageRozetka.clickCellphonesRozetkaBtn().click();
        sleep(4);
        phonesTVElectronicsPageRozetka.clickAppleIPhonesRozetkaBtn().click();
        sleep(4);
        phonesTVElectronicsPageRozetka.clickAppleIPhones13ProMaxRozetkaBtn().click();
        sleep(4);

        Assert.assertTrue(phonesTVElectronicsPageRozetka.checkURLAppleIPhones13ProMaxRozetka());
    }
}
