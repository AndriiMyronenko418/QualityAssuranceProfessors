package BasePageAndTestInit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;

public class TestInit {

    //type name of the browser you're using in this variable (chrome or firefox)
    private static final String BROWSER_NAME = "chrome";
    //put false here if you want to see browser or true to headless mode
    private final boolean headless = false;

    public WebDriver driver;

    public void openUrl(String site) {
        driver.get(site);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void scroll(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")", "");
    }

    public void switchToTab(int tabNumber) {
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(tabNumber - 1));
    }

    @BeforeMethod
    public void setUp() throws Exception {
        switch (BROWSER_NAME) {
            case ("chrome") -> {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setHeadless(headless);
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(chromeOptions);
                if (!headless) {
                    driver.manage().window().maximize();
                }
            }
            case ("firefox") -> {
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setHeadless(headless);
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(firefoxOptions);
                driver.manage().window().maximize();
                if (!headless) {
                    driver.manage().window().maximize();
                }
            }
            default -> throw new Exception("You chose not valid browser!");
        }
    }

    @AfterMethod
    public void after() {
        driver.quit();
    }

    public void goBack() {
        driver.navigate().back();
    }

    public void switchToNextTab() {
        driver.getWindowHandles().forEach(tab -> driver.switchTo().window(tab));
    }
}
