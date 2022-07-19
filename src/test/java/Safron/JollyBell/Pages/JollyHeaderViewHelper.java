package Safron.JollyBell.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class JollyHeaderViewHelper extends JollyHeaderViewElements{
    public JollyHeaderViewHelper(WebDriver driver) {
        super(driver);
    }

    private ArrayList<String> ruTextHeader;

    public void setRuTextHeader() {
        ArrayList<String> text = new ArrayList<>();
        for (WebElement element : headerBtns()) {
            text.add(element.getText());
        }
        ruTextHeader = text;
    }

    public ArrayList<String> getRuTextHeader() {
        return this.ruTextHeader;
    }

    private ArrayList<String> ukTextHeader;

    public void setUkTextHeader() {
        ArrayList<String> text = new ArrayList<>();
        for (WebElement element : headerBtns()) {
            text.add(element.getText());
        }
        ukTextHeader = text;
    }

    public ArrayList<String> getUkTextHeader() {
        return this.ukTextHeader;
    }

    private ArrayList<String> engTextHeader;

    public void setEngTextHeader() {
        ArrayList<String> text = new ArrayList<>();
        for (WebElement element : headerBtns()) {
            text.add(element.getText());
        }
        engTextHeader = text;
    }

    public ArrayList<String> getEngTextHeader() {
        return this.engTextHeader;
    }
}