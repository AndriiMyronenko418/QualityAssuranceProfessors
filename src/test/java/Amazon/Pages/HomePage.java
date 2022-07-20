package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String DELIVERY_DONT_CHANGE_BUTTON = "//input[@class='a-button-input']";
    private static final String ALL_MENU_BUTTON = "//span[@class='hm-icon-label']";
    private static final String ARTS_AND_CRAFTS_DEPARTMENT = "//div[text()= 'Arts & Crafts']";
    private static final String PAINTING_DRAWING_ART_SUPPLIES = "//a[text()= 'Painting, Drawing & Art Supplies']";
    private static final String HEADER_SPECIAL_SECTIONS = "//a[@class='nav-a  '][contains(text(),'%s')]";
    private static final String TODAYS_DEALS_OPTIONS = "//span[@class='nav-a-content'][contains(text(),'%s')]";
    private static final String A_ID_OPTION = "//a[contains(@id,'%s')]";

    public void getDeliveryDontChangeButton() {
        if ($$(DELIVERY_DONT_CHANGE_BUTTON).size() > 0) {
            $$(DELIVERY_DONT_CHANGE_BUTTON).get(0).click();
        }
    }

    public WebElement getAllMenuButton() {
        return $(ALL_MENU_BUTTON);
    }

    public WebElement getArtsAndCraftsDepartmentButton() {
        return $(ARTS_AND_CRAFTS_DEPARTMENT);
    }

    public WebElement getPaintingDrawingAndArtSuppliesBtn() {
        return $(PAINTING_DRAWING_ART_SUPPLIES);
    }

    public WebElement getHeaderSpecialSections(String option) {
        return $(String.format(HEADER_SPECIAL_SECTIONS, option));
    }

    public WebElement getTodaysDealsOption(String option) {
        return $(String.format(TODAYS_DEALS_OPTIONS, option));
    }

    public WebElement aIdOption(String option) {
        return $(String.format(A_ID_OPTION, option));
    }
}