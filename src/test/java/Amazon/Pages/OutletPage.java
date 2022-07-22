package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OutletPage extends BasePage {

    public OutletPage(WebDriver driver) {
        super(driver);
    }

    private static final String TOP_CATEGORY_BTNS = "//a[contains(@class,'button')][contains(@title,'%s')]";
    private static final String SHOP_BY_CATEGORY_BTNS = "//img[@alt='%s']";

    public WebElement getShopByCategoryOptionBtn(String categoryName) {
        return $(String.format(SHOP_BY_CATEGORY_BTNS, categoryName));
    }

    public WebElement getTopCategoryBtn(String option) {
        return $(String.format(TOP_CATEGORY_BTNS, option));
    }
}