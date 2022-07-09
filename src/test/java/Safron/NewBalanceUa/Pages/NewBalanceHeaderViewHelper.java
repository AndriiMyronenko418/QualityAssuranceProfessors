package Safron.NewBalanceUa.Pages;

import org.openqa.selenium.WebDriver;

public class NewBalanceHeaderViewHelper extends NewBalanceHeaderViewElements {
    public NewBalanceHeaderViewHelper(WebDriver driver) {
        super(driver);
    }

    public void moveToManCatalogBtn() {
        moveCursor(manCatalogBtn());
    }
}
