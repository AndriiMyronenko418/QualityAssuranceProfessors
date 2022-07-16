package IraKaminska.Amazon.PagesAmazon;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElectronicsPage extends BasePage {

    public ElectronicsPage(WebDriver driver) {
        super(driver);
    }

    private static final String CELLPHONES_AND_ACCESSORIES = "//span[@dir='auto' and contains(text(), 'Cell Phones & Accessories')]";
    private static final String ACCESSORIES_BUTTON = "//span[@class='a-size-base a-color-base' and contains(text(), 'Accessories')]";
    private static final String HEADPHONES_BUTTON = "//span[@class='a-size-base a-color-base' and text()= 'Headphones']";
    private static final String EARBUD_HEADPHONES_BUTTON = "//span[text()= 'Earbud Headphones']";
    private static final String SCULLCANDY_BRAND_BUTTON = "//span[@class='a-size-base a-color-base' and text()= 'Skullcandy']";
    private static final String HIGHEST_AVERAGE_CUSTOMER_REVIEW = "//i[@class='a-icon a-icon-star-medium a-star-medium-4']";
    private static final String EARBUD_CKULLCANDY = "//span[text()= 'Skullcandy Sesh Evo True Wireless In-Ear Earbud - True Black']";
    private static final String COLOUR_OF_EARBUD = "//img[@alt='Pure Mint']";
    private static final String QUANTITY_BUTTON = "//span[@class='a-dropdown-label']";
    private static final String TWO_EARBUD_SKULLCANDY = "//li[@aria-labelledby='quantity_1']";
    private static final String ADD_TO_CART = "//input[@id='add-to-cart-button']";
    private static final String CART_BUTTON = "//form[@id='attach-view-cart-button-form']";
    private static final String CART_HEADER = "//div[@class='a-row sc-cart-header sc-compact-bottom']";

    public WebElement getCellPhonesAndAccessoriesButton() {
        return $(CELLPHONES_AND_ACCESSORIES);
    }

    public WebElement getAccessoriesButton() {
        return $(ACCESSORIES_BUTTON);
    }

    public WebElement getHeadphonesButton() {
        return $(HEADPHONES_BUTTON);
    }

    public WebElement getEarbudHeadphonesButton() {
        return $(EARBUD_HEADPHONES_BUTTON);
    }

    public WebElement getScullcandyBrandButton() {
        return $(SCULLCANDY_BRAND_BUTTON);
    }

    public WebElement getHighestAverageCustomerReviewBunnon() {
        return $(HIGHEST_AVERAGE_CUSTOMER_REVIEW);
    }

    public WebElement getEarbudScullcandy() {
        return $(EARBUD_CKULLCANDY);
    }

    public WebElement getColourOfEarbud() {
        return $(COLOUR_OF_EARBUD);
    }

    public WebElement getQuantityButton() {
        return $(QUANTITY_BUTTON);
    }

    public WebElement getTwoEarbudSkullcandy() {
        return $(TWO_EARBUD_SKULLCANDY);
    }

    public WebElement getAddToCartButton() {
        return $(ADD_TO_CART);
    }

    public WebElement getCartButton() {
        return $(CART_BUTTON);
    }

    public WebElement checkCart() {
        return $(CART_HEADER);
    }
}