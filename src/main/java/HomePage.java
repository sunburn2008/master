import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private final WebDriver webDriver;

    public static final By accordionQuestion1 = By.xpath("//div[@id='accordion__heading-0']");
    public static final By accordionQuestion2 = By.xpath("//div[@id='accordion__heading-1']");
    public static final By accordionQuestion3 = By.xpath("//div[@id='accordion__heading-2']");
    public static final By accordionQuestion4 = By.xpath("//div[@id='accordion__heading-3']");
    public static final By accordionQuestion5 = By.xpath("//div[@id='accordion__heading-4']");
    public static final By accordionQuestion6 = By.xpath("//div[@id='accordion__heading-5']");
    public static final By accordionQuestion7 = By.xpath("//div[@id='accordion__heading-6']");
    public static final By accordionQuestion8 = By.xpath("//div[@id='accordion__heading-7']");

    public static final By accordionAnswer1 = By.xpath("//*[@id='accordion__panel-0']/p");
    public static final By accordionAnswer2 = By.xpath("//*[@id='accordion__panel-1']/p");
    public static final By accordionAnswer3 = By.xpath("//*[@id='accordion__panel-2']/p");
    public static final By accordionAnswer4 = By.xpath("//*[@id='accordion__panel-3']/p");
    public static final By accordionAnswer5 = By.xpath("//*[@id='accordion__panel-4']/p");
    public static final By accordionAnswer6 = By.xpath("//*[@id='accordion__panel-5']/p");
    public static final By accordionAnswer7 = By.xpath("//*[@id='accordion__panel-6']/p");
    public static final By accordionAnswer8 = By.xpath("//*[@id='accordion__panel-7']/p");

    public static final String EXPECTED_ANSWER_1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static final String EXPECTED_ANSWER_2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static final String EXPECTED_ANSWER_3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static final String EXPECTED_ANSWER_4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static final String EXPECTED_ANSWER_5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static final String EXPECTED_ANSWER_6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static final String EXPECTED_ANSWER_7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static final String EXPECTED_ANSWER_8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    private final String url = "https://qa-scooter.praktikum-services.ru/";

    HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open() {
        webDriver.get(url);
    }

    public void scrollToAccordion(By questionLocator) {
        WebElement element = webDriver.findElement(questionLocator);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickAccordionItem(By questionLocator) {
        webDriver.findElement(questionLocator).click();
    }

    public String getActualAnswer(By answerLockator) {
        return webDriver.findElement(answerLockator).getText();
    }

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
    public static final By CommentForTheCourier = By.xpath(".//input[contains(@placeholder,'Комментарий для курьера')]");
    public static final By orderButtonOnSecondPage = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public static final By yesButton = By.xpath(".//button[contains(text(),'Да')]");
    public static final By orderHasPlaced = By.xpath(".//div[contains(text(),'Заказ оформлен')]");

    public void clickToOrderButtonOnMainPage() {
        webDriver.findElement(orderButtonOnMainPage).click();
    }

    public void sendValueToFirstName() {
        webDriver.findElement(FirstName).sendKeys("Михуил");
    }

    public void sendValueToSurname() {
        webDriver.findElement(Surname).sendKeys("Михуил");
    }

    public void sendValueToAddress() {
        webDriver.findElement(address).sendKeys("");
    }

    public void clickToMetroStationField() {
        webDriver.findElement(metroStationField).click();
    }
    public void clickToMetroStationValue() {
        webDriver.findElement(metroStationValue).click();
    }

    public void clickToPhoneNumber() {
        webDriver.findElement(phoneNumber).click();
    }

}