package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class PaintingDrawingArtSuppliesPage extends BasePage {

    public PaintingDrawingArtSuppliesPage(WebDriver driver) {
        super(driver);
    }

    private static final String ART_PAPER_DEPARTMENT = "//span[text()= 'Art Paper']";
    private static final String BOARDS_CANVAS_DEPARTMENT = "//span[text()= 'Boards & Canvas']";
    private static final String DRAWING_DEPARTMENT = "//span[text()= 'Drawing']";
    private static final String EASELS_DEPARTMENT = "//span[text()= 'Easels']";
    private static final String PAINTING_DEPARTMENT = "//span[text()= 'Painting']";
    private static final String BRUSH_PEN_CLEANERS = "//span[text()= 'Brush & Pen Cleaners']";
    private static final String DROPDOWN_DESCRIPTION = "//div[@class='nav-search-scope nav-sprite']";
    private static final String DRAWING_FILTER = "//span[@class='a-size-base a-color-base'][contains(text(), '%s')]";
    private static final String SORT_BY_BUTTON = "//span[@class='a-button-text a-declarative']";
    private static final String SORT_BY_AVERAGE_CUSTOMER_REVIEW = "//a[@id='s-result-sort-select_3']";
    private static final String ROYAL_ART_SET_STARS = "//i[@class='a-icon a-icon-star-small a-star-small-4-5 aok-align-bottom']";
    private static final String CHOOSEN_PRODUCT = "//span[@class='a-size-base-plus a-color-base a-text-normal'][contains(text(), '%s')]";
    private static final String SEE_ALL_BUYING_OPTIONS_BUTTON = "//span[@id='buybox-see-all-buying-choices']";
    private static final String ADD_TO_CART_BUTTON = "//input[@name='submit.addToCart']";
    private static final String VIEW_CART_BUTTON = "//span[@class='a-button a-button-base aod-view-cart-btn']";
    private static final String SHOPPING_CART_AMOUNT = "//span[@id='sc-subtotal-amount-activecart']";
    private static final String CHECK_SUBTOTAL_AMOUNT = "//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']";

    public WebElement getArtPaperDepartmentBtn() {
        return $(ART_PAPER_DEPARTMENT);
    }

    public WebElement getBoardsCanvasDepartmentBtn() {
        return $(BOARDS_CANVAS_DEPARTMENT);
    }

    public WebElement getDrawingDepartmentBtn() {
        return $(DRAWING_DEPARTMENT);
    }

    public WebElement getEaselsDepartmentBtn() {
        return $(EASELS_DEPARTMENT);
    }

    public WebElement getPaintingDepartmentsBtn() {
        return $(PAINTING_DEPARTMENT);
    }

    public WebElement getBrushPenCleaners() {
        return $(BRUSH_PEN_CLEANERS);
    }

    public boolean checkURLPaintingDrawingPage() {
        return driver.getCurrentUrl().contains("painting_drawing_supplies");
    }

    public WebElement getDropdownDescription() {
        return $(DROPDOWN_DESCRIPTION);
    }

    public boolean checkUrlArtPaper() {
        return driver.getCurrentUrl().contains("sr_nr_n_1");
    }

    public boolean checkUrlBoardsCanvas() {
        return driver.getCurrentUrl().contains("sr_nr_n_2");
    }

    public boolean checkUrlDrawing() {
        return driver.getCurrentUrl().contains("sr_nr_n_3");
    }

    public boolean checkUrlEasels() {
        return driver.getCurrentUrl().contains("sr_nr_n_4");
    }

    public boolean checkUrlPainting() {
        return driver.getCurrentUrl().contains("sr_nr_n_5");
    }

    public boolean checkUrlBrushAndPenCleaners() {
        return driver.getCurrentUrl().contains("sr_nr_n_6");
    }

    public WebElement getFilterDrawingCheckbox(String drawing_options) {
        return $(String.format(DRAWING_FILTER, drawing_options));
    }

    public WebElement getSotrByButton() {
        return $(SORT_BY_BUTTON);
    }

    public WebElement getSortByAverageCustomerReview() {
        return $$(SORT_BY_AVERAGE_CUSTOMER_REVIEW).get(0);
    }

    public List<Double> getRoyalArtSetsStars() {
        List<WebElement> royalArtSetsStars = getElementsByVisibility(ROYAL_ART_SET_STARS);
        List<String> productNumberOfStars = new ArrayList<>();
        List<Double> productNumberOfStarsDouble = new ArrayList<>();

        for (int i = 0; i < royalArtSetsStars.size(); i++) {
            productNumberOfStars.add(royalArtSetsStars.get(i).getAttribute("class")
                    .replace("-", ".")
                    .replace("a.icon a.icon.star.small a.star.small.", "")
                    .replace(" aok.align.bottom", ""));
            productNumberOfStarsDouble.add(Double.parseDouble(productNumberOfStars.get(i)));
        }
        return productNumberOfStarsDouble;
    }

    public WebElement getChoosenArtSet(String choosen_product) {
        return $(String.format(CHOOSEN_PRODUCT, choosen_product));
    }

    public WebElement getSeeAllBuyingOptionsBtn() {
        return $(SEE_ALL_BUYING_OPTIONS_BUTTON);
    }

    public WebElement getAddToCartButton() {
        return $(ADD_TO_CART_BUTTON);
    }

    public WebElement getViewCartButton() {
        return $(VIEW_CART_BUTTON);
    }

    public WebElement checkShoppingCart() {
        return $(SHOPPING_CART_AMOUNT);
    }

    public WebElement checkOrderAmount() {
        return $$(CHECK_SUBTOTAL_AMOUNT).get(1);
    }
}