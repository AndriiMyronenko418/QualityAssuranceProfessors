package Safron.Hotline.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HotlineHeaderViewElements extends BasePage {

    public HotlineHeaderViewElements(WebDriver driver) {
        super(driver);
    }

    private static final String LOCATION_BTN = "//span[@class='city-name ellipsis']";
    private static final String LOCATION_BTN_KYIV = "//span[contains(text(),'Київ')]";
    private static final String LANGUAGE_BTN_RU = "//header//span[@data-language='ru']";
    private static final String LANGUAGE_BTN_UK = "//header//span[@data-language='uk']";
    private static final String RIGHT_HEADER_BTNS = "//div[@class='dropdown dropdown-pull-right']";

    public WebElement locationBtn() {
        return $(LOCATION_BTN);
    }

    public WebElement locationBtnKyiv() {
        return $(LOCATION_BTN_KYIV);
    }

    public WebElement languageHeaderBtnRu() {
        return $(LANGUAGE_BTN_RU);
    }

    public WebElement languageHeaderBtnUk() {
        return $(LANGUAGE_BTN_UK);
    }

    public List<WebElement> rightSideHeaderButtons() {
        return $$(RIGHT_HEADER_BTNS);
    }
<<<<<<< HEAD
}

<<<<<<< HEAD
=======


>>>>>>> master
=======
}
>>>>>>> 10b6de52bbace95655b96db6e06d257466b70802
