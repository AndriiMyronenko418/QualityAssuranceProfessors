package ShidlovskiyMax.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);

    }

    public WebElement fieldkeywords() { return $("//input[@id='twotabsearchtextbox']");
    }

    public WebElement Search() { return $("//span[@id='nav-search-submit-text']");
    }

    public WebElement Resultfound() { return $("//div[@class='sg-col-inner']");
    }
}
