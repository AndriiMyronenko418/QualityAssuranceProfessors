package TSibatyykEvhenii.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class RetroMagazRegistrationPage extends BasePage {

    public RetroMagazRegistrationPage(WebDriver driver) {
        super(driver);
    }

    private static final String INPUT_FIELD_NAME = "//input[contains(@id,'registration_name')]";
    private static final String INPUT_FIELD_SURENAME = "//input[contains(@id,'registration_surname')]";
    private static final String INPUT_FIELD_TEL_NUMBER = "//input[contains(@id,'registration_tel')]";
    private static final String INPUT_FIELD_EMAIL = "//input[contains(@id,'registration_email')]";
    private static final String INPUT_FIELD_PASS = "//input[contains(@id,'registration_pass')]";
    private static final String AGREE_CHECKBOX = "//label[contains(@for,'reg_agree2')]";

    public List<WebElement> setNameRegistration(){return $$(INPUT_FIELD_NAME);}

    public List<WebElement> setSurenameRegistration(){return $$(INPUT_FIELD_SURENAME);}

    public List<WebElement> setTelNumberRegistration(){return $$(INPUT_FIELD_TEL_NUMBER);}

    public List<WebElement> setEmailRegistration(){return $$(INPUT_FIELD_EMAIL);}

    public List<WebElement> setPasRegistration(){return $$(INPUT_FIELD_PASS);}

    public List<WebElement> getAgreeCheckbox(){return $$(AGREE_CHECKBOX);}

    public void assertUrl(){
        String expectedUrl = "https://retromagaz.com/checkout";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        System.out.println("Assert accept");
    }
}
