package Safron.NewBalanceUa.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;

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
}
