package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String DELIVER_DONT_CHANGE_BUTTON = "//input[@class='a-button-input']";
    private static final String ALL_MENU_BUTTON = "//a[@id='nav-hamburger-menu']";
    private static final String ARTS_AND_CRAFTS_DEPARTMENT = "//div[text()= 'Arts & Crafts']";
    private static final String PAINTING_DRAWING_ART_SUPPLIES = "//a[text()= 'Painting, Drawing & Art Supplies']";
    private static final String COMPUTERS_DEPARTMENT = "//a[@data-menu-id='6']";
    private static final String COMPUTERS_TABLETS_DEPARTMENT = "//a[text()='Computers & Tablets']";
    private static final String DELIVER_TO_BUTTON = "//a[@id='nav-global-location-popover-link']";
    private static final String COUNTRIES_DROPDOWN_LIST = "//span[@id='GLUXCountryListDropdown']";
    private static final String CANADA_DELIVER = "//a[@id='GLUXCountryList_45']";
    private static final String DONE_CHOOSE_LOCATION = "//button[@name='glowDoneButton']";

    public void getDeliverDontChangeButton() {
        if ($$(DELIVER_DONT_CHANGE_BUTTON).size() > 0) {
            $$(DELIVER_DONT_CHANGE_BUTTON).get(0).click();
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

    private static final String HEADER_SPECIAL_SECTIONS = "//a[@class='nav-a  '][contains(text(),'%s')]";
    private static final String TODAYS_DEALS_OPTIONS = "//span[@class='nav-a-content'][contains(text(),'%s')]";
    private static final String DELIVERY_DONT_CHANGE_BTN = "//*[@class='a-button-inner']/*[@class='a-button-input']";
    private static final String A_ID_OPTION = "//a[contains(@id,'%s')]";

    public WebElement getDeliveryDontChangeBtn() {
        return $(DELIVERY_DONT_CHANGE_BTN);
    }

    public WebElement getHeaderSpecialSections(String option) {
        return $(String.format(HEADER_SPECIAL_SECTIONS, option));
    }

    public WebElement getTodaysDealsOption(String option) {
        return $(String.format(TODAYS_DEALS_OPTIONS, option));
    }

    public WebElement aIdOption(String option){
        return $(String.format(A_ID_OPTION, option));
    }

    public WebElement getComputersDepartmentButton() {
        return $(COMPUTERS_DEPARTMENT);
    }

    public WebElement getComputersAndTabletsButton() {
        return $(COMPUTERS_TABLETS_DEPARTMENT);
    }

    public WebElement getDeliverToButton() {
        return $(DELIVER_TO_BUTTON);
    }

    public WebElement getCountriesListDropdawn() {
        return $(COUNTRIES_DROPDOWN_LIST);
    }

    public WebElement getCanadaFromListDropdawn() {
        return $$(CANADA_DELIVER).get(0);
    }

    public WebElement getDoneOfChooseYourLocationButton() {
        return $(DONE_CHOOSE_LOCATION);
    }
}