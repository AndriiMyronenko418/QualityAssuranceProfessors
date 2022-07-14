package Safron.Foxtrot.Pages;

import org.openqa.selenium.WebDriver;

public class FoxtrotHomePageHelper extends FoxtrotHomePageElements {
    public FoxtrotHomePageHelper(WebDriver driver) {
        super(driver);
    }

    public void moveToPС() {
        moveCursor(pсCategory());
    }
}