package AndriiTest;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String POP_UP_CLOSE = "//button[@class='popup-close']";
    private static final String ALLOW_ALL_COOKIE_BTN = "//div[@id='onetrust-button-group']//button[contains(@id, 'accept')]";
    public static final String MEN_DROPDOWN_BTN = "//a[contains(@id, '1342722')]";
    private static final String MEN_CLASSICS_BTN = "//a[contains(@href, '/men-shoes-classics')]";
    private static final String HEADER_OPTIONS = "//ul[@role='menubar']/li";

    public WebElement getAllowAllCookieBtn() {
        return $(ALLOW_ALL_COOKIE_BTN);
    }

    public WebElement getManClassicsBtn() {
        return $(MEN_CLASSICS_BTN);
    }

    public WebElement getPopUpClose() {
        return $(POP_UP_CLOSE);
    }

    public void getPopUpCloseTryCatch(){
    try {
        getPopUpClose().click();
    } catch (
    TimeoutException e) {
        e.printStackTrace();
    }
    }

    public void moveCursor(String locator) {
        Actions action = new Actions(driver);
        action.moveToElement($(locator)).perform();
    }

    public void moveCursor(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public List<WebElement> getHeaderOptions() {
        return $$(HEADER_OPTIONS);
    }

    ArrayList<String> headerOptionsColor = new ArrayList<>();

    public void getHeaderOptionsColor() {
        for (WebElement element : getHeaderOptions()) {
            moveCursor(element);
            headerOptionsColor.add(element.getCssValue("color"));
        }
    }
}
