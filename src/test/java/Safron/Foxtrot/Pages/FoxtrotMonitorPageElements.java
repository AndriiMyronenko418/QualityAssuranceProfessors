package Safron.Foxtrot.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FoxtrotMonitorPageElements extends BasePage {
    public FoxtrotMonitorPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String SAMSUNG_FILTER = "//div[@class='listing__sidebar-col']//a[contains(@href,'samsung.html')]//label[@class='brand ']";
    private static final String OK = "//input[@value='OK']";
    private static final String MONITORS = "//div[@class='listing__body-wrap image-switch']//a[@class='card__title']";

    public WebElement filterBtnSamsung() {
        return $(SAMSUNG_FILTER);
    }

    public WebElement okBtn() {
        return $(OK);
    }

    public List<WebElement> monitors() {
        return $$(MONITORS);
    }
}