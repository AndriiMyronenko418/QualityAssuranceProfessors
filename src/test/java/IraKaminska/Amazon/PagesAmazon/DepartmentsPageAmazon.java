package IraKaminska.Amazon.PagesAmazon;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DepartmentsPageAmazon extends BasePage {

    public DepartmentsPageAmazon(WebDriver driver) {
        super(driver);
    }

    private static final String ELECTRONICS_DEPARTMENT = "//a[text()= 'Electronics']";

    public WebElement getElectronicsDepartment() {
        return $(ELECTRONICS_DEPARTMENT);
    }
}