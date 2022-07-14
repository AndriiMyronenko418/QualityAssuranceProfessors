package YevheniiBondarenko.Tests.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemsInsideTheWebElement extends BasePage {
    public ItemsInsideTheWebElement(WebDriver driver) {
        super(driver);
    }

    private static final String CHOOSE_LOCATION_BTN = "//div[@class='header__locations-opener']";
    private static final String CHANGE_LANGUAGE_BTN = "//span[@class='switch__lever']";
    private static final String SEARCH_OPEN = "//div[@data-test='search-open']";
    private static final String SEARCH_FIELD = "//input[@placeholder='Пошук міста']";
    private static final String BROVARY_CITY = "(//div[@data-test='search-city-items']/child::b)[1]";
    private static final String ON_A_MAP = "//button[contains(text(),'на карті')]";
    private static final String BROVARY_EPICENTR = "//div[@class='leaflet-marker-icon _KOw6aF leaflet-zoom-animated leaflet-interactive']";
    private static final String CHOOSE = "//button[contains(text(),'Обрати')]";
    private static final String CITY_IN_HEADER = "//div[@title='Бровари'][@class='header__locations-city']";

    public WebElement chooseLocationBtn() {
        return $(CHOOSE_LOCATION_BTN);
    }

    public WebElement changeLanguageBtn() {
        return $(CHANGE_LANGUAGE_BTN);
    }

    public WebElement searchCityBtn() {
        return $(SEARCH_OPEN);
    }

    public WebElement searchField() {
        return $(SEARCH_FIELD);
    }

    public WebElement brovaryKyivRegion() {
        return $(BROVARY_CITY);
    }

    public WebElement onAMap() {
        return $(ON_A_MAP);
    }

    public WebElement epiOnAMap() {
        return $(BROVARY_EPICENTR);
    }

    public WebElement choose() {
        return $(CHOOSE);
    }

    public WebElement cityNameInHeader() {
        return $(CITY_IN_HEADER);
    }

}