package TSibatyykEvhenii.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ImdbMainPage extends BasePage {
    public ImdbMainPage(WebDriver driver) {
        super(driver);
    }

    private static final String HEADER_SEARCH = "//input[contains(@id,'suggestion-search')]";
    private static final String SEARCH_REAZULT = "//div[contains(@class,'searchResult__constTitle')]";
    private static final String DIRECTOR_STRING = "//a[contains(@class,'ipc-metadata-list-item__list-content-item--link')]";

    public void goToImdb() {
        driver.get("https://www.imdb.com/");
    }

    public WebElement getSearchField() {
        return $(HEADER_SEARCH);
    }

    public List<WebElement> getJawsFromSearch() {
        return $$(SEARCH_REAZULT);
    }

    public List<WebElement> getDirectorName() {
        return $$(DIRECTOR_STRING);
    }
}