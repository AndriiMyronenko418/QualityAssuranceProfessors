package TSibatyykEvhenii.Asserts;

import BasePageAndTestInit.BasePage;
import TSibatyykEvhenii.Pages.Epicentr.EpicentrkMainPage;
import TSibatyykEvhenii.Pages.Rozetka.RozetkaMainPage;
import org.openqa.selenium.WebDriver;

public class TryCatch extends BasePage {

    public TryCatch(WebDriver driver) {
        super(driver);
    }

    public void tryCatchMethod() {
        Epicentr epicentr = new Epicentr(driver);
        EpicentrkMainPage emp = new EpicentrkMainPage(driver);
        try {
            epicentr.assertMethodForEpicentr();
        } catch (Exception e) {
            emp.changeLanguageBtn().click();
            System.out.println("Language was piggy-dog");
        }
    }

    public void tryCatchRozetka() {
        RozetkaMainPage rozetkaMainPage = new RozetkaMainPage(driver);
        try {
            rozetkaMainPage.ukrainianLanguageBtn().click();
        } catch (Exception e) {
            System.out.println("Language already Ukrainian");
        }
    }
}