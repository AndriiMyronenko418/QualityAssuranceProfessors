package TSibatyykEvhenii.Pages.Hotline;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HotlineSite extends BasePage {

    public HotlineSite(WebDriver driver) {
        super(driver);
    }

    private static final String HOTLINE_ADDRESS = "https://hotline.ua/";
    private static final String CATALOG_BTN = "//div[contains(@class,'button-menu-main')]";
    private static final String HOUSEHOLD_SECTION = "//li[contains(@data-menu-main-item,'Побутова техніка')]";
    private static final String LEFT_MENU_LIST = "//i[@class='icon-menu icon-menu-musical_instruments']";
    private static final String GUITARS_BTN = "//span[contains(text(), 'Гітари')]";
    private static final String INSTRUMENT_LIST = "//li[@class='category-navigation__item hidden-below-lg']";
    private static final String BOWED_INSTRUMENTS_SECTION = "(//div[@class='section-navigation__item content'])[1]";
    private static final String CHECKBOX_VIOLIN_FILTER = "//div[contains(@class,'checkbox__checkmark-plus')]";
    private static final String TO_REVEAL_ALL_BRAND = "//div[@class='sidebar-filter__bottom-button']";
    private static final String TO_REVEAL_ALL_STORES = "//div[@class='sidebar-filter__search-button']";
    private static final String CHOSEN_BTN = "//div[contains(@class,'active')]/b";
    private static final String SEARCH_FIELD = "//input[contains(@type,'text')]";
    private static final String SEARCHING_RESULT_FOR_PLAYSTATION = "(//a[contains(@class,'m_b-5')])[1]";

    public void goToHotline() {
        driver.get(HOTLINE_ADDRESS);
    }

    public void muzInstrument() {
        moveTo(LEFT_MENU_LIST);
    }

    public WebElement houseHoldSection(){
        return $(HOUSEHOLD_SECTION);
    }

    public WebElement catalogBtn(){
        return $(CATALOG_BTN);
    }

    public WebElement guitarsSectionSelect() {
        return $(GUITARS_BTN);
    }

    public List<WebElement> getBowedInstrument() {
        return $$(INSTRUMENT_LIST);
    }

    public WebElement violinSection() {
        return $(BOWED_INSTRUMENTS_SECTION);
    }

    public List<WebElement> chooseCheckbox() {
        return $$(CHECKBOX_VIOLIN_FILTER);
    }

    public WebElement openFullBrandList() {
        return $(TO_REVEAL_ALL_BRAND);
    }

    public WebElement openFullStoreList() {
        return $(TO_REVEAL_ALL_STORES);
    }

    public WebElement chosenElementBtn() {
        return $(CHOSEN_BTN);
    }

    public WebElement searchField(){
        return $(SEARCH_FIELD);
    }

    public WebElement searchResult(){
        return $(SEARCHING_RESULT_FOR_PLAYSTATION);
    }
}
