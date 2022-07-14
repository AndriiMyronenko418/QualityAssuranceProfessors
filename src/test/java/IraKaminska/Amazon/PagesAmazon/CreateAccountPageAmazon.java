package IraKaminska.Amazon.PagesAmazon;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CreateAccountPageAmazon extends BasePage {

    public CreateAccountPageAmazon(WebDriver driver) {
        super(driver);
    }

    private static final String INPUT_FIRST_AND_LAST_NAME = "//input[@id='ap_customer_name']";
    private static final String INPUT_MOBILE_NUMBER_OR_EMAIL = "//input[@id='ap_email']";
    private static final String INPUT_PASSWORD ="//input[@class='a-input-text a-span12 auth-required-field auth-require-fields-match auth-require-password-validation']";
    private static final String INPUT_REENTER_PASSWORD = "//input[@name='passwordCheck']";
    private static final String CONTINUE_BUTTON = "//input[@id='continue']";
    private static final String PUZZLE_SOLVE_PAGE = "//span[@class='a-size-large']";

    public static final String FIRST_AND_LAST_NAME = "Iryna Kaminska";
    public static final String MOBILE_NUMBER_OR_EMAIL = "i.pushkarchuk@lntu.edu.ua";
    public static final String PASSWORD = "12345Kim";
    public static final String REENTER_PASSWORD = "12345Kim";

    public WebElement getSignUpInput(String option) {
        return $(String.format(INPUT_FIRST_AND_LAST_NAME, option));
    }

    public WebElement getMobileNumberOrEmail() {
        return $(INPUT_MOBILE_NUMBER_OR_EMAIL);
    }

    public WebElement getPasswordInput() {
        return $(INPUT_PASSWORD);
    }

    public WebElement getReenterPassword() {
        return $(INPUT_REENTER_PASSWORD);
    }

    public WebElement getContinueButton() {
        return $(CONTINUE_BUTTON);
    }

    public WebElement checkNewPazzlePage() {
        return $(PUZZLE_SOLVE_PAGE);
    }
}