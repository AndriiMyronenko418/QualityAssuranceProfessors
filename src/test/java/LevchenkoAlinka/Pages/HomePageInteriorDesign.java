package LevchenkoAlinka.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageInteriorDesign extends BasePage {
    public HomePageInteriorDesign(WebDriver driver) {
        super(driver);
    }

    public WebElement portfolioBtn() {
        return driver.findElements(By.xpath("//li[@class='dropdown']")).get(9);
    }

    public WebElement smartRoomsopen() {
        return driver.findElement(By.xpath("//*[@alt='Smart квартири']"));
    }

    public WebElement roomInCampus() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Дизайн квартири в ЖК Campus')]"));
    }

    public WebElement photoDesignFlatCampus() {
        return driver.findElement(By.xpath("//*[@class='portfolio-room']"));
    }

    public WebElement price() {
        return driver.findElements(By.xpath("//li[@class='dropdown']")).get(8);
    }

    public List<WebElement> designInteriorPriceBtn() {
        return driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
    }

    public List<WebElement> imgPriceOpen() {
        return driver.findElements(By.xpath("//a[@href='/ua/design-interior-price-kiev-ukr.html']"));
    }
}


