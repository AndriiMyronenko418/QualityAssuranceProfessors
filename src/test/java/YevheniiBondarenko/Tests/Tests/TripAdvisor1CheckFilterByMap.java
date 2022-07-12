package YevheniiBondarenko.Tests.Tests;

import BasePageAndTestInit.TestInit;
import YevheniiBondarenko.Tests.Pages.TripAdvisorWebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TripAdvisor1CheckFilterByMap extends TestInit {

    @Test

    public void tripAdvisorCheckFilterByMap() {
        TripAdvisorWebElement tripAdvisorWebElement = new TripAdvisorWebElement(driver);
        Actions action = new Actions(driver);

        openUrl("https://www.tripadvisor.com/");
        tripAdvisorWebElement.searchingField().click();
        tripAdvisorWebElement.searchingField().sendKeys("Bali");
        tripAdvisorWebElement.baliLocation().click();
        tripAdvisorWebElement.thingsToDoBtn().click();
        for (int i = 0; i < 3; i++) {
            tripAdvisorWebElement.arrowNext().get(0).click();
        }
        tripAdvisorWebElement.cityTourBtn().click(); //end of the working day! Gonna finish tomoorow.

    }
}