package TSibatyykEvhenii.Pages.Alteya;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DentistPage extends BasePage {

    public DentistPage(WebDriver driver) {
        super(driver);
    }

    private static final String PROSTHESIS = "//div[contains(@class,'t668__header')]";

    public List<WebElement> prosthesis(){
        return $$(PROSTHESIS);
    }
}