package TSibatyykEvhenii.Pages.Hotline;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HouseHoldSection extends BasePage {

    public HouseHoldSection(WebDriver driver) {
        super(driver);
    }

    private static final String CONDITIONS_BTN = "(//div[contains(@class,'section-navigation__item')])[23]";

    public WebElement conditionsBtn(){
        return $(CONDITIONS_BTN);
    }
}
