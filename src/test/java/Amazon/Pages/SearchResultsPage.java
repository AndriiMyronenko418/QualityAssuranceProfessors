package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    private static final String PRODUCT_CONTAINER = "//div[@data-index]/div[@class='sg-col-inner']";
    private static final String PRODUCT_NAME = "//h2[@class]//span[@class]";
    private static final String PRODUCT_BRAND = "//div[contains(@class,'product-grid-adjustment')]//span[@class]";
    private static final String NEXT_BTN = "//a[contains(@aria-label,'next')]";
    private static final String LAST_PAGE = "//span[@class='s-pagination-item s-pagination-disabled']";
    private static final String PRODUCT_STARS = "//div[contains(@class,'main-slot')]//i[contains(@class,'star')]"; ///span

    public List<WebElement> getProducts() {
        return getElementsByVisibility(PRODUCT_CONTAINER);
    }

    public List<WebElement> getProductName() {
        return $$(PRODUCT_NAME);
    }

    public List<Double> getProductStars() {
        List<WebElement> productStars = getElementsByVisibility(PRODUCT_STARS);
        List<String> productStarsValue = new ArrayList<>();
        List<Double> productStarsValueDouble = new ArrayList<>();

        for (int i = 0; i < productStars.size(); i++) {
            productStarsValue.add(productStars.get(i).getAttribute("class")
                    .replace("-", ".")
                    .replace("a.icon a.icon.star.small a.star.small.", "")
                    .replace(" aok.align.bottom", ""));
            productStarsValueDouble.add(Double.parseDouble(productStarsValue.get(i)));
        }
        return productStarsValueDouble;
    }

    //method is not used because of the bug
    public List<WebElement> getProductBrand() {
        return getElementsByVisibility(PRODUCT_BRAND);
    }

    public WebElement getNextBtn() {
        return getElementByVisibility(NEXT_BTN);
    }

    public int getLastPage() {
        int lastPage = Integer.parseInt(getElementByVisibility(LAST_PAGE).getText());
        return lastPage - 1;
    }
}