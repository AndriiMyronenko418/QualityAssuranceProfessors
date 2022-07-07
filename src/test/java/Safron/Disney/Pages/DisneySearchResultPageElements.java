package Safron.Disney.Pages;
import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class DisneySearchResultPageElements extends BasePage {
    public DisneySearchResultPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String SPIDER_MAN_CATEGORY = "//a[@data-linkid='page_content/breadcrumb/Spider-Man/4']";
    private static final String TITLE_TEXT = "//div[contains(@class,'text_container')]//h1";
    private static final String ONE_OF_PRODUCT = "//div[@itemprop='name']//a[contains(@data-linkname,'3921059192073M')]";
    private static final String GENDER_FILTER = "//button[@title='Gender']";
    private static final String GENDER_FILTER_BOYS = "//a[@data-linkid='list_page_content/filter/Gender/Boys']//div";

    public WebElement spiderManCategory(){
        return $(SPIDER_MAN_CATEGORY);
    }
    public WebElement titleText(){
        return $(TITLE_TEXT);
    }
    public WebElement oneOfProduct(){
        return $(ONE_OF_PRODUCT);
    }
    public WebElement genderFilter(){
        return $(GENDER_FILTER);
    }
    public WebElement genderFilterBoys(){
        return $(GENDER_FILTER_BOYS);
    }
}
