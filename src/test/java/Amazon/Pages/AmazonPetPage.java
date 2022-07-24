package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPetPage extends BasePage {
    public AmazonPetPage(WebDriver driver) {
        super(driver);
    }

    private static final String MoreFilters = "//div[@id='brandsRefinements']//span[@class='a-expander-prompt']";
    private static final String ASSERTFILTER = "//li[contains(@id,'%s')]";
    private static final String ITEMCHOSE = "//div[contains(@data-index,'%s')]//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']";
    private static final String NAMTEITEMCHOSE = "//tr[@class='a-spacing-small po-brand']//span[@class='a-size-base']";
    private static final String PRODUCTCHOSE = "//div[@data-asin='B0B755G6KP']";
    private static final String PRICE = "//div[@data-asin='B0B755G6KP']//span[@class='a-price-whole']";
    private static final String PRICENEXT = "//div[@class='a-section a-spacing-none aok-align-center']//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']";
    private static final String ADDCARTITEM = "//input[@id='add-to-cart-button']";
    private static final String CART = "//a[@class='nav-a nav-a-2 nav-progressive-attribute']";
    private static final String NAMECARTPRODUCT = "//div[@data-item-index='%s']//span[@class='a-truncate-cut']";
    private static final String NAMEPRODUCT = "//span[@id='productTitle']";

    public WebElement getSeeMoreButtonFilters() {
        return $(MoreFilters);
    }

    public WebElement filterBrandName(String option) {
        return $(String.format(ASSERTFILTER, option));
    }

    public WebElement getChosenButtonItems(String option) {
        return $(String.format(ITEMCHOSE, option));
    }

    public WebElement brandNameChosenItems() {
        return $(NAMTEITEMCHOSE);
    }

    public WebElement clickChosenProduct() {
        return $(PRODUCTCHOSE);
    }

    public WebElement priceProductMainPage() {
        return $(PRICE);
    }

    public WebElement priceOnChosenProductPage() {
        return $(PRICENEXT);
    }

    public WebElement getAddOnCartProduct() {
        return $(ADDCARTITEM);
    }

    public WebElement getOpenButtonCart() {
        return $(CART);
    }

    public WebElement verifyNameCartProducts(String option) {
        return $(String.format(NAMECARTPRODUCT, option));
    }

    public WebElement nameOnChosenProductPage() {
        return $(NAMEPRODUCT);
    }
}
