package NewBalance.Tests;

import BasePageAndTestInit.TestInit;
import NewBalance.Pages.NewBalanceHeaderViewElements;
import NewBalance.Pages.NewBalanceHeaderViewHelper;
import NewBalance.Pages.NewBalanceManShoesPageElements;
import NewBalance.Pages.NewBalanceWomanShoesPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class NewBalanceLowToHeightFilterTest extends TestInit {

    @Test
    public void checkLowToHeightTestFilter() {

        NewBalanceHeaderViewElements hp = new NewBalanceHeaderViewElements(driver);
        NewBalanceHeaderViewHelper helper = new NewBalanceHeaderViewHelper(driver);
        NewBalanceManShoesPageElements hpElements = new NewBalanceManShoesPageElements(driver);
        NewBalanceWomanShoesPage wShoesPage = new NewBalanceWomanShoesPage(driver);

        openUrl("https://newbalance.ua/");
        helper.moveCursor(hp.getHeaderOption("Жінкам"));
        wShoesPage.getShoes("women", "vzutta", "dla-bigu").click();
        hpElements.sort("дешеві").click();

        List<Integer> prices = wShoesPage.shoePrices().stream()
                .map(WebElement::getText)
                .map(str -> str.replace(" ", ""))
                .map(str -> str.replace("грн", ""))
                .map(Integer::parseInt).sorted().toList();

        for (int i = 0; i < prices.size() - 1; i++) {
            Assert.assertTrue(prices.get(i) <= prices.get(i + 1));
        }
        System.out.println(prices);
    }
}