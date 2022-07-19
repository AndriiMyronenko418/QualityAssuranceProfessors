package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    private static final String INPUT_ID = "//input[contains(@id,'%s')]";
    private static final String INSCRIPTION_AFTER_REGISTRATION = "(//h4[contains(@class,'a-alert-heading')])[2]";

    public WebElement inputIdOption(String option){
        return $(String.format(INPUT_ID, option));
    }

    public WebElement inscriptionAfterRegistration(){
        return $(INSCRIPTION_AFTER_REGISTRATION);
    }
}
