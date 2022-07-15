package AndriiTest.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOnPage extends BasePage {

    public LogOnPage(WebDriver driver) {
        super(driver);
    }

    private static final String ACCOUNT_SIGN_IN_HEADER = "//h2[contains(@class,'myaccount')]";
    private static final String JOIN_VANS_FAMILY_HEADER = "//h3[contains(@class,'loyalty-join')]";

    public WebElement getAccountSignInHeader() {
        return $(ACCOUNT_SIGN_IN_HEADER);
    }

    public WebElement getJoinVansFamilyHeader() {
        return $(JOIN_VANS_FAMILY_HEADER);
    }
}