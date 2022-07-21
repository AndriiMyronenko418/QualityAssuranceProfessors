package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchResult extends BasePage {

    public AmazonSearchResult(WebDriver driver) {
        super(driver);
    }

    private static final String SPAN_TEXT = "//span[text()='%s']";

    public WebElement spanTextOption(String option){
        return moveTo(String.format(SPAN_TEXT, option));
    }
}