package Amazon.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPetPage extends BasePage {
    public AmazonPetPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSeeMoreButtonFilters() {
        return $("//div[@id='brandsRefinements']//span[@class='a-expander-prompt']");
    }

    public WebElement filterBrandName(String option) {
        return $(String.format("//li[contains(@id,'%s')]", option));
    }

    public WebElement getChosenButtonItems(String option) {
        return $(String.format("//div[contains(@data-index,'%s')]//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']", option));
    }

    public WebElement brandNameChosenItems() {
        return $("//tr[@class='a-spacing-small po-brand']//span[@class='a-size-base']");
    }

    public WebElement clickChosenProduct() {
        return $("//div[@data-asin='B0B755G6KP']");
    }

    public WebElement priceProductMainPage() {
        return $("//div[@data-asin='B0B755G6KP']//span[@class='a-price-whole']");
    }

    public WebElement priceOnChosenProductPage() {
        return $("//div[@class='a-section a-spacing-none aok-align-center']//span[@class='a-price-whole']");
    }
}
