package IraKaminska.Amazon.PagesAmazon;

import BasePageAndTestInit.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerServicePage extends BasePage {

    public CustomerServicePage(WebDriver driver) {
        super(driver);
    }

    private static final String DELIVERY_ORDER_RETURN = "//div[text()= 'A delivery, order or return']";
    private static final String PRIME_BUTTON = "//div[text()= 'Prime']";
    private static final String PAYMENT_CHARGES_GIFTS_CARDS = "//div[text()= 'Payment, charges or gift cards']";
    private static final String LOGIN_ADDRESS_SECURITY = "//div[text()= 'Login, address, security & privacy']";
    private static final String MEMBERSHIPS_SUBSCRIPTIONS = "//div[text()= 'Memberships, subscriptions or communications']";
    private static final String KINDLE_FIRE_ALEXA_DEVICE = "//div[text()= 'Kindle, Fire or Alexa device']";
    private static final String EBOOKS_PRIME_VIDEOS_MUSIC = "//div[text()= 'eBooks, Prime Videos or Music']";
    private static final String ACCESSIBILITY = "//div[text()= 'Accessibility']";
    private static final String SOMETHING_ELSE = "//div[text()= 'Something else']";
    private static final String WELCOME_TO_CUSTOMER_SERVICE = "//h1[@class='fs-heading bolded']";

    public WebElement getDeliveryOrderReturnBtn() {
        return $(DELIVERY_ORDER_RETURN);
    }

    public WebElement getPrimeButton() {
        return $(PRIME_BUTTON);
    }

    public WebElement getPaymentChargesGiftsCardBtn() {
        return $(PAYMENT_CHARGES_GIFTS_CARDS);
    }

    public WebElement getLoginAddressSecurityBtn() {
        return $(LOGIN_ADDRESS_SECURITY);
    }

    public WebElement getMembershipsSubscriptionsBtn() {
        return $(MEMBERSHIPS_SUBSCRIPTIONS);
    }

    public WebElement getKindleFifeButton() {
        return $(KINDLE_FIRE_ALEXA_DEVICE);
    }

    public WebElement getEBooksPrimeVideosMusicsBtn() {
        return $(EBOOKS_PRIME_VIDEOS_MUSIC);
    }

    public WebElement getAccessibilityButton() {
        return $(ACCESSIBILITY);
    }

    public WebElement getSomethingElseButton() {
        return $(SOMETHING_ELSE);
    }

    public WebElement checkCustomerServicePage() {
        return $(WELCOME_TO_CUSTOMER_SERVICE);
    }
}