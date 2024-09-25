import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrderPages {

    WebDriver webDriver;

    public static final By orderButtonOnMainPage = By.xpath(".//button[@class='Button_Button__ra12g']");
    public static final By FirstName = By.xpath(".//input[contains(@placeholder,'* Имя')]");
    public static final By Surname = By.xpath(".//input[contains(@placeholder,'* Фамилия')]");
    public static final By address = By.xpath(".//input[contains(@placeholder,'* Адрес: куда привезти заказ')]");
    public static final By metroStationField = By.xpath(".//input[contains(@placeholder,'* Станция метро')]");
    public static final By metroStationValue = By.xpath(".//div[contains(text(),'Лубянка')]");
    public static final By phoneNumber = By.xpath(".//input[contains(@placeholder,'* Телефон: на него позвонит курьер')]");
    public static final By nextButton = By.xpath(".//button[contains(text(),'Далее')]");
    public static final By calendarField = By.xpath(".//input[contains(@placeholder,'* Когда привезти самокат')]");
    public static final By deliveryDateValue = By.xpath(".//div[@class='react-datepicker__day react-datepicker__day--020']");
    public static final By rentalPeriodField = By.xpath(".//div[@class='Dropdown-control']");
    public static final By rentalPeriodValue = By.xpath(".//div[contains(text(),'пятеро суток')]");
    public static final By colorBlack = By.xpath(".//label[@for='black']");
    public static final By colorGrey = By.xpath(".//label[@for='grey']");
    public static final By commentForTheCourier = By.xpath(".//input[contains(@placeholder,'Комментарий для курьера')]");
    public static final By orderButtonOnSecondPage = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public static final By yesButton = By.xpath(".//button[contains(text(),'Да')]");
    public static final By orderHasPlaced = By.xpath(".//div[contains(text(),'Заказ оформлен')]");

    OrderPages(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickToOrderButtonOnMainPage() {
        webDriver.findElement(orderButtonOnMainPage).click();
    }
    public void sendValueToFirstName() {
        webDriver.findElement(FirstName).sendKeys("Михуил");
    }
    public void sendValueToSurname() {
        webDriver.findElement(Surname).sendKeys("Захаров");
    }
    public void sendValueToAddress() {
        webDriver.findElement(address).sendKeys("ул. Пушкина, д.5");
    }
    public void clickToMetroStationField() {
        webDriver.findElement(metroStationField).click();
    }
    public void clickToMetroStationValue() {
        webDriver.findElement(metroStationValue).click();
    }
    public void sendValueToPhoneNumber() {
        webDriver.findElement(phoneNumber).sendKeys("+74959379992");
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
    public void sendValueToCommentForTheCourier() {
        webDriver.findElement(commentForTheCourier).sendKeys("Шире шаг!");
    }
    public void clickToOrderButtonOnSecondPage() {
        webDriver.findElement(orderButtonOnSecondPage).click();
    }
    public void clickToyesButton() {
        webDriver.findElement(yesButton).click();
    }
}
