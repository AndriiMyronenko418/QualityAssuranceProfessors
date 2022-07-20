package NewBalance.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;

public class NewBalanceManShoesPageHelper extends NewBalanceManShoesPageElements {
    public NewBalanceManShoesPageHelper(WebDriver driver) {
        super(driver);
    }

    private ArrayList<String> shoesPriceSortJavaHigh;

    public void setShoesPriceSortJavaHigh() {
        ArrayList<String> size = new ArrayList<>();
        for (WebElement element : shoesPrice()) {
            String[] s = element.getText().split(" ");
            size.add(s[0] + s[1]);
        }
        Collections.sort(size, Collections.reverseOrder());
        shoesPriceSortJavaHigh = size;
    }

    public ArrayList<String> getShoesPriceSortJavaHigh() {
        return this.shoesPriceSortJavaHigh;
    }

    private ArrayList<String> shoesPrice;

    public void setShoesPrice() {
        ArrayList<String> size = new ArrayList<>();
        for (WebElement element : shoesPrice()) {
            String[] s = element.getText().split(" ");
            size.add(s[0] + s[1]);
        }
        shoesPrice = size;
    }

    public ArrayList<String> getShoesPrice() {
        return this.shoesPrice;
    }
}