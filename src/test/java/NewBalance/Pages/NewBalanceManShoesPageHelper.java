package NewBalance.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;

public class NewBalanceManShoesPageHelper extends NewBalanceManShoesPageElements {
    public NewBalanceManShoesPageHelper(WebDriver driver) {
        super(driver);
    }

    public void moveSlider(){
        Actions move = new Actions(driver);
        move.dragAndDropBy(sliderFirst(), 1500, 3000);
    }
}