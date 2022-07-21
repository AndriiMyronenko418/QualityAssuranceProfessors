package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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
    private static final String DELIVERY_DONT_CHANGE_BUTTON = "//input[@class='a-button-input']";
    private static final String ALL_MENU_BUTTON = "//span[@class='hm-icon-label']";
    private static final String ARTS_AND_CRAFTS_DEPARTMENT = "//div[text()= 'Arts & Crafts']";
    private static final String PAINTING_DRAWING_ART_SUPPLIES = "//a[text()= 'Painting, Drawing & Art Supplies']";
    private static final String HEADER_SPECIAL_SECTIONS = "//a[@class='nav-a  '][contains(text(),'%s')]";
    private static final String TODAYS_DEALS_OPTIONS = "//span[@class='nav-a-content'][contains(text(),'%s')]";
    private static final String A_ID_OPTION = "//a[contains(@id,'%s')]";
    private static final String SEE_ALL_BTN = "//a[contains(@class,'hmenu-compressed-btn')]";
    private static final String VIDEO_GAME_SECTION = "//a[contains(@data-menu-id,'26')]";
    private static final String VIDEO_GAMES = "(//a[text()='Video Games'])[2]";
    private static final String TEXT = "//*[contains(text(),'%s')]";
    private static final String Pets_Page = "//div[@class='a-cardui-body']//a[@href='/s?k=pet+supplies&s=date-desc-rank&crid=3IF5TSVMY5YRB&qid=1632868254&sprefix=pet+sup%2Caps%2C268&ref=sr_st_date-desc-rank']";


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

    public List<WebElement> seeAllBtn(){
        return $$(SEE_ALL_BTN);
    }

    public WebElement videoGame(){
        return $(VIDEO_GAME_SECTION);
    }

    public WebElement videoGameS(){
        return $(VIDEO_GAMES);
    }

    public WebElement aText(String option){
        return $(String.format(TEXT, option));
    }

    public WebElement getPetButton(){
        return $(Pets_Page);
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