package TSibatyykEvhenii.Pages.Hotline;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementPage extends BasePage{

    public ElementPage(WebDriver driver) {
        super(driver);
    }

    private static final String TITLE_OF_ELEMENT = "//h1[contains(@class,'title__main')]";

    public WebElement titleOfElement(){
        return $(TITLE_OF_ELEMENT);
    }
}
