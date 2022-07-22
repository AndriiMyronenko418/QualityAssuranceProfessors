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

    public WebElement choseFilterBrand(String option) {
        return $(String.format("//li[contains(@id,'%s')]//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']", option));
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
}
