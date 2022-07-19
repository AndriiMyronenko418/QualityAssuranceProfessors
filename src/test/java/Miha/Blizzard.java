package Miha;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Blizzard extends BasePage {

    public Blizzard(WebDriver driver) {
        super(driver);
    }

    public WebElement gameClickPage() {
        return $("//a[@class='Navbar-item Navbar-modalToggle is-noSelect Navbar-games']");
    }

    public WebElement wowOpen() {
        return $("//a[@href='https://worldofwarcraft.com/'][@class='Navbar-gameLogo animation-delay-4']");
    }

    public WebElement buyPodpiska() {
        return $("//a[@href='https://shop.battle.net/product/world-of-warcraft-subscription?utm_source=worldofwarcraft.com&utm_campaign=bop-wow-global-subscription&utm_medium=internal&utm_content=site-nav']");
    }

    public WebElement choseBuySubscribeOnOneMonth() {
        return $("//dt[contains(text(),'1 месяц')]");
    }

    public WebElement checkNameGameOnSubcribe() {
        return $("//h1[@class='meka-font-display meka-font-display--header-4']");
    }

    public WebElement openPageOverwatch() {
        return $("//div[@class='Navbar-gameLogoBlock Navbar-columns2 Navbar-imagePanel']//a[@href='https://playoverwatch.com/']");
    }

    public WebElement pageWithListHeroes() {
        return $("//nav[@arial-label='Site Navigation']//a[@data-analytics-placement='heroes']");
    }

    public WebElement choseHeroSombra() {
        return $("//a[@data-hero-id='sombra']");
    }

    public WebElement firstAbility() {
        return $("//div[@data-ability-name='Транслокатор']");
    }

    public WebElement storyCharacter() {
        return $("//li[@data-tab-name='story']");
    }

    public WebElement heroName() {
        return $("//span[@class='portrait-title'][contains(text(),'Сомбра')]");
    }

    public WebElement hotsGamePage() {
        return $("//div[@class='Navbar-gameLogoBlock Navbar-columns2 Navbar-imagePanel']//a[@href='https://heroesofthestorm.com/']");
    }

    public WebElement gameHotsPage() {
        return $("//div[@class='Header-nav']//a[@data-action='Game']");
    }

    public WebElement mapsGameOpen() {
        return $("//a[@class='Battlegrounds-cta']");
    }

    public WebElement mapsGardenChose() {
        return $("//a[@data-battleground-id='GardenOfTerror']");
    }

    public WebElement nameCheckMap() {
        return $("//h1[@class='BattlegroundHeader-title']");
    }

    public WebElement openDiablo() {
        return $("//div[@class='Navbar-gameLogoBlock Navbar-columns2 Navbar-imagePanel']//a[@href='https://diablo3.com/']");
    }

    public WebElement rankList() {
        return $("//li[@class='menu-rankings']");
    }

    public WebElement selectRankClass() {
        return $("//select[@class='greater-rift-selector']");
    }

    public WebElement choseDhClass() {
        return $("//option[@value='/ru-ru/rankings/era/16/rift-dh']");
    }

    public WebElement playerTopChose() {
        return $("//a[@href='/ru-ru/profile/Gabon-21413/hero/154253905']");
    }

    public WebElement choseAnotherHeroPlayer() {
        return $("//a[@href='146570364']");
    }

    public WebElement checkNamePlayer() {
        return $("//h2[@class='header-2'][contains(text(),'Gabon')]");
    }
}