package Safron.NewBalanceUa.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;

public class NewBalanceManShoesPageHelper extends NewBalanceManShoesPageElements {
    public NewBalanceManShoesPageHelper(WebDriver driver) {
        super(driver);
    }

    ArrayList<String> usSizeList;

    public void setUsSizeList() {
        ArrayList<String> size = new ArrayList<>();
        for (int i = 0; i < sizeBoard().size(); i++) {
            size.add(sizeBoard().get(i).getText());
        }
        usSizeList = size;
    }

    public ArrayList<String> getUsSizeList() {
        return this.usSizeList;
    }

    ArrayList<String> ukSizeList;

    public void setUkSizeList() {
        ArrayList<String> size = new ArrayList<>();
        for (int i = 0; i < sizeBoard().size(); i++) {
            size.add(sizeBoard().get(i).getText());
        }
        ukSizeList = size;
    }

    public ArrayList<String> getUkSizeList() {
        return this.ukSizeList;
    }

    ArrayList<String> euSizeList;

    public void setEuSizeList() {
        ArrayList<String> size = new ArrayList<>();
        for (int i = 0; i < sizeBoard().size(); i++) {
            size.add(sizeBoard().get(i).getText());
        }
        euSizeList = size;
    }

    public ArrayList<String> getEuSizeList() {
        return this.euSizeList;
    }

    ArrayList<String> uaSizeList;

    public void setUaSizeList() {
        ArrayList<String> size = new ArrayList<>();
        for (int i = 0; i < sizeBoard().size(); i++) {
            size.add(sizeBoard().get(i).getText());
        }
        uaSizeList = size;
    }

    public ArrayList<String> getUaSizeList() {
        return this.uaSizeList;
    }

    public void assertsBoardsNotEquals() {
        Assert.assertNotEquals(getUsSizeList(), getUkSizeList());
        Assert.assertNotEquals(getUkSizeList(), getEuSizeList());
        Assert.assertNotEquals(getEuSizeList(), getUaSizeList());

    }

    private ArrayList<String> shoesPriceSortJava;

    public void setShoesPriceSortJava() {
        ArrayList<String> size = new ArrayList<>();
        for (int i = 0; i < shoesPrice().size(); i++) {
            size.add(shoesPrice().get(i).getText().substring(0, 5));
        }
        Collections.sort(size);
        shoesPriceSortJava = size;
    }

    public ArrayList<String> getShoesPriceSortJava() {
        return this.shoesPriceSortJava;
    }

    private ArrayList<String> shoesPriceLToH;

    public void setShoesPriceLToH() {
        ArrayList<String> size = new ArrayList<>();
        for (int i = 0; i < shoesPrice().size(); i++) {
            size.add(shoesPrice().get(i).getText().substring(0, 5));
        }
        shoesPriceLToH = size;
    }

    public ArrayList<String> getShoesPriceLToH() {
        return this.shoesPriceLToH;
    }
}