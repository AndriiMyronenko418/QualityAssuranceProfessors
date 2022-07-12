package Safron.NewBalanceUa.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewBalanceManShoesPageElements extends BasePage {
    public NewBalanceManShoesPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String SIZE_BOARD_ELEMENTS = "//label[contains(@for,'sizeCode')]";
    private static final String UK_SIZE_BTN = "//span[@data-size='UK']";
    private static final String EU_SIZE_BTN = "//span[@data-size='EU']";
    private static final String UA_SIZE_BTN = "//span[@data-size='UA']";

    public List<WebElement> sizeBoard() {
        return $$(SIZE_BOARD_ELEMENTS);
    }

    public WebElement ukSizeBtn() {
        return $(UK_SIZE_BTN);
    }

    public WebElement euSizeBtn() {
        return $(EU_SIZE_BTN);
    }

    public WebElement uaSizeBtn() {
        return $(UA_SIZE_BTN);
    }
}
