package TSibatyykEvhenii.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonMainPage extends BasePage {

    public AmazonMainPage(WebDriver driver) {
        super(driver);
    }

    private static final String SEARCH_FIELD = "//input[contains(@type,'text')]";
    private static final String SEARCH_RESULT = "(//span[contains(@class,'a-text-normal') and text()='2021'])[1]";
    private static final String RATING_IMDB = "//span[contains(@data-automation-id,'imdb')]";

    public WebElement searchField(){
        return $(SEARCH_FIELD);
    }

    public WebElement searchResult(){
        return $(SEARCH_RESULT);
    }

    public WebElement imdbRating(){
        return $(RATING_IMDB);
    }
}
