package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterSection extends BasePage {

    public FilterSection(WebDriver driver) {
        super(driver);
    }

    private static final String FILTER_CHECKBOX = "//li[contains(@*,'%s')][@*='a-spacing-micro']//div[contains(@*,'checkbox')]";
    private static final String STARS = "//section[contains(@aria-label,'%s')]/i";

    public WebElement getFilterCheckbox(String optionName) {
        return $(String.format(FILTER_CHECKBOX, optionName));
    }

    public WebElement getStarsFilter(String starsAmount) {
        return $(String.format(STARS, starsAmount));
    }
}