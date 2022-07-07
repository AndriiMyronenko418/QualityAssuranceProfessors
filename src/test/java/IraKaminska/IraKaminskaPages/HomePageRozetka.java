package IraKaminska.IraKaminskaPages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageRozetka extends BasePage {
    public HomePageRozetka(WebDriver driver) {
        super(driver);
    }

    public WebElement clickRozetkaManuBtn() {
        return driver.findElement(By.xpath("//button[@class='header__button ng-tns-c94-1']"));
    }

    public WebElement clickRozetkaCatalogBtn() {
        return driver.findElement(By.xpath("//button[@id='fat-menu' and @class='button button--large side-menu__button ng-tns-c94-1']"));
    }

    public WebElement ClickRozetkaPhonesTVElectronicsBtn() {
        return driver.findElement(By.xpath("//a[text()= 'Смартфоны, ТВ и электроника']"));
    }
}
