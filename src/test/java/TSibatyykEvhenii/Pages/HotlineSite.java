package TSibatyykEvhenii.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HotlineSite extends BasePage {


    public HotlineSite(WebDriver driver) {
        super(driver);
    }
    public static final String HOTLINE_ADRESS = "https://hotline.ua/";
    public static final String LEFT_MENU_LIST = "//i[@class='icon-menu icon-menu-musical_instruments']";
    public static final String GITARS_BTN = "//span[contains(text(), 'Гітари')]";
    public static final String INSTRUMENT_LIST = "//li[@class='category-navigation__item hidden-below-lg']";
    public static final String BOWED_INSTRUMENTS_SECTION = "(//div[@class='section-navigation__item content'])[1]";
    public static final String CHECKBOX_VIOLIN_FILTER = "//div[contains(@class,'checkbox__checkmark-plus')]";
    public static final String TO_REVEAL_ALL_BRAND = "//div[@class='sidebar-filter__bottom-button']";
    public static final String TO_REVEAL_ALL_STORES = "//div[@class='sidebar-filter__search-button']";
    public static final String CHOOSEN_BTN = "//div[contains(@class,'active')]/b";


    public void goToHotline(){ driver.get(HOTLINE_ADRESS);    }
    public WebElement muzInstrument(){return moveTo$(LEFT_MENU_LIST);}
    public WebElement gitarsSectionSelect(){
        return $(GITARS_BTN);
    }
    public List<WebElement> getBowedInstrument(){ return $$(INSTRUMENT_LIST); }
    public WebElement violinSection(){return $(BOWED_INSTRUMENTS_SECTION);}
    public List<WebElement> chooseCheckbox(){return $$(CHECKBOX_VIOLIN_FILTER);}
    public WebElement openFullBrandList(){return $(TO_REVEAL_ALL_BRAND);}
    public WebElement openFullStoreList(){return $(TO_REVEAL_ALL_STORES);}
    public WebElement choosenElementBtn(){return $(CHOOSEN_BTN);}



}
