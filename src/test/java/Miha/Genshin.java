package Miha;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Genshin extends BasePage {
    public Genshin(WebDriver driver) {

        super(driver);
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement startToOpenCite() {
        return $("//canvas[@class='webgl-element']");
    }

    public WebElement openInazumaCharacterList() {
        return $("//a[contains(@href,'/ru/character/inazuma')]");
    }

    public void swipeCharacter() {
        for (int i = 0; i < 11; i++) {
            sleep(1);
            driver.findElement(By.xpath("//div[@class='swiper-btn-next']")).click();
        }
    }

    public WebElement nameCharacter() {
        return $("//div[@class='character__cv__name']//p[contains(text(),'ISHIDA Akira')]");
    }


    public WebElement informationOpen() {
        return $("//*[contains(text(),'Информация')]");
    }


    public WebElement mangaOpen() {
        return $("//a[contains(@href,'/ru/manga')]");
    }


    public WebElement choosenMangaOpen() {
        return $("//li[@class='chapters__item']//a[contains(@href,'/ru/manga/detail/727?mute=1')]");
    }


    public WebElement newsOpen() {
        return $("//div[@class='header__navbar']//a[contains(@href,'/ru/news')]");
    }

    public WebElement newsChoosenOpen() {
        return $("//a[contains(@href,'/ru/news/detail/21939')][@class='news__title ellipsis']");
    }

    public WebElement titleChosenNews() {
        return $("//h3[@class='recommend__title'][contains(text(),'Превью костюма в Genshin Impact: Ночной силуэт')]");
    }

    public WebElement openTaivatWorld() {
        return $("//a[contains(@href,'/ru/map')]");
    }

    public WebElement coockieOkClick() {
        return $("//button[@class='mihoyo-cookie-tips__button mihoyo-cookie-tips__button--hk4e']");
    }

    public WebElement monshtatClick() {
        return $("//div[@class='home__tip']//img[@class='home__tran']");
    }

    public WebElement nameCityWarify() {
        return $("//h1[@class='city__name']");
    }

    public WebElement nameLiUeCityWarify() {
        return $("//p[@class='detail__title']");
    }

    public WebElement openInfomationAboutCity() {
        return $("//button[@class='city__detail']");
    }

    public WebElement closeInformationAboutCity() {
        return $("//button[@class='detail__close']");
    }

    public WebElement liueClick() {
        return $("//div[@data-index='2']");
    }

    public WebElement travelerOpenPage() {
        return $("//a[contains(@href,'/ru/town')]");
    }

    public WebElement historyOpenMonshtat() {
        return $("//img[@data-to='/town/mondstadt']");
    }

    public WebElement historyOpenLiUe() {
        return $("//img[@data-to='/town/liyue']");
    }

    public WebElement historyOpenInazuma() {
        return $("//img[@data-to='/town/inazuma']");
    }
}
