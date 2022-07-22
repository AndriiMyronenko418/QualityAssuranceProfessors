package NewBalance.Tests;

import BasePageAndTestInit.TestInit;
import NewBalance.Pages.NewBalanceHeaderViewHelper;
import NewBalance.Pages.NewBalanceManPageElements;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewBalanceTestCategoryFilter extends TestInit {

    @DataProvider(name = "category filters")
    public Object[][] dpMethod() {
        return new Object[][]{
                {"vzutta", "dla-bigu", "dla-asfaltnogo-pokritta", "Взуття", "Для бігу", "Для асфальтного покриття"},
                {"odag", "kurtki-ta-zileti", "kurtki", "Одяг", "Куртки та жилети", "Куртки"},
                {"aksesuari", "golovni-ubori", "kepki", "Аксесуари", "Головні убори", "Кепки"}};
    }

    @Test(dataProvider = "category filters")
    public void testCategoryFilter(String category, String subcategory, String subSubcategory,
                                   String categoryName, String subcategoryName, String subSubcategoryName) {

        NewBalanceHeaderViewHelper newBalanceHeaderViewHelper = new NewBalanceHeaderViewHelper(driver);
        NewBalanceManPageElements newBalanceManPageElements = new NewBalanceManPageElements(driver);

        openUrl("https://newbalance.ua/");
        newBalanceHeaderViewHelper.catalogBtn("Чоловікам").click();
        newBalanceManPageElements.categoryFilter(category).click();
        newBalanceManPageElements.subcategory(category, subcategory).click();
        newBalanceManPageElements.subSubcategory(category, subcategory, subSubcategory).click();

        Assert.assertTrue(newBalanceManPageElements.label().get(0).getText().contains(categoryName));
        Assert.assertTrue(newBalanceManPageElements.label().get(1).getText().contains(subcategoryName));
        Assert.assertTrue(newBalanceManPageElements.label().get(2).getText().contains(subSubcategoryName));
        for (WebElement element : newBalanceManPageElements.brand()) {
            Assert.assertTrue(element.getText().contains(subSubcategoryName.toUpperCase()));
        }
    }
}
