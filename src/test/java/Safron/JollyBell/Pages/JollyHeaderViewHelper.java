package Safron.JollyBell.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class JollyHeaderViewHelper extends JollyHeaderViewElements{
    public JollyHeaderViewHelper(WebDriver driver) {
        super(driver);
    }

    public void waitUntilTitleContainsText(String title){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.titleContains(String.valueOf(title.matches("[a-zA-Z]"))));
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
