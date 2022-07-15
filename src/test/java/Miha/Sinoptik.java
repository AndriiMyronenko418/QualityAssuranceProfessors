package Miha;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sinoptik extends BasePage {

    public Sinoptik(WebDriver driver) {
        super(driver);
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement changeLanguege() {
        return $("//a[@hreflang='ru']");
    }

    public WebElement searchCity() {
        return $("//input[@name='search_city']");
    }

    public WebElement enterSearch() {
        return $("//input[@class='search_city-submit']");
    }

    public WebElement checkChosenWeatherCity() {
        return $("//div[@class='cityName cityNameShort']");
    }
}
