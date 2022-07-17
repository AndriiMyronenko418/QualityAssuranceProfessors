package TSibatyykEvhenii.Tests;

import BasePageAndTestInit.TestInit;
import TSibatyykEvhenii.Pages.Zakaz.PelmeniPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassToTest extends TestInit {

    @Test
    public void zakazmz() {

        PelmeniPage pelmeniPage = new PelmeniPage(driver);

        openUrl("https://novus.zakaz.ua/ru/products/04820171998793/pelmeni-laska-400g/");
        pelmeniPage.addTocart().click();
        pelmeniPage.goToCart().click();
        pelmeniPage.deliveryType().click();
        pelmeniPage.toKiev().click();
        pelmeniPage.storeChooseBtn().click();
        pelmeniPage.storeChose().sendKeys(Keys.ENTER);
        sleep(4);                                               //wait to load result
        Assert.assertEquals("сожалению", "сожалению");
    }
}
