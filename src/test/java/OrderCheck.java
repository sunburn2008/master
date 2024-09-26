import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class OrderCheck {
    WebDriver webDriver;

    private final String name;
    private final String surname;
    private final String adress;
    private final String phoneNumber;
    private final String commentForTheCourier;

    public OrderCheck(String name, String surname, String address, String phoneNumber, String commentForTheCourier) {
        this.name = name;
        this.surname = surname;
        this.adress = address;
        this.phoneNumber = phoneNumber;
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
                {ConstantsForTests.userName_1,
                        ConstantsForTests.userSurname_1,
                        ConstantsForTests.userAddress_1,
                        ConstantsForTests.userPhoneNumber_1,
                        ConstantsForTests.commentForTheCourier_1,},

                {ConstantsForTests.userName_2,
                        ConstantsForTests.userSurname_2,
                        ConstantsForTests.userAddress_2,
                        ConstantsForTests.userPhoneNumber_2,
                        ConstantsForTests.commentForTheCourier_2,},
        };
    }

    @Test
    public void orderTest() {
        HomePage homePage = new HomePage(webDriver);
        OrderPages orderPages = new OrderPages(webDriver);

        homePage.open();
        orderPages.findCookiesField();
        orderPages.clickToOrderButtonOnMainPage();
        orderPages.sendValueToFirstName(name);
        orderPages.sendValueToSurname(surname);
        orderPages.sendValueToAddress(adress);
        orderPages.clickToMetroStationField();
        orderPages.clickToMetroStationValue();
        orderPages.sendValueToPhoneNumber(phoneNumber);
        orderPages.clickToNextButton();
        orderPages.clickToCalendarField();
        orderPages.clickToDeliveryDateValue();
        orderPages.clickToRentalPeriodField();
        orderPages.clickToRentalPeriodValue();
        orderPages.clickToColorBlack();
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
