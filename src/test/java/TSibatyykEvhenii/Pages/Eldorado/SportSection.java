package TSibatyykEvhenii.Pages.Eldorado;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SportSection extends BasePage {

    public SportSection(WebDriver driver) {
        super(driver);
    }

    private static final String CARDS_OF_SPORT_SECTION = "//div[contains(@class,'image')]";

    public List<WebElement> getBinocularsSection(){
        return $$(CARDS_OF_SPORT_SECTION);
    }
}