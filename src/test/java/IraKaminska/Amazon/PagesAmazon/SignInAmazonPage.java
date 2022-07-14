package IraKaminska.Amazon.PagesAmazon;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInAmazonPage extends BasePage {

    public SignInAmazonPage(WebDriver driver) {
        super(driver);
    }

    private static final String CREATE_AMAZON_ACCOUNT = "//a[@id='createAccountSubmit']";

    public WebElement getCreateAmazonAccountButton() {
        return $(CREATE_AMAZON_ACCOUNT);
    }
}