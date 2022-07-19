package IraKaminska.Amazon.PagesAmazon;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistryPageAmazon extends BasePage {

    public RegistryPageAmazon(WebDriver driver) {
        super(driver);
    }

    private static final String WEDDING_REGISTRY = "//div[contains(text(), 'Wedding Registry')]";
    private static final String BABY_REGISTRY = "//a[@href='/baby-reg?ref_=gr-landing']";
    private static final String BIRTHDAY_REGISTRY = "//a[@href='/registries/birthday?ref_=gr-landing']";
    private static final String CUSTOM_GIFT_LIST = "//a[@href='/registries/custom?ref_=gr-landing']";
    private static final String HOLIDAY_GIFT_LIST = "//a[@href='/registries/holiday?ref_=gr-landing']";
    private static final String FIND_A_REGISTRY = "//div[@class='gr-header gr-header--xxsm gr-find-stripe__header aok-inline-block']";

    public WebElement getWeddingRegistryButton() {
        return $(WEDDING_REGISTRY);
    }

    public WebElement getBabyRegistryButton() {
        return $(BABY_REGISTRY);
    }

    public WebElement getBirthdayRegistryButton() {
        return $(BIRTHDAY_REGISTRY);
    }

    public WebElement getCustomGiftListButton() {
        return $(CUSTOM_GIFT_LIST);
    }

    public WebElement getHolidayGiftList() {
        return $(HOLIDAY_GIFT_LIST);
    }

    public WebElement checkRegistryPage() {
        return $(FIND_A_REGISTRY);
    }
}