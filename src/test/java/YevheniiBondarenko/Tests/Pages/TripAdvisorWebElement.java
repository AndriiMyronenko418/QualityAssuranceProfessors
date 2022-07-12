package YevheniiBondarenko.Tests.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TripAdvisorWebElement extends BasePage {
    public TripAdvisorWebElement(WebDriver driver) {
        super(driver);
    }

    private static final String SEARCHING_FIELD = "//input[@placeholder='Where to?']";
    private static final String BALI_LOCATION = "//div[@class='biGQs _P fiohW fOtGX'][text()='Bali']/../../..";
    private static final String THINKS_TO_DO_BTN = "//span[text()='Things to Do']";
    private static final String ARROW_NEXT_BTN = "//button[@class='BrOJk u j z _F wSSLS tIqAi unMkR'][@aria-label='Next']";
    private static final String CITY_TOUR_BTN = "//div[@class='MaELV _U s l']/div[text()='City Tours']";

    public WebElement searchingField() {
        return $(SEARCHING_FIELD);
    }

    public WebElement thingsToDoBtn() {
        return $(THINKS_TO_DO_BTN);
    }

    public WebElement baliLocation() {
        return $(BALI_LOCATION);
    }

    public WebElement cityTourBtn() {
        return $(CITY_TOUR_BTN);
    }

    public List<WebElement> arrowNext() {
        return $$(ARROW_NEXT_BTN);
    }
}