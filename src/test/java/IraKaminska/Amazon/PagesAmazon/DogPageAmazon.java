package IraKaminska.Amazon.PagesAmazon;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DogPageAmazon extends BasePage {

    public DogPageAmazon(WebDriver driver) {
        super(driver);
    }

    private static final String DOG_FOOD_BUTTON = "//span[text()= 'Food']";
    private static final String DRY_DOG_FOOD_BUTTON = "//span[text()= 'Dry']";
    private static final String THE_HIGHEST_CUSTOMER_REVIEW_FOOD = "//i[@class='a-icon a-icon-star-medium a-star-medium-4']";
    private static final String ROYAL_CANIN_BRAND_BUTTON = "//span[text()= 'Royal Canin']";
    private static final String ROYAL_CANIN_FOR_ADULT_DOGS = "//span[text()= 'Adult']";
    private static final String VEGETABLE_FLAVOR_ROYAL_CANIN = "//span[text()= 'Vegetable']";
    private static final String PRODUCT = "//span[@class='a-size-base-plus a-color-base a-text-normal' and text()= 'Royal Canin Size Health Nutrition Medium Adult Dry Dog Food']";
    private static final String GET_SIZE_OF_PRODUCT = "//button[@id='a-autoid-12-announce']";
    private static final String AVAILABILITY_OF_PRODUCT = "//span[@class='a-size-medium a-color-price']";

    public WebElement getDogFoodButton() {
        return $(DOG_FOOD_BUTTON);
    }

    public WebElement getDryDogFoodButton() {
        return $(DRY_DOG_FOOD_BUTTON);
    }

    public WebElement getRoyalCaninBrandButton() {
        return $(ROYAL_CANIN_BRAND_BUTTON);
    }

    public WebElement getRoyalCaninForAdultDogs() {
        return $(ROYAL_CANIN_FOR_ADULT_DOGS);
    }

    public WebElement getVegetableFlavorRoyalCanin() {
        return $(VEGETABLE_FLAVOR_ROYAL_CANIN);
    }

    public WebElement getTheHighestCustomerReview() {
        return $(THE_HIGHEST_CUSTOMER_REVIEW_FOOD);
    }

    public WebElement getProdukt() {
        return $(PRODUCT);
    }

    public WebElement getSizeOfPackofProduct() {
        return $(GET_SIZE_OF_PRODUCT);
    }

    public WebElement checkAvailabilityOfProduct() {
        return $(AVAILABILITY_OF_PRODUCT);
    }
}