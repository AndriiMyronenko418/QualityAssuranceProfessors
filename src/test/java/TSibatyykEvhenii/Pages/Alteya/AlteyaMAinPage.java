package TSibatyykEvhenii.Pages.Alteya;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlteyaMAinPage extends BasePage {

    public AlteyaMAinPage(WebDriver driver) {
        super(driver);
    }

    private static final String PHARMACY = "(//a[contains(text(),'Аптека')])[1]";
    private static final String UKRAINIAN_LANGUAGE = "(//a[contains(text(),'UA')])[1]";
    private static final String INTERNET_PHARMACY = "(//a[contains(@href,'internet-apteka')])[1]";

    public WebElement pharmacyBtn(){
        return moveTo(PHARMACY);
    }

    public WebElement ukrainianLanguageBtn(){
        return $(UKRAINIAN_LANGUAGE);
    }

    public WebElement internetPharmacyBtn(){
        return $(INTERNET_PHARMACY);
    }
}