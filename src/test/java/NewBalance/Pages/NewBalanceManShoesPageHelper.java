package NewBalance.Pages;

import BasePageAndTestInit.TestInit;
import org.openqa.selenium.Keys;
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

    private ArrayList<Integer> shoesDiscountPrice;

    public void setShoesDiscountPrice() {
        ArrayList<String> size = new ArrayList<>();
        for (WebElement element : priceOldOrDiscount("discount")) {
            String[] s = element.getText().split(" ");
            size.add(s[0] + s[1]);
        }
        ArrayList<Integer> prices = new ArrayList<>();
        for (String s : size) {
            prices.add(Integer.parseInt(s));
        }
        shoesDiscountPrice = prices;
    }

    public ArrayList<Integer> getShoesDiscountPrice() {
        return this.shoesDiscountPrice;
    }

    private ArrayList<Integer> shoesPriceInt;

    public void setShoesPriceInt() {
        ArrayList<String> size = new ArrayList<>();
        for (WebElement element : shoesPrice()) {
            String[] s = element.getText().split(" ");
            size.add(s[0] + s[1]);
        }
        ArrayList<Integer> prices = new ArrayList<>();
        for (String s : size) {
            prices.add(Integer.parseInt(s));
        }
        shoesPriceInt = prices;
    }

    public ArrayList<Integer> getShoesPriceInt() {
        return this.shoesPriceInt;
    }

    public void enterMinPrice(String price) {
        TestInit testInit = new TestInit();
        for (int i = 0; i < 8; i++) {
            minPrice().sendKeys(Keys.BACK_SPACE);
        }
        minPrice().sendKeys(price);
        minPrice().sendKeys(Keys.ENTER);
        testInit.sleep(3);
    }

    public void enterMaxPrice(String price) {
        TestInit testInit = new TestInit();
        for (int i = 0; i < 9; i++) {
            maxPrice().sendKeys(Keys.BACK_SPACE);
        }
        maxPrice().sendKeys(price);
        maxPrice().sendKeys(Keys.ENTER);
        testInit.sleep(3);
    }
}