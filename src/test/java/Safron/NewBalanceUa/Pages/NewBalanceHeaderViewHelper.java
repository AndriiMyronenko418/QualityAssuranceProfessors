package Safron.NewBalanceUa.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NewBalanceHeaderViewHelper extends NewBalanceHeaderViewElements {
    public NewBalanceHeaderViewHelper(WebDriver driver) {
        super(driver);
    }

    public void moveToManCatalogBtn() {
        moveCursor(manCatalogBtn());
    }
}
