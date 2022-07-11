package IraKaminska.IraKaminskaPages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhonesTvElectronicsPageRozetka extends BasePage {
    public PhonesTvElectronicsPageRozetka(WebDriver driver) {
        super(driver);
    }

    private static final String CELLPHONES_BUTTON_ROZETKA = "//a[@class='tile-cats__heading tile-cats__heading_type_center ng-star-inserted' and @title='Мобильные телефоны']";
    private static final String APPLE_IPHONE_BUTTON_ROZETKA = "//a[@data-id='Apple']";
    private static final String APPLE_IPHONES_BUTTON_13PRO_MAX_BUTTON_ROZETKA = "//a[@data-id='iPhone 13 Pro Max']";

    public WebElement getCellphonesRozetkaButton() {
        return driver.findElement(By.xpath(CELLPHONES_BUTTON_ROZETKA));
    }

    public WebElement getAppleIphonesRozetkaButton() {
        return driver.findElement(By.xpath(APPLE_IPHONE_BUTTON_ROZETKA));
    }

    public WebElement getAppleIphones13ProMaxRozetkaButton() {
        return driver.findElement(By.xpath(APPLE_IPHONES_BUTTON_13PRO_MAX_BUTTON_ROZETKA));
    }

    public boolean checkUrlAppleIphones13ProMaxRozetka() {
        return driver.getCurrentUrl().contains("producer=apple;series=113083");
    }
}
