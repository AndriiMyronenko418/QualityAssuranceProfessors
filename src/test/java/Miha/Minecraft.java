package Miha;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Minecraft extends BasePage {

    public Minecraft(WebDriver driver) {
        super(driver);
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement acceptCookie()
    {
        return $("//button[@class='_1XuCi2WhiqeWRUVp3pnFG3 erL690_8JwUW-R4bJRcfl'][contains(text(),'Accept')]");
    }

    public WebElement openPageForBuyGame()
    {
        return $("//a[@href='/about-minecraft'][@tabindex='0']");
    }

    public WebElement clickOnBuy()
    {
        return $("//a[@class='mc-button__primary mc-button__green-s1'][@href='/get-minecraft']");
    }

    public WebElement buyPcVersion()
    {
        return $("//a[@href='/store/minecraft-java-bedrock-edition-pc']");
    }

    public WebElement checkPlatformProduct()
    {
        return $("//h1[@class='txt-bone-white']");
    }

    public void moveToButtonGames()
    {
        moveCursor(driver.findElement(By.xpath("//button[@class='mc-globalhead__drop-trigger']")));
    }

    public WebElement dungeonGamesOpen()
    {
        return $("//a[@class='mc-globalhead__drop-link'][@href='/about-dungeons']");
    }

    public WebElement startBuying()
    {
        return $("//div[@class='buy-module-select__indicator buy-module-select__dropdown-indicator css-tlfecz-indicatorContainer']");
    }

    public WebElement chooseWin()
    {
        return $("//div[contains(text(),'Windows 10')]");
    }

    public WebElement chooseDlcEdition()
    {
        return $("//div[@class='buy-module-select-container edition-selection css-2b097c-container']//div[@class='buy-module-select__indicator buy-module-select__dropdown-indicator css-tlfecz-indicatorContainer']");
    }

    public WebElement clickOnChosenEdition()
    {
        return $("//div[contains(text(),'Standard')]");
    }

    public WebElement buyNowEdition()
    {
        return $("//a[@href='https://www.microsoft.com/p/minecraft-dungeons/9NB6BVL3MTG4']");
    }

    public WebElement clickOnCheckPrice()
    {
        return $("//a[@href='/uk-ua/p/minecraft-dungeons/9NB6BVL3MTG4?rtc=1&activetab=pivot%3aregionofcompareeditionstab']");
    }

    public WebElement nextGamePrice()
    {
        return $("//div[@class='f-cell-container']//span[@class='module-accentuated-price-center x-p-t-0x'][contains(text(),'505')]");
    }

    public WebElement openLegendsPage()
    {
        return $("//a[@class='mc-globalhead__drop-link'][@href='/about-legends']");
    }

    public WebElement watchTrailer()
    {
        return $("//a[@href='https://youtu.be/1JSjZqV-YK8']");
    }

    public WebElement checkNameTrailer()
    {
        return $("//span[@class='rte-text-white'][contains(text(),'Discover the mysteries of Minecraft Legends')]");
    }

    public WebElement pageOpenEducation()
    {
        return $("//a[@class='mc-globalhead__drop-link'][@href='https://education.minecraft.net/']");
    }

    public  WebElement startEducate()
    {
        return $("//div[@class='col-md-2 header-QuickstartCta']//a[@href='/en-us/quick-start']");
    }

    public WebElement educateRole()
    {
        return $("//a[@aria-label='Educator']");
    }

    public WebElement tryMinecraftEducate()
    {
        return $("//a[@aria-label='Try Minecraft today ']");
    }

    public WebElement chooseTypeDownload()
    {
        return $("//a[@aria-label='Download for PC or Mac']");
    }

    public WebElement checkOnHadTheyOnWindows()
    {
        return $("//div[@class='ap-heading3'][contains(text(),'WINDOWS')]");
    }
}