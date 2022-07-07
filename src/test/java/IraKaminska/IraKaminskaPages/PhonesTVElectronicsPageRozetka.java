package IraKaminska.IraKaminskaPages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhonesTVElectronicsPageRozetka extends BasePage {
    public PhonesTVElectronicsPageRozetka(WebDriver driver) {
        super(driver);
    }

    public WebElement clickCellphonesRozetkaBtn() {
        return driver.findElement(By.xpath("//a[@class='tile-cats__heading tile-cats__heading_type_center ng-star-inserted' and @title='Мобильные телефоны']"));
    }

    public WebElement clickAppleIPhonesRozetkaBtn() {
        return driver.findElement(By.xpath("//a[@data-id='Apple']"));
    }

    public WebElement clickAppleIPhones13ProMaxRozetkaBtn() {
        return driver.findElement(By.xpath("//a[@data-id='iPhone 13 Pro Max']"));
    }

    public boolean checkURLAppleIPhones13ProMaxRozetka() {
        return driver.getCurrentUrl().contains("producer=apple;series=113083");
    }
}
