package Safron.Foxtrot.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CatalogViewElements extends BasePage {
    public CatalogViewElements(WebDriver driver) {
        super(driver);
    }

    private static final String MONITOR = "//main[@id='main-page']//a[contains(@href,'monitory.html')]";

    public WebElement monitor() {
        return $(MONITOR);
    }
}