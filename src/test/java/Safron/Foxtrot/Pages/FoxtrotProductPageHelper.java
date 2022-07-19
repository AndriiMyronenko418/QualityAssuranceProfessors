package Safron.Foxtrot.Pages;

import org.openqa.selenium.WebDriver;

public class FoxtrotProductPageHelper extends FoxtrotProductPageElements {
    public FoxtrotProductPageHelper(WebDriver driver) {
        super(driver);
    }

    private String price;

    public String getPrice() {
        return this.price;
    }

    public void getPriceText() {
        price = price().getText();
    }
}