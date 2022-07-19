package NewBalance.Pages;

import org.openqa.selenium.WebDriver;

public class NewBalanceHeaderViewHelper extends NewBalanceHeaderViewElements {
    public NewBalanceHeaderViewHelper(WebDriver driver) {
        super(driver);
    }

    public void moveToManCatalogBtn() {
        moveCursor(manCatalogBtn());
    }

    public void search(String text) {
        searchField().sendKeys(text);
        searchBtn().click();
    }
}
