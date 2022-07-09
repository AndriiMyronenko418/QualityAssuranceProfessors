package Safron.Disney.Pages;

import org.openqa.selenium.WebDriver;

public class DisneyHeaderViewHelper extends DisneyHeaderViewElements {
    public DisneyHeaderViewHelper(WebDriver driver) {
        super(driver);
    }

    public void search(String search) {
        headerSearch().click();
        searchField().sendKeys(search + "\n");
    }
}
