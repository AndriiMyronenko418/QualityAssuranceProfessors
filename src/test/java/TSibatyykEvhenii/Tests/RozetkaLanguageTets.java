package TSibatyykEvhenii.Tests;

import BasePageAndTestInit.TestInit;
import TSibatyykEvhenii.Asserts.TryCatch;
import org.testng.annotations.Test;

public class RozetkaLanguageTets extends TestInit{

    @Test
    public void rozetkaLanguge(){

        TryCatch tryCatch = new TryCatch(driver);

        openUrl("https://rozetka.com.ua/");
        tryCatch.RozetkaLanguageCheck();
    }

}
