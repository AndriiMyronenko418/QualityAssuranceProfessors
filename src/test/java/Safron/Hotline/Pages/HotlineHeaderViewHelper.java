<<<<<<< HEAD:src/test/java/Safron/Hotline/Pages/HotlineHeaderViewHelper.java
package Safron.Hotline.Pages;
=======
package Safron.Pages;
>>>>>>> master:src/test/java/Safron/Pages/HotlineHeaderViewHelper.java

import BasePageAndTestInit.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HotlineHeaderViewHelper extends HotlineHeaderViewElements {
<<<<<<< HEAD:src/test/java/Safron/Hotline/Pages/HotlineHeaderViewHelper.java
=======

>>>>>>> master:src/test/java/Safron/Pages/HotlineHeaderViewHelper.java
    public HotlineHeaderViewHelper(WebDriver driver) {
        super(driver);
    }

    private String location;

    public String getLocation() {
        return this.location;
    }

<<<<<<< HEAD:src/test/java/Safron/Hotline/Pages/HotlineHeaderViewHelper.java
    public void setLocationText() {
=======
    public void getLocationText() {
>>>>>>> master:src/test/java/Safron/Pages/HotlineHeaderViewHelper.java
        location = locationBtnKyiv().getText();
    }

    public void closePopUp() {
        TestInit testInit = new TestInit();
        testInit.sleep(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String str = "return document.querySelector('#page-index > div.grv-dialog-host').shadowRoot.querySelector('div > div > div.buttons-wrapper > button.sub-dialog-btn.block_btn')";
        WebElement btn = (WebElement) ((JavascriptExecutor) driver).executeScript(str);
        btn.click();
    }

    public void moveCursor(WebElement locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(locator).perform();
    }

    public String getColorBefore(WebElement element) {
        return element.getCssValue("background-color");
    }

    public String getColorAfter(WebElement element) {
        return element.getCssValue("color");
    }

}