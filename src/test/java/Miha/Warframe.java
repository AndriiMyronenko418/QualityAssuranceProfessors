package Miha;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Warframe extends BasePage {

    public Warframe(WebDriver driver) {
        super(driver);
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement acceptCookie() {
        return $("//button[@id='onetrust-accept-btn-handler']");
    }

    public void moveToButtonGame() {
        moveCursor(driver.findElement(By.xpath("//a[@class='navHeader sf-with-ul'][contains(text(),'Игра')]")));
    }

    public WebElement clickOnUpdateNews() {
        return $("//a[contains(@href,'https://www.warframe.com/ru/updates')]");
    }

    public WebElement nextNewsPage() {
        return $("//button[@aria-label='Next']");
    }

    public void scrollPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            sleep(1);
            js.executeScript("window.scrollBy(0,1000)", "");
        }
    }

    public WebElement clickChoosenNews() {
        return $("//div[@class='gradient']//*[contains(text(),'New War')]");
    }

    public WebElement newsNameCheck() {
        return $("//h1[contains(text(),'Update 31')]");
    }

    public WebElement historyButtonClick() {
        return $("//a[@href='https://www.warframe.com/ru/game#keyart']");
    }


    public WebElement garudaFrameClick() {
        return $("//a[@href='https://www.warframe.com/ru/game/warframes/garuda-prime']//div[@class='slide-content container']");
    }

    public WebElement waframeNameCheck() {
        return $("//div[@class='inner']//h1[contains(text(),'Гаруда')]");
    }

    public WebElement nextWaframeNameCheck() {
        return $("//div[@class='one-half']//h2[contains(text(),'Гаруда Прайм')]");
    }

    public WebElement primeStorageClick() {
        return $("//a[@class='tileGrid-tile PrimeVaultTile']");
    }

    public WebElement primeBuy() {
        return $("//div[@data-sku='738']");
    }

    public WebElement checkPriceAboutPrime() {
        return $("//div[@class='bignum'][contains(text(),'59')]");
    }

    public void openLinkMagazine() {
        moveCursor(driver.findElement(By.xpath("//a[@class='navHeader sf-with-ul'][@href='https://www.warframe.com/ru/buyplatinum']")));
    }

    public WebElement buyPlatinaPage() {
        return $("//a[@class='navHeader sf-with-ul'][@href='https://www.warframe.com/ru/buyplatinum']");
    }

    public void moveToDonate() {
        moveCursor(driver.findElement(By.xpath("//li[@data-sku='257']")));
    }

    public WebElement pricePlatinum() {
        return $("//span[contains(text(),'4300')]");
    }

    public WebElement nextPricePlatinum() {
        return $("//span[@class='amount'][contains(text(),'4300')]");
    }
}