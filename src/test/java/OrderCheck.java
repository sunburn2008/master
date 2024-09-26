import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class OrderCheck {
    WebDriver webDriver;

    private final By orderButtonOnMainPage;
    private final String name;
    private final String surname;
    private final String address;
    private final By metroStationValue;
    private final String phoneNumber;
    private final By deliveryDateValue;
    private final By rentalPeriodValue;
    private final By color;
    private final String commentForTheCourier;

    public OrderCheck(By orderButtonOnMainPage, String name, String surname, String address, By metroStationValue,
                      String phoneNumber, By deliveryDateValue, By rentalPeriodValue, By color, String commentForTheCourier) {
        this.orderButtonOnMainPage = orderButtonOnMainPage;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metroStationValue = metroStationValue;
        this.phoneNumber = phoneNumber;
        this.deliveryDateValue = deliveryDateValue;
        this.rentalPeriodValue = rentalPeriodValue;
        this.color = color;
        this.commentForTheCourier = commentForTheCourier;
    }

    @Before
    public void setup() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        webDriver = new FirefoxDriver();
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][]{
                {OrderPages.orderButtonOnMainPageTop,
                        ConstantsForTests.userName_1,
                        ConstantsForTests.userSurname_1,
                        ConstantsForTests.userAddress_1,
                        OrderPages.metroStationLubyanka,
                        ConstantsForTests.userPhoneNumber_1,
                        OrderPages.deliveryDateValue_20,
                        OrderPages.rentalPeriodValue_5,
                        OrderPages.colorBlackCheckBox,
                        ConstantsForTests.commentForTheCourier_1,},

                {OrderPages.orderButtonOnMainPageBottom,
                        ConstantsForTests.userName_2,
                        ConstantsForTests.userSurname_2,
                        ConstantsForTests.userAddress_2,
                        OrderPages.metroStationTrubnaya,
                        ConstantsForTests.userPhoneNumber_2,
                        OrderPages.deliveryDateValue_02,
                        OrderPages.rentalPeriodValue_1,
                        OrderPages.colorGreyCheckBox,
                        ConstantsForTests.commentForTheCourier_2,},
        };
    }

    @Test
    public void OrderTest() {
        HomePage homePage = new HomePage(webDriver);
        OrderPages orderPages = new OrderPages(webDriver);

        homePage.open();
        orderPages.findCookiesField();
        orderPages.clickToOrderButtonOnMainPage(orderButtonOnMainPage);
        orderPages.sendValueToFirstName(name);
        orderPages.sendValueToSurname(surname);
        orderPages.sendValueToAddress(address);
        orderPages.clickToMetroStationField();
        orderPages.clickToMetroStationValue(metroStationValue);
        orderPages.sendValueToPhoneNumber(phoneNumber);
        orderPages.clickToNextButton();
        orderPages.clickToCalendarField();
        orderPages.clickToDeliveryDateValue(deliveryDateValue);
        orderPages.clickToRentalPeriodField();
        orderPages.clickToRentalPeriodValue(rentalPeriodValue);
        orderPages.clickToColor(color);
        orderPages.sendValueToCommentForTheCourier(commentForTheCourier);
        orderPages.clickToOrderButtonOnSecondPage();
        orderPages.clickToyesButton();
        assertTrue("Не появилось всплывающее окно с сообщением об успешном создании заказа",
                webDriver.findElement(OrderPages.orderHasPlaced).isDisplayed());
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }
}
