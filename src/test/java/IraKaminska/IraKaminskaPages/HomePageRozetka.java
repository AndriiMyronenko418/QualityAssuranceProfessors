package IraKaminska.IraKaminskaPages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

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

    public void goToTheSecondWindowTab(WebDriver driver, Integer seconds) {
        waitForNewTabOpened(seconds);
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void waitForNewTabOpened(Integer seconds) {
        for (int a = 0; a < seconds * 4; a++) {
            ArrayList<String> tabs2 = new ArrayList(driver.getWindowHandles());
            if (tabs2.size() > 1) {
                break;
            }
        }
    }
}
