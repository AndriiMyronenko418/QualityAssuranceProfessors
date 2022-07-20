package NewBalance.Pages;

import org.openqa.selenium.WebDriver;

public class NewBalanceKidsPageHelper extends NewBalanceKidsPageElements{
    public NewBalanceKidsPageHelper(WebDriver driver) {
        super(driver);
    }

    public String getPinkFilterColor(){
        return pinkFilter().getCssValue("background-color");
    }

    public String getLabelCircleColor(){
        return labelCircleColor().getCssValue("background-color");
    }
}