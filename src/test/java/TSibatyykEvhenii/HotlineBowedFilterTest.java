package TSibatyykEvhenii;

import BasePageAndTestInit.TestInit;
import TSibatyykEvhenii.Pages.HotlineSite;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HotlineBowedFilterTest extends TestInit {
    @Test
    public void hotlineTest(){
        HotlineSite hotline = new HotlineSite(driver);
        hotline.goToHotline();
        hotline.muzInstrument();
        hotline.gitarsSectionSelect().click();
        hotline.getBowedInstrument().get(2).click();
        sleep(4);
        hotline.violinSection().click();
        hotline.chooseCheckbox().get(0).click();
        hotline.chooseCheckbox().get(7).click();
        hotline.chooseCheckbox().get(0).click();
        hotline.chooseCheckbox().get(7).click();
        hotline.openFullBrandList().click();
        sleep(1);
        hotline.chooseCheckbox().get(18).click();
        hotline.chooseCheckbox().get(36).click();
        hotline.chooseCheckbox().get(18).click();
        hotline.chooseCheckbox().get(36).click();
        sleep(1);
        hotline.chooseCheckbox().get(37).click();
        hotline.chooseCheckbox().get(42).click();
        hotline.chooseCheckbox().get(37).click();
        hotline.chooseCheckbox().get(42).click();
        sleep(1);
        hotline.chooseCheckbox().get(43).click();
        hotline.chooseCheckbox().get(45).click();
        hotline.chooseCheckbox().get(43).click();
        hotline.chooseCheckbox().get(45).click();
        sleep(1);
        hotline.openFullStoreList().click();
        hotline.chooseCheckbox().get(46).click();
        hotline.chooseCheckbox().get(61).click();
        hotline.choosenElementBtn().click();
        String actualString = driver.findElement(By.xpath("//b[text()='Вибрані']/..")).getText();
        String expectedString = "2";
        Assert.assertTrue(actualString.contains(expectedString));{
            System.out.println("Assert pass");
        }


    }
}




