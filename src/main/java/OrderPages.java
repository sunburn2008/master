import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPages {

    WebDriver webDriver;

    public static final By orderButtonOnMainPage = By.xpath(".//button[@class='Button_Button__ra12g']");
    public static final By FirstName = By.xpath(".//input[contains(@placeholder,'* Имя')]");
    public static final By Surname = By.xpath(".//input[contains(@placeholder,'* Фамилия')]");
    public static final By adress = By.xpath(".//input[contains(@placeholder,'* Адрес: куда привезти заказ')]");
    public static final By metroStationField = By.xpath(".//input[contains(@placeholder,'* Станция метро')]");
    public static final By metroStationValue = By.xpath(".//div[contains(text(),'Лубянка')]");
    public static final By phoneNumberLocator = By.xpath(".//input[contains(@placeholder,'* Телефон: на него позвонит курьер')]");
    public static final By nextButton = By.xpath(".//button[contains(text(),'Далее')]");
    public static final By calendarField = By.xpath(".//input[contains(@placeholder,'* Когда привезти самокат')]");
    public static final By deliveryDateValue = By.xpath(".//div[@class='react-datepicker__day react-datepicker__day--020']");
    public static final By rentalPeriodField = By.xpath(".//div[@class='Dropdown-control']");
    public static final By rentalPeriodValue = By.xpath(".//div[contains(text(),'пятеро суток')]");
    public static final By colorBlack = By.xpath(".//label[@for='black']");
    public static final By colorGrey = By.xpath(".//label[@for='grey']");
    public static final By commentForTheCourierLocator = By.xpath(".//input[contains(@placeholder,'Комментарий для курьера')]");
    public static final By orderButtonOnSecondPage = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public static final By yesButton = By.xpath(".//button[contains(text(),'Да')]");
    public static final By orderHasPlaced = By.xpath(".//div[contains(text(),'Заказ оформлен')]");
    public static final By cookiesField = By.xpath(".//div[contains(text(),'И здесь куки! В общем, мы их используем.')]");
    public static final By cookiesCloseButton = By.xpath(".//button[contains(text(),'да все привыкли')]");

    OrderPages(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickToOrderButtonOnMainPage() {
        webDriver.findElement(orderButtonOnMainPage).click();
    }

    public void sendValueToFirstName(String name) {
        webDriver.findElement(FirstName).sendKeys(name);
    }

    public void sendValueToSurname(String surname) {
        webDriver.findElement(Surname).sendKeys(surname);
    }

    public void sendValueToAddress(String address) {
        webDriver.findElement(adress).sendKeys(address);
    }

    public void clickToMetroStationField() {
        webDriver.findElement(metroStationField).click();
    }

    public void clickToMetroStationValue() {
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

    public void clickToDeliveryDateValue() {
        webDriver.findElement(deliveryDateValue).click();
    }

    public void clickToRentalPeriodField() {
        webDriver.findElement(rentalPeriodField).click();
    }

    public void clickToRentalPeriodValue() {
        webDriver.findElement(rentalPeriodValue).click();
    }

    public void clickToColorBlack() {
        webDriver.findElement(colorBlack).click();
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
}
