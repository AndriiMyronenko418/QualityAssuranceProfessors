package IraKaminska.Amazon.PagesAmazon;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DepartmentsPageAmazon extends BasePage {

    public DepartmentsPageAmazon(WebDriver driver) {
        super(driver);
    }

    private static final String ELECTRONICS_DEPARTMENT = "//a[text()= 'Electronics']";
    private static final String BOOK_DEPARTMENT = "//a[text()= 'Books']";
    private static final String INVALID_BOOKS_PAGE = "//h2[@class='a-color-base headline truncate-1line']";

    public WebElement getElectronicsDepartment() {
        return $(ELECTRONICS_DEPARTMENT);
    }

    public WebElement getBookDepartment() {
        return $(BOOK_DEPARTMENT);
    }

    public WebElement checkBookDepartment() {
        return $(INVALID_BOOKS_PAGE);
    }
}