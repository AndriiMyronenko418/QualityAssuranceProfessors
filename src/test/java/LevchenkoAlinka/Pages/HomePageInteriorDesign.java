package LevchenkoAlinka.Pages;
import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageInteriorDesign extends BasePage {
    public HomePageInteriorDesign(WebDriver driver) {
        super(driver);
    }

    public WebElement portfolioBtn() {
        return $("//li[@class='dropdown']");
    }

    public WebElement smartRoomsOpen() {
        return $("//*[@alt='Smart квартири']");
    }

    public WebElement roomInCampus() {
        return $("//a[contains(text(), 'Дизайн квартири в ЖК Campus')]");
    }

    public WebElement photoDesignFlatCampus() {
        return $("//*[@class='portfolio-room']");
    }
}


