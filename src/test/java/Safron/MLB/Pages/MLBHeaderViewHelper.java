package Safron.MLB.Pages;

import org.openqa.selenium.WebDriver;

public class MLBHeaderViewHelper extends MLBHeaderViewElements {
    public MLBHeaderViewHelper(WebDriver driver) {
        super(driver);
    }

    public void moveToMen(){
        moveCursor(menCategory());
    }
}
