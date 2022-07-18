package YevheniiBondarenko.Tests.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class MansShoesItemPage extends BasePage {
    public MansShoesItemPage(WebDriver driver) {
        super(driver);
    }

    public  static final String  MANS_SHOES_BRANDS_LIST = "//li[@style='display: list-item;']";
    public static final  String  PAOUL_DANCE_BRAND = "//label[@id='lblbrand9']";
    public static final  String  SUPADANCE = "//label[@id='lblbrand11']";
    public static final  String  RAYROSE = "//label[@id='lblbrand10']";
    public static final  String  SHOES_SIZE = "//li[@class='sizelist'][@style='display: list-item;']";
    public static final  String  SIZE_125 = "//label[contains(@class,'zhuangtai ')][contains(@id,'lblsize11')]";
    public static final  String  SIZE_115 = "//label[contains(@class,'zhuangtai ')][contains(@id,'lblsize5')]";
    public static final  String  COLOR_LIST = "//li[@class='colorlist']";
    public static final  String  MAN_SHOES_BLACK = "//span[contains(@id,'color2')]";
    public static final  String  MAN_SHOES_SUPADANCE = "//span[text()='Supadance 8508-Black Patent/Suede']";
    public static final  String  CONFORM_SIZE = "//span[@id='valMsgSize']";
    public static final  String  FOOT_SIZE = "//div[@data-value='UK 10']";
    public static final String MEN = "//ul[contains(@class,'navs')]//li[contains(text(),'Men')]";
    public static final String MENS_BALLROOM_SHOES = "//div[@class='item']//a[text()='Ballroom Dance Shoes']";



    public WebElement mansShoesBrands(){
        return $(MANS_SHOES_BRANDS_LIST);
    }
    public WebElement paoulShoesBrand(){
        return $(PAOUL_DANCE_BRAND);
    }
    public WebElement supadanceShoesBrand(){
        return $(SUPADANCE);
    }
    public WebElement reyroseShoesBrand(){
        return $(RAYROSE);
    }
    public WebElement shoesSize(){
        return $(SHOES_SIZE);
    }
    public WebElement size125(){
        return $(SIZE_125);
    }
    public WebElement size115(){
        return $(SIZE_115);
    }
    public WebElement colorList(){
        return $(COLOR_LIST);
    }
    public WebElement manShoesBlack(){
        return $(MAN_SHOES_BLACK);
    }
    public WebElement shoesSupadance(){
        return $(MAN_SHOES_SUPADANCE);
    }
    public WebElement conformSize(){
        return $(CONFORM_SIZE);
    }
    public WebElement footSize(){
        return $(FOOT_SIZE);
    }

    public WebElement shoesModelNumber() { return $("//h1[@id='pname']");
    }

    public WebElement shoesPrice() { return $("//span[@class='price_first']");
    }

    public List<WebElement> listOfSize() {
        return $$("//span[@style='width: 42px;']");
    }

    public List<WebElement> getBtnsChecked() {
        return $$("//input[@checked]");
    }
    public WebElement goToManClothes(){
        return $(MEN);
    }
    public WebElement mansBallroomShoes(){
        return $(MENS_BALLROOM_SHOES);
    }
}