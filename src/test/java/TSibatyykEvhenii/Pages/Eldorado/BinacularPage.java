package TSibatyykEvhenii.Pages.Eldorado;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BinacularPage extends BasePage {

    public BinacularPage(WebDriver driver) {
        super(driver);
    }

    private static final String FILTER_COLOR_BTN = "//div[contains(@id,'element-19553')]";
    private static final String CHECKBOX_WHITECOLOR = "//label[contains(@for,'95487')]";
    private static final String RESULT_AFTER_WHITECOLOR_FILTER_USING = "//div[contains(@class,'goods-item-content')]";

    public WebElement checkboxWhiteColor() {
        return $(CHECKBOX_WHITECOLOR);
    }

    public WebElement colorFilter() {
        return $(FILTER_COLOR_BTN);
    }

    public List<WebElement> getFirstElement() {
        return $$(RESULT_AFTER_WHITECOLOR_FILTER_USING);
    }
}