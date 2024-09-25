import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;

public class OrderCheck {

    WebDriver webDriver;

@Before
public void setup() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        webDriver = new FirefoxDriver();
}

@Test
public void orderTest() {
    HomePage homePage = new HomePage(webDriver);
    OrderPages orderPages = new OrderPages(webDriver);

    homePage.open();
    orderPages.clickToOrderButtonOnMainPage();
    orderPages.sendValueToFirstName();
    orderPages.sendValueToSurname();
    orderPages.sendValueToAddress();
    orderPages.clickToMetroStationField();
    orderPages.clickToMetroStationValue();
    orderPages.sendValueToPhoneNumber();
    orderPages.clickToNextButton();
    orderPages.clickToCalendarField();
    orderPages.clickToDeliveryDateValue();
    orderPages.clickToRentalPeriodField();
    orderPages.clickToRentalPeriodValue();
    orderPages.clickToColorBlack();
    orderPages.sendValueToCommentForTheCourier();
    orderPages.clickToOrderButtonOnSecondPage();
    orderPages.clickToyesButton();
}


@After
public void tearDown() {
    webDriver.quit();
}
}
