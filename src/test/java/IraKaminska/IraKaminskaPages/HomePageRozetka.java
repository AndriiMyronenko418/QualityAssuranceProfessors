package IraKaminska.IraKaminskaPages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageRozetka extends BasePage {

    public HomePageRozetka(WebDriver driver) {
        super(driver);
    }

    private static final String MENU_BUTTON_ROZETKA = "//button[@class='header__button ng-tns-c94-1']";
    private static final String CATALOG_BUTTON_ROZETKA = "//button[@id='fat-menu' and @class='button button--large side-menu__button ng-tns-c94-1']";
    private static final String PHONES_TV_ELECTRONICS_BUTTON_ROZETKA = "//a[text()= 'Смартфоны, ТВ и электроника']";
    private static final String EXPONEA_CLOSE = "//span[@class='exponea-close-cross']";
    private static final String BEAUTY_AND_HEALTH_BUTTON_ROZETKA = "//a[text()= 'Красота и здоровье']";

    public void exponeaClose() {
        if ($$(EXPONEA_CLOSE).size() > 0) {
            $$(EXPONEA_CLOSE).get(0).click();
        }
    }

    public WebElement getRozetkaMenuButton() {
        return $(MENU_BUTTON_ROZETKA);
    }

    public WebElement getRozetkaCatalogButton() {
        return $(CATALOG_BUTTON_ROZETKA);
    }

    public WebElement getRozetkaPhonesTvElectronicsButton() {
        return $(PHONES_TV_ELECTRONICS_BUTTON_ROZETKA);
    }

    public WebElement getRozetkaBeautyAndHealthButton() {
        return $(BEAUTY_AND_HEALTH_BUTTON_ROZETKA);
    }
}