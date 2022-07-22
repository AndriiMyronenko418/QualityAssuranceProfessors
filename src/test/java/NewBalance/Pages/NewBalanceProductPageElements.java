package NewBalance.Pages;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewBalanceProductPageElements extends BasePage {

    public NewBalanceProductPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String COLOR_LABEL = "//span[@class='product-info-control__label-val']";
    private static final String SHOE_SIZE_VALUE = "//span[@class='js-inner-content'][contains(text(),'%s')]";
    private static final String FILTER_COLOR_OF_PRODUCT = "//label[@for='colorId%s']";
    private static final String MIN_OR_MAX_PRISE_FIELD = "//input[@id='amount_%s']";
    private static final String NAME_OF_GOODS = "//li[@data-name='%s']";
    private static final String SIZE_OF_THIS_SHOE_USA = "//button[@data-us='%s']";
    private static final String ADD_TO_CART = "//button[text()='Додати у кошик']";
    private static final String TO_ORDER_BTN = "//a[text()='Оформити замовлення']";
    private static final String CHOOSE_DELIVERY_METHOD = "//button[contains(text(),'Обрати спосіб доставки')]";

    public WebElement colorLabel() {
        return $(COLOR_LABEL);
    }

    public WebElement shoeSizeValue(String sizeOfShoe) {
        return $(String.format(SHOE_SIZE_VALUE, sizeOfShoe));
    }

    public WebElement chooseColorOfProduct(String productColor) {
        return $(String.format(FILTER_COLOR_OF_PRODUCT, productColor));
    }

    public WebElement choosePriceFieldMinOrmAx(String minOrMaxPrise) {
        return $(String.format(MIN_OR_MAX_PRISE_FIELD, minOrMaxPrise));
    }

    public WebElement getNameOfGoods(String nameOfGoods) {
        return $(String.format(NAME_OF_GOODS, nameOfGoods));
    }

    public WebElement getConcreteSizeOfShoeInUSA(String shoeSizeInUSA) {
        return $(String.format(SIZE_OF_THIS_SHOE_USA, shoeSizeInUSA));
    }

    public WebElement getSomethingToCart() {
        return $(ADD_TO_CART);
    }

    public WebElement toOrder() {
        return $(TO_ORDER_BTN);
    }

    public WebElement chooseDeliveryMethod() {
        return $(CHOOSE_DELIVERY_METHOD);
    }
}