package VolodymyrHrytsiuk.Tests.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlizzardHomePage extends BasePage {

    public BlizzardHomePage(WebDriver driver) {
        super(driver);
    }

    private static final String WORLD_OF_WARCRAFT = "//a[@title='World of Warcraft']";
    private static final String WOW_CLASSIC = "//a[@title='World of Warcraft Classic']";
    private static final String HEARTHSTONE = "//a[@title='Hearthstone']";
    private static final String OVERWATCH = "//a[@title='Overwatch 2']";
    private static final String DIABLO_IMMORTAL = "//a[@title='Diablo Immortal']";
    private static final String DIABLO_II_IMMORTAL = "//a[@title='Diablo II: Resurrected']";
    private static final String DIABLO_III = "//a[@title='Diablo III']";
    private static final String WARCRAFT_III = "//a//img[@alt='Warcraft III']";
    private static final String WARCRAFT_REFORGED = "//img[contains(@slot,'cover') and not(contains(@src, 'WoW_Gear'))]";
    private static final String BUY_NOW_REFORGED_BTN = "//a[@id='browsing.product-page.button.buy']";

    public WebElement checkWorldOfWarcraftGame() {
        return $(WORLD_OF_WARCRAFT);
    }

    public WebElement checkWorldOfWarcraftClassicGame() {
        return moveTo(WOW_CLASSIC);
    }

    public WebElement checkHearthstoneGame() {
        return moveTo(HEARTHSTONE);
    }

    public WebElement checkOverwatchGame() {
        return moveTo(OVERWATCH);
    }

    public WebElement checkDiabloImmortalGame() {
        return moveTo(DIABLO_IMMORTAL);
    }

    public WebElement checkDiabloIIResurrectedGame() {
        return moveTo(DIABLO_II_IMMORTAL);
    }

    public WebElement checkDiabloIIIGame() {
        return moveTo(DIABLO_III);
    }

    public WebElement checkWarcraftIII() {
        return moveTo(WARCRAFT_III);
    }

    public WebElement wrctReforgedIcon() {
        return moveTo(WARCRAFT_REFORGED);
    }

    public WebElement buyNowReforgedIIIButton() {
        return moveTo(BUY_NOW_REFORGED_BTN);
    }
}