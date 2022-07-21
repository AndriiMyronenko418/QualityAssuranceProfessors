package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonVideoGamesSection extends BasePage {

    public AmazonVideoGamesSection(WebDriver driver) {
        super(driver);
    }

private static final String SPAN_TEXT = "//span[text()='%s']";

    public WebElement videoGameSection(String option){
        return $(String.format(SPAN_TEXT, option));
    }
}
