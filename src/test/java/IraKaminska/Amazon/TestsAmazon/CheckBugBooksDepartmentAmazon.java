package IraKaminska.Amazon.TestsAmazon;

import BasePageAndTestInit.TestInit;
import IraKaminska.Amazon.PagesAmazon.DepartmentsPageAmazon;
import IraKaminska.Amazon.PagesAmazon.HomePageAmazon;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBugBooksDepartmentAmazon extends TestInit {

    @Test
    public void checkBookDepartmentAmazon() {

        HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
        DepartmentsPageAmazon departmentsPageAmazon = new DepartmentsPageAmazon(driver);

        openUrl("https://www.amazon.com/");
        scroll(200);
        homePageAmazon.getShopNowByCategoryButton().click();
        departmentsPageAmazon.getBookDepartment().click();

        Assert.assertTrue(departmentsPageAmazon.checkBookDepartment().getText().contains("Shop by Category"));
    }
}