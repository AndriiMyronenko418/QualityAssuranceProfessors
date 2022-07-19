package Safron.Foxtrot.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FoxtrotSearchResultPageHelper extends FoxtrotSearchResultPageElements {

    public FoxtrotSearchResultPageHelper(WebDriver driver) {
        super(driver);
    }

    public void waitUntilTitleContainsText(String title) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.titleContains(title));
    }

    private String count;

    public String getCount() {
        return this.count;
    }

    public void getCountText(String filterName) {
        waitUntilTitleContainsText(filterName);
        count = productCountMessage().getText().substring(0, 2);
    }

    private String price;

    public String getPrice() {
        return this.price;
    }

    public void getPriceText() {
        price = price().getText();
    }
}