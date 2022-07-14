package Miha;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Citrus extends BasePage {

    public Citrus(WebDriver driver) {
        super(driver);
    }


    public WebElement phoneCategoryOpen() {
        return $("//div[contains(text(),'Смартфоны')]");
    }

    public WebElement filterChooseApplePhones() {
        return $("//a[contains(@href,'/smartfony/brand-apple/')]");
    }

    public WebElement phonePrice() {
        return $("//div[@data-price='54999']");
    }

    public WebElement choosenPhoneClick() {
        return $("//a[contains(text(),'Apple iPhone 13 Pro 512GB Graphite (MLVH3)')]");
    }

    public WebElement nextPhonePrice() {
        return $("//div[@data-price='54999']");
    }

    public WebElement productNameTitel() {
        return $("//h1[contains(text(),'Apple iPhone 13 Pro 512GB Graphite (MLVH3)')]");
    }
}