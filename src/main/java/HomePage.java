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
//    public static final By accordionItemPanel2 = By.xpath("//div[@id='accordion__heading-1']");
//    public static final By accordionItemPanel3 = By.xpath("//div[@id='accordion__heading-2']");
//    public static final By accordionItemPanel4 = By.xpath("//div[@id='accordion__heading-3']");
//    public static final By accordionItemPanel5 = By.xpath("//div[@id='accordion__heading-4']");
//    public static final By accordionItemPanel6 = By.xpath("//div[@id='accordion__heading-5']");
//    public static final By accordionItemPanel7 = By.xpath("//div[@id='accordion__heading-6']");
//    public static final By accordionItemPanel8 = By.xpath("//div[@id='accordion__heading-7']");

    public static final String EXPECTED_ANSWER_1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static final String EXPECTED_ANSWER_2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static final String EXPECTED_ANSWER_3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static final String EXPECTED_ANSWER_4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static final String EXPECTED_ANSWER_5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static final String EXPECTED_ANSWER_6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static final String EXPECTED_ANSWER_7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static final String EXPECTED_ANSWER_8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    private final String url = "https://qa-scooter.praktikum-services.ru/";
    private final By accordionItemHeading = By.xpath("//*[@id=\"accordion__heading-0\"]");

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

}