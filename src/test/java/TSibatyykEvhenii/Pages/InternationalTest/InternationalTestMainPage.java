package TSibatyykEvhenii.Pages.InternationalTest;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InternationalTestMainPage extends BasePage {

    public InternationalTestMainPage(WebDriver driver) {
        super(driver);
    }

    private static final String LANGUAGE_BTN = "//a[contains(@role,'button')]";
    private static final String START_TEST_BTN = "//a[contains(text(),'Почати тест')]";

    public WebElement getLenguageBtn(){
        return $(LANGUAGE_BTN);
    }
    public WebElement startTestBtn(){
        return $(START_TEST_BTN);
    }
}
