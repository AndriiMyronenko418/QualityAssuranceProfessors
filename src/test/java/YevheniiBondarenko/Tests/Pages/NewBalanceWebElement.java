package YevheniiBondarenko.Tests.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewBalanceWebElement extends BasePage {
    public NewBalanceWebElement(WebDriver driver) {
        super(driver);
    }
    public static final String ENTER_REGISTRATION_BTN = "//span[@class='auth__text']";
    public static final String REGISTRATION_BUTTON ="//a[@class='nb-popup__link nb-popup-register-link']";
    public static final String INPUT_IMEIL_PASSWORD_FIELD ="//input[@class='custom-input custom-input_full']";
    public static final String INPUT_NUMBER = "//input[@id='signupform-phone']";
    public static final String PASSWORD_FIELD = "//input[@id='signupform-password']";
    public static final String CONFIRM_PASSWORD = "//input[@id='signupform-passwordconfirm']";
    public static final String SIGN_UP_BTN = "//button[@name='signup-button']";




    public List<WebElement> enterRegistrationBtn(){return $$(ENTER_REGISTRATION_BTN);}
    public WebElement registrationBtn(){return $(REGISTRATION_BUTTON);}
    public List<WebElement> inputMailAndPassword(){return $$(INPUT_IMEIL_PASSWORD_FIELD);}
    public WebElement inputNumber(){return $(INPUT_NUMBER);}
    public WebElement passwordField(){return $(PASSWORD_FIELD);}
    public WebElement confirmPassword(){return $(CONFIRM_PASSWORD);}
    public WebElement signUpButton(){return $(SIGN_UP_BTN);}

}
