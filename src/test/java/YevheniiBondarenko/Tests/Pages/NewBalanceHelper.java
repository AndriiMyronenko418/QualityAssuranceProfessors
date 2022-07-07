package YevheniiBondarenko.Tests.Pages;

import org.openqa.selenium.WebDriver;

public class NewBalanceHelper extends NewBalanceWebElement{
    public NewBalanceHelper(WebDriver driver) {
        super(driver);
    }

    public void goToNewBalanceUkraine(){driver.get("https://newbalance.ua/");}


}
