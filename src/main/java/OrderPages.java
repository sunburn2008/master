import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPages {

    WebDriver webDriver;

    public static final By orderButtonOnMainPageTop = By.xpath(".//button[@class='Button_Button__ra12g']");
    public static final By orderButtonOnMainPageBottom = By.xpath(".//button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']");
    public static final By FirstName = By.xpath(".//input[contains(@placeholder,'* Имя')]");
    public static final By Surname = By.xpath(".//input[contains(@placeholder,'* Фамилия')]");
    public static final By addressField = By.xpath(".//input[contains(@placeholder,'* Адрес: куда привезти заказ')]");
    public static final By colorGreyCheckBox = By.xpath(".//label[@for='grey']");
    public static final By colorBlackCheckBox = By.xpath(".//label[@for='black']");
    public static final By metroStationField = By.xpath(".//input[contains(@placeholder,'* Станция метро')]");
    public static final By metroStationLubyanka = By.xpath(".//div[contains(text(),'Лубянка')]");
    public static final By metroStationTrubnaya = By.xpath(".//div[contains(text(),'Трубная')]");
    public static final By phoneNumberLocator = By.xpath(".//input[contains(@placeholder,'* Телефон: на него позвонит курьер')]");
    public static final By nextButton = By.xpath(".//button[contains(text(),'Далее')]");
    public static final By calendarField = By.xpath(".//input[contains(@placeholder,'* Когда привезти самокат')]");
    public static final By deliveryDateValue_20 = By.xpath(".//div[@class='react-datepicker__day react-datepicker__day--020']");
    public static final By deliveryDateValue_02 = By.xpath(".//div[@class='react-datepicker__day react-datepicker__day--002']");
    public static final By rentalPeriodField = By.xpath(".//div[@class='Dropdown-control']");
    public static final By rentalPeriodValue_5 = By.xpath(".//div[contains(text(),'пятеро суток')]");
    public static final By rentalPeriodValue_1 = By.xpath(".//div[contains(text(),'сутки')]");
    public static final By commentForTheCourierLocator = By.xpath(".//input[contains(@placeholder,'Комментарий для курьера')]");
    public static final By orderButtonOnSecondPage = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public static final By yesButton = By.xpath(".//button[contains(text(),'Да')]");
    public static final By orderHasPlaced = By.xpath(".//div[contains(text(),'Заказ оформлен')]");
    public static final By cookiesField = By.xpath(".//div[contains(text(),'И здесь куки! В общем, мы их используем.')]");
    public static final By cookiesCloseButton = By.xpath(".//button[contains(text(),'да все привыкли')]");

    OrderPages(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickToOrderButtonOnMainPage(By orderButtonOnMainPage) {
        webDriver.findElement(orderButtonOnMainPage).click();
    }

    public void sendValueToFirstName(String name) {
        webDriver.findElement(FirstName).sendKeys(name);
    }

    public void sendValueToSurname(String surname) {
        webDriver.findElement(Surname).sendKeys(surname);
    }

    public void sendValueToAddress(String address) {
        webDriver.findElement(addressField).sendKeys(address);
    }

    public void clickToMetroStationField() {
        webDriver.findElement(metroStationField).click();
    }

    public void clickToMetroStationValue(By metroStationValue) {
        webDriver.findElement(metroStationValue).click();
    }

    public void sendValueToPhoneNumber(String phoneNumber) {
        webDriver.findElement(phoneNumberLocator).sendKeys(phoneNumber);
    }

    public void clickToNextButton() {
        webDriver.findElement(nextButton).click();
    }

    public void clickToCalendarField() {
        webDriver.findElement(calendarField).click();
    }

    public void clickToDeliveryDateValue(By deliveryDateValue) {
        webDriver.findElement(deliveryDateValue).click();
    }

    public void clickToRentalPeriodField() {
        webDriver.findElement(rentalPeriodField).click();
    }

    public void clickToRentalPeriodValue(By rentalPeriodValue) {
        webDriver.findElement(rentalPeriodValue).click();
    }

    public void clickToColor(By color) {
        webDriver.findElement(color).click();
    }

    public void sendValueToCommentForTheCourier(String commentForTheCourier) {
        webDriver.findElement(commentForTheCourierLocator).sendKeys(commentForTheCourier);
    }

    public void clickToOrderButtonOnSecondPage() {
        webDriver.findElement(orderButtonOnSecondPage).click();
    }

    public void clickToyesButton() {
        webDriver.findElement(yesButton).click();
    }

    public void findCookiesField() {
        if (webDriver.findElement(cookiesField).isDisplayed()) {
            webDriver.findElement(cookiesCloseButton).click();
        }
    }

//    public void scrollPageFromBottomButton(By orderButtonOnMainPage) {
//        if (!webDriver.findElement(orderButtonOnMainPageBottom).isDisplayed()) {
//            WebElement element = webDriver.findElement(orderButtonOnMainPageBottom);
//            ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
//        } else {
//            clickToOrderButtonOnMainPage(orderButtonOnMainPage);
//        }
//    }
}
