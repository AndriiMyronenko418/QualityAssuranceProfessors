package AndriiTest.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HelpPage extends BasePage {

    public HelpPage(WebDriver driver) {
        super(driver);
    }

    private static final String HELP_OPTIONS = "//table[@class='help-table']";
    private static final String CALL_US_BTN = "//tr[contains(@data-href,'tel:0800')]//p[@class='table-title selected']";
    private static final String PHONE_NUMBER = "//tr[contains(@data-href,'tel')]//p[@class='table-title selected']//a";

    public WebElement getPhoneNumber() {
        return $(PHONE_NUMBER);
    }

    public WebElement getCallUsBtn() {
        return $(CALL_US_BTN);
    }

    public List<WebElement> getHelpOptions() {
        return $$(HELP_OPTIONS);
    }
}