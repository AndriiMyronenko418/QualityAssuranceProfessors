package Miha;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class League extends BasePage {

    public League(WebDriver driver) {
        super(driver);
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement championPage() {
        return $("//span[contains(text(),'Champions')]");
    }

    public WebElement chooseAkaliChampion() {
        return $("//a[@href='/lol/champions/akali/build']");
    }

    public void moveToButtonRank() {
        moveCursor(driver.findElement(By.xpath("//div[@class='default-select filter-select filter-select_rank css-0']")));
    }

    public WebElement selectRank() {
        return $("//div[@class='default-select filter-select filter-select_rank css-0']");
    }

    public WebElement choseSelectRank() {
        return $("//*[contains(text(),'Diamond +')]");
    }

    public WebElement checkRankChose() {
        return $("//span[@class='champion-title']");
    }
}