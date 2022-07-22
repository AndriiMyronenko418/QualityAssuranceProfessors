package NewBalance.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewBalanceLogInAndRegistrationPage extends BasePage {

    public NewBalanceLogInAndRegistrationPage(WebDriver driver) {
        super(driver);
    }

    private static final String REGISTRATION_BTN = "//a[text()='Зареєструватись']";
    private static final String EMAIL_FIELD = "//input[@id='signupform-email']";
    private static final String PHONE_NUMBER_FIELD = "//input[@id='signupform-phone']";
    private static final String PASSWORD_FIELD = "//input[@id='signupform-password']";
    private static final String PASSWORD_CONFIRM_FIELD = "//input[@id='signupform-passwordconfirm']";
    private static final String WANT_RECEIVE_MESSAGES_TICK = "//span[contains(text(),'надходження, знижки та акції')]";
    private static final String WANT_RECEIVE_RECOMMENDATIONS_TICK = "//span[contains(text(),'отримувати рекомендації')]";
    private static final String CONFIRM_REGISTRATION_BTN = "//button[text()='Зареєструватись']";
    private static final String INVALID_EMAIL_MESSAGE = "//p[text()='Неприпустимий Email']";
    private static final String FILL_THE_FIELD_MESSAGE = "//p[text()='Заповніть поле']";
    private static final String SHORT_PASSWORD = "//p[contains(text(),'мінімум 6 символів')]";
    private static final String PASSWORDS_NOT_SAME = "//p[contains(text(),'не співпадають')]";
    private static final String FIELD_FOR_EMAIL_IN_LOGIN = "//input[@name='LoginForm[email]']";
    private static final String FIELD_FOR_PASSWORD_IN_LOGIN = "//input[@name='LoginForm[password]']";
    private static final String LOGIN_BUTTON = "//button[text()='Увійти']";

    public WebElement getRegistrationBtn() {
        return $(REGISTRATION_BTN);
    }

    public WebElement regEmailField() {
        return $(EMAIL_FIELD);
    }

    public WebElement regPhoneNumberField() {
        return $(PHONE_NUMBER_FIELD);
    }

    public WebElement regPasswordField() {
        return $(PASSWORD_FIELD);
    }

    public WebElement regPasswordConfirmField() {
        return $(PASSWORD_CONFIRM_FIELD);
    }

    public WebElement regTickWantReceiveMessages() {
        return $(WANT_RECEIVE_MESSAGES_TICK);
    }

    public WebElement regTickWantReceiveRecommendations() {
        return $(WANT_RECEIVE_RECOMMENDATIONS_TICK);
    }

    public WebElement confirmRegistration() {
        return $(CONFIRM_REGISTRATION_BTN);
    }

    public WebElement invalidEmailMessege() {
        return $(INVALID_EMAIL_MESSAGE);
    }

    public WebElement fillInTheField() {
        return $(FILL_THE_FIELD_MESSAGE);
    }

    public WebElement shortPasswordMessage() {
        return $(SHORT_PASSWORD);
    }

    public WebElement passwordsNotSameMessage() {
        return $(PASSWORDS_NOT_SAME);
    }

    public WebElement lineForEmailInLogin() {
        return $(FIELD_FOR_EMAIL_IN_LOGIN);
    }

    public WebElement lineForPasswordInLogin() {
        return $(FIELD_FOR_PASSWORD_IN_LOGIN);
    }

    public WebElement getLoginButton() {
        return $(LOGIN_BUTTON);
    }
}