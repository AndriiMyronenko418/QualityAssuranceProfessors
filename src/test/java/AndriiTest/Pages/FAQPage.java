package AndriiTest.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FAQPage extends BasePage {

    public FAQPage(WebDriver driver) {
        super(driver);
    }

    private static final String HEADER = "//h1";
    private static final String SECTION_HEADERS = "//div[@class='row']//h4";

    public WebElement getHeader() {
        return $(HEADER);
    }

    public List<WebElement> getSectionHeaders() {
        return $$(SECTION_HEADERS);
    }
}