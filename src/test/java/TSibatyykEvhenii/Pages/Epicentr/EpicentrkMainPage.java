package TSibatyykEvhenii.Pages.Epicentr;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EpicentrkMainPage extends BasePage {

    public EpicentrkMainPage(WebDriver driver) {
        super(driver);
    }

    private static final String INFORMATOIN_BTN = "//*[contains(text(),'ІНФОРМАЦІЯ ')]";
    private static final String CHANGE_LANGUAGE_BTN = "//label[contains(@class,'switch__label')]";
    private static final String SEARCH_FIELD = "//input[contains(@type,'text')]";
    private static final String SEARCH_BTN = "//div[contains(@data-is,'Search')]/button";


    public WebElement informationBtn(){
        return $(INFORMATOIN_BTN);
    }

    public WebElement changeLanguageBtn(){
        return $(CHANGE_LANGUAGE_BTN);
    }

    public List<WebElement> searchField(){
        return $$(SEARCH_FIELD);
    }

    public WebElement searchBtn(){
        return $(SEARCH_BTN);
    }



}
