package TSibatyykEvhenii.Tests;

import BasePageAndTestInit.TestInit;
import TSibatyykEvhenii.Asserts.InternationalTest;
import TSibatyykEvhenii.Asserts.TryCatch;
import TSibatyykEvhenii.Pages.InternationalTest.AfterTestPage;
import TSibatyykEvhenii.Pages.InternationalTest.InternationalTestMainPage;
import TSibatyykEvhenii.Pages.InternationalTest.TestPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class IqButtonsTest extends TestInit {

    @Test
    public void buttonsTest() {
        InternationalTestMainPage internationalTestMainPage = new InternationalTestMainPage(driver);
        InternationalTest internationalTest = new InternationalTest(driver);
        AfterTestPage afterTestPage = new AfterTestPage(driver);
        TestPage testPage = new TestPage(driver);
        TryCatch tryCatch = new TryCatch(driver);

        openUrl("https://international-iq-test.com/");
        internationalTestMainPage.getLenguageBtn().click();
        tryCatch.internetionalTest();
        internationalTestMainPage.startTestBtn().click();
        testPage.testIq();
        afterTestPage.firstNameField().sendKeys("Genius" + Keys.ENTER);
        afterTestPage.emailField().sendKeys("zhzh@gmail.com" + Keys.ENTER);
        afterTestPage.countryBtn().click();
        tryCatch.countryChoose();
        afterTestPage.genderBtn().click();
        afterTestPage.genderMan().click();
        afterTestPage.birthdayBtn().click();
        afterTestPage.chooseBirthday().click();
        afterTestPage.choseSchoolBtn().click();
        afterTestPage.selectSchool().click();
        afterTestPage.chooseDiplomaBtn().click();
        afterTestPage.selectDiploma().click();
        afterTestPage.goToValidateBtn().click();
        internationalTest.internationalTestAssert();
    }
}