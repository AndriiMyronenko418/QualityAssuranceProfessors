package Safron.NewBalanceUa.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewBalanceHeaderViewElements extends BasePage {
    public NewBalanceHeaderViewElements(WebDriver driver) {
        super(driver);
    }
    private static final String MAN_CATALOG_BTN = "//a[contains(text(),'Чоловікам')]";
    private static final String MAN_ALL_SHOES = "//li[@class='nav__arrow']//a[@href='/store/man/vzutta']";

    public WebElement manCatalogBtn(){
        return $(MAN_CATALOG_BTN);
    }

    public WebElement manAllShoesBtn(){
        return $(MAN_ALL_SHOES);
    }

}
