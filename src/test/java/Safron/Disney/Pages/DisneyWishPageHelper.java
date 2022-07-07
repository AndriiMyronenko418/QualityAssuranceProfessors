package Safron.Disney.Pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

public class DisneyWishPageHelper extends DisneyWishPageElements {
    public DisneyWishPageHelper(WebDriver driver) {
        super(driver);
    }

    String textProductNameWish;

    public void setTextProductNameWish() {
        textProductNameWish = productNameWish().getText();
    }

    public String getTextProductNameWish() {
        return this.textProductNameWish;
    }

    String textProductPriceWish;

    public void setTextProductPriceWish() {
        textProductPriceWish = productPriceWish().getText();
    }

    public String getTextProductPriceWish() {
        return this.textProductPriceWish;
    }

}
