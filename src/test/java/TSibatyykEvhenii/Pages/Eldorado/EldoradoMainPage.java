package TSibatyykEvhenii.Pages.Eldorado;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EldoradoMainPage extends BasePage {

    public EldoradoMainPage(WebDriver driver) {
        super(driver);
    }

    private static final String MAIN_MENU_BTN = "//ul[contains(@class,'ul-table-not-active')]";
    private static final String SPORT_SECTION = "//a[contains(@href,'c1218544')]";

    public WebElement goToMenuBtn(){
        return moveTo(MAIN_MENU_BTN);
    }

    public List<WebElement> sportSectionBtn(){
        return $$(SPORT_SECTION);
    }
}