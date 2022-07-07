package AndriiTest;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenShoesClassicsPage extends BasePage {
    public MenShoesClassicsPage(WebDriver driver) {
        super(driver);
    }

    private static final String SK8_HI_BLACK_WHITE_SHOES = "//div[@data-part-number='VN000D5IB8C']";

    public WebElement getSk8HiBlackWhiteShoes() {
        return $(SK8_HI_BLACK_WHITE_SHOES);
    }

}
