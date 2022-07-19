package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String A_ID_OPTION = "//a[contains(@id,'%s')]";

    public WebElement aIdOption(String option){
        return $(String.format(A_ID_OPTION, option));
    }
}