package LevchenkoAlinka;
import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
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





