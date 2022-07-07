package AndriiTest;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String ALLOW_ALL_COOKIE_BTN = "//div[@id='onetrust-button-group']//button[contains(@id, 'accept')]";
    public static final String MEN_DROPDOWN_BTN = "//a[contains(@id, '1342722')]";
    private static final String MEN_CLASSICS_BTN = "//a[contains(@href, '/men-shoes-classics')]";

    public WebElement getAllowAllCookieBtn() {
        return $(ALLOW_ALL_COOKIE_BTN);
    }

    public WebElement getManClassicsBtn() {
        return $(MEN_CLASSICS_BTN);
    }

    public WebElement getManDropdownBtn() {
        return $(MEN_DROPDOWN_BTN);
    }

    public void moveCursor(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }
}