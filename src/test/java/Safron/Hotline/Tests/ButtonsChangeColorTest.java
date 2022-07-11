<<<<<<< HEAD:src/test/java/Safron/Hotline/Tests/ButtonsChangeColorTest.java
package Safron.Hotline.Tests;
=======
package Safron.Tests;
>>>>>>> master:src/test/java/Safron/Tests/ButtonsChangeColorTest.java

import BasePageAndTestInit.TestInit;
import Safron.Hotline.Pages.HotlineHeaderViewElements;
import Safron.Hotline.Pages.HotlineHeaderViewHelper;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsChangeColorTest extends TestInit {

    @Test
<<<<<<< HEAD:src/test/java/Safron/Hotline/Tests/ButtonsChangeColorTest.java
    public void testColorChanged() {
=======
    public void test4() {

>>>>>>> master:src/test/java/Safron/Tests/ButtonsChangeColorTest.java
        openUrl("https://hotline.ua/");

        HotlineHeaderViewHelper hotlineHeaderViewHelper = new HotlineHeaderViewHelper(driver);
        HotlineHeaderViewElements hotlineHeaderViewElements = new HotlineHeaderViewElements(driver);

        hotlineHeaderViewHelper.closePopUp();

        for (WebElement element : hotlineHeaderViewElements.rightSideHeaderButtons()) {
            hotlineHeaderViewHelper.moveCursor(element);
            Assert.assertNotEquals(hotlineHeaderViewHelper.getColorBefore(element), hotlineHeaderViewHelper.getColorAfter(element));
        }
    }
}
