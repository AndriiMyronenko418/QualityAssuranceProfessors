package AndriiTest.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailUsPage extends BasePage {

    public EmailUsPage(WebDriver driver) {
        super(driver);
    }

    private static final String CONTACT_HEADER = "//div[@class='garnish-wrapper ']//h2";
    private static final String EMAIL_HEADER = "//div[@class='text-center']//h3";

    public WebElement getContactHeader() {
        return $(CONTACT_HEADER);
    }

    public WebElement getEmailHeader() {
        return $(EMAIL_HEADER);
    }
}