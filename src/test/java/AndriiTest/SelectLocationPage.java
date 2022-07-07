package AndriiTest;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectLocationPage extends BasePage {
    public SelectLocationPage(WebDriver driver) {
        super(driver);
    }

    private static final String GO_BTN = "//button[@id='form-submit-btn']";
    private static final String LANGUAGE = "//span[@id='langLabel']";
    private static final String SELECT_LOCATION_DROPDOWN_LIST = "//select[@id='country']";
    private static final String SELECT_LOCATION_DROPDOWN_LIST_OPTION = SELECT_LOCATION_DROPDOWN_LIST + "//option[@value='%s']";

    public WebElement getGoBtn() {
        return $(GO_BTN);
    }

    public WebElement getLanguage() {
        return $(LANGUAGE);
    }

    public WebElement getSelectLocationDropdownList() {
        return $(SELECT_LOCATION_DROPDOWN_LIST);
    }

    public WebElement getSelectLocationDropdownListOption(String country) {
        return $(String.format(SELECT_LOCATION_DROPDOWN_LIST_OPTION, country));
    }
}
