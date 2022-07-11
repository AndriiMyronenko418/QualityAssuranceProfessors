package AndriiTest.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MensShoesPage extends BasePage {

    public MensShoesPage(WebDriver driver) {
        super(driver);
    }

    private static final String ADD_TO_FAVOURITES = "//button[@aria-label='Add to Favourites']";

    public List<WebElement> getAddToFavourites() {
        return $$(ADD_TO_FAVOURITES);
    }
}