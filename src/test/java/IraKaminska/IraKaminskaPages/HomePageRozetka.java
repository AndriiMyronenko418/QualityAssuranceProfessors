package IraKaminska.IraKaminskaPages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class HomePageRozetka extends BasePage {

    public HomePageRozetka(WebDriver driver) {
        super(driver);
    }

    private static final String MENU_BUTTON_ROZETKA = "//button[@class='header__button ng-tns-c94-1']";
    private static final String CATALOG_BUTTON_ROZETKA = "//button[@id='fat-menu' and @class='button button--large side-menu__button ng-tns-c94-1']";
    private static final String PHONES_TV_ELECTRONICS_BUTTON_ROZETKA = "//a[text()= 'Смартфоны, ТВ и электроника']";
    private static final String EXPONEA_CLOSE = "//span[@class='exponea-close-cross']";

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
}