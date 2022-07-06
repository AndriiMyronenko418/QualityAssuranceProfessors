package AndriiTest;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DeliveryDetailsPage extends BasePage {
    public DeliveryDetailsPage(WebDriver driver) {
        super(driver);
    }

    private static final String INPUT_FIRST_NAME = "//input[@id='first-name']";
    private static final String INPUT_LAST_NAME = "//input[@id='last-name']";
    private static final String INPUT_ADDRESS_1 = "//input[@id='address-1']";
    private static final String INPUT_CITY = "//input[@id='city-name']";
    private static final String INPUT_POST_CODE = "//input[@id='zipcode']";
    private static final String INPUT_PHONE = "//input[@id='phone-1']";
    private static final String INPUT_EMAIL = "//input[@id='email-1']";
    private static final String TERMS_AND_CONDITIONS_CHECKBOX = "//input[contains(@id, 'TermsAndConditions')]";
    private static final String PROCEED_TO_PAYMENT_BTN = "//a[@title='Proceed to Payment']";

    // Test User
    public static final String FIRST_NAME = "Andrii";
    public static final String LAST_NAME = "Brown";
    public static final String ADDRESS_1 = "Javelin street";
    public static final String CITY = "London";
    public static final String POST_CODE = "CF40 1NN";
    public static final String PHONE = "380660001111";
    public static final String EMAIL = "testVans@gmail.com";

    ArrayList<String> testUserInfo = new ArrayList<>();

    public List<String> addingInfo() {
        testUserInfo.add(FIRST_NAME + " " + LAST_NAME);
        testUserInfo.add(ADDRESS_1);
        testUserInfo.add(CITY);
        testUserInfo.add(POST_CODE);
        testUserInfo.add(PHONE);
        testUserInfo.add(EMAIL);
        return testUserInfo;
    }

    public WebElement getInputFirstName() {
        return $(INPUT_FIRST_NAME);
    }

    public WebElement getInputLastName() {
        return $(INPUT_LAST_NAME);
    }

    public WebElement getInputAddress1() {
        return $(INPUT_ADDRESS_1);
    }

    public WebElement getInputCity() {
        return $(INPUT_CITY);
    }

    public WebElement getInputPostCode() {
        return $(INPUT_POST_CODE);
    }

    public WebElement getInputPhone() {
        return $(INPUT_PHONE);
    }

    public WebElement getInputEmail() {
        return $(INPUT_EMAIL);
    }

    public WebElement getTermsAndConditionsCheckbox() {
        return $(TERMS_AND_CONDITIONS_CHECKBOX);
    }

    public WebElement getProceedToPaymentBtn() {
        return $(PROCEED_TO_PAYMENT_BTN);
    }
}
