package NewBalance.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class NewBalanceKidsPageElements extends BasePage {

    public NewBalanceKidsPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String PINK_FILTER = "//label[@for='colorId5554']";
    private static final String LABEL = "//div[@class='select-label__item']";
    private static final String LABEL_CIRCLE_COLOR = LABEL + "//span[@style]";
    private static final String PRODUCTS = "//a[@class='products__link']";
    private static final String SHOES_BUTTON = "//a[@class='nav__heading'][contains(@href,'/%s/%s')]";
    private static final String SHOES_SIZE_CLASS = "//span[@class='js-inner-content'][text()]";
    private static final String HEADER_SHOES_TEXT = "//h1[@class='catalogue__title catalogue__title_tablet']";

    public WebElement pinkFilter() {
        return $(PINK_FILTER);
    }

    public WebElement labelCircleColor() {
        return $(LABEL_CIRCLE_COLOR);
    }

    public WebElement label() {
        return $(LABEL);
    }

    public List<WebElement> products() {
        return $$(PRODUCTS);
    }

    public WebElement getKidsShoes(String ageOrSex, String kindOfClothes) {
        return ($(String.format(SHOES_BUTTON, ageOrSex, kindOfClothes)));
    }

    public List<WebElement> listOfColourSizes() {
        return $$(SHOES_SIZE_CLASS);
    }

    public WebElement getHeaderShoesText() {
        return $(HEADER_SHOES_TEXT);
    }

    public List<Double> getKidsShoeSizes() {
        List<WebElement> listOfColourSizes = getElementsByVisibility(SHOES_SIZE_CLASS);
        List<String> kidsShoeSizesList = new ArrayList<>();
        List<Double> kidsShoeSizesListDouble = new ArrayList<>();

        for (int i = 0; i < listOfColourSizes.size(); i++) {
            kidsShoeSizesList.add(listOfColourSizes.get(i).getText()
                    .replace(",", "."));
            listOfColourSizes.get(i).getText();
            kidsShoeSizesListDouble.add(Double.parseDouble(kidsShoeSizesList.get(i)));
        }
        return kidsShoeSizesListDouble;
    }

    public Double getSizeFromHeader() {
        String sizeFromHeader = getHeaderShoesText().getText()
                .replace("ВЗУТТЯ ДЛЯ ДІТЕЙ ", "")
                .replace(" РОЗМІРУ", "")
                .replace(",", ".");
        double headerSize = Double.valueOf(sizeFromHeader);
        return headerSize;
    }
}