package YevheniiBondarenko.Tests.Pages;

import org.openqa.selenium.WebDriver;

public class DanceShopperHelper extends HomePageWebElements {
    public DanceShopperHelper(WebDriver driver) {
        super(driver);
    }

    public void goToDanceShopper(){ driver.get("https://www.danceshopper.com/Default");

    }
}
