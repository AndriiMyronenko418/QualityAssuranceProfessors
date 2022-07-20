package NewBalance.Tests;

import BasePageAndTestInit.TestInit;
import NewBalance.Pages.NewBalanceHeaderViewHelper;
import NewBalance.Pages.NewBalanceManShoesPageHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class NewBalancePriceFilterTest extends TestInit {

    public void waitUrlContains(String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains(text));
    }

    @Test
    public void testPriceFilter(){

        NewBalanceHeaderViewHelper newBalanceHeaderViewHelper = new NewBalanceHeaderViewHelper(driver);
        NewBalanceManShoesPageHelper newBalanceManShoesPageHelper = new NewBalanceManShoesPageHelper(driver);

        openUrl("https://newbalance.ua/");
        newBalanceHeaderViewHelper.moveToManCatalogBtn();
        newBalanceHeaderViewHelper.manAllShoesBtn().click();
        for (int i = 0; i < 8; i++) {
            newBalanceManShoesPageHelper.minPrice().sendKeys(Keys.BACK_SPACE);
        }
        newBalanceManShoesPageHelper.minPrice().sendKeys("2000");
        newBalanceManShoesPageHelper.minPrice().sendKeys(Keys.ENTER);
        waitUrlContains("2000");
        for (int i = 0; i < 9; i++) {
            newBalanceManShoesPageHelper.maxPrice().sendKeys(Keys.BACK_SPACE); //don't work, I don't know why
        }
        newBalanceManShoesPageHelper.maxPrice().sendKeys("7000");
        newBalanceManShoesPageHelper.maxPrice().sendKeys(Keys.ENTER);
        waitUrlContains("7000");
        newBalanceManShoesPageHelper.setShoesPriceInt();
        newBalanceManShoesPageHelper.setShoesDiscountPrice();
        for (Integer n: newBalanceManShoesPageHelper.getShoesDiscountPrice()) {
            Assert.assertTrue(n <= 7000 && n >= 2000);
        }
        for (Integer n: newBalanceManShoesPageHelper.getShoesPriceInt()) {
            Assert.assertTrue(n <= 7000 && n >= 2000);
        }
    }
}