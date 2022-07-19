package NewBalance.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewBalanceManShoesPageElements extends BasePage {
    public NewBalanceManShoesPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String SLIDER_FIRST = "//*[@id='sl-range']/div/div[3]/div";
    private static final String SLIDER_SECOND = "//*[@id='sl-range']/div/div[2]/div";

    public WebElement sliderFirst() {
        return $(SLIDER_FIRST);
    }

    public WebElement sliderSecond() {
        return $(SLIDER_SECOND);
    }
}
