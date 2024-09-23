import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private final WebDriver webDriver;

    private final String url = "https://qa-scooter.praktikum-services.ru/";

    private final By accordionItemHeading = By.xpath("//*[@id=\"accordion__heading-0\"]");
    private final By accordionItemPanel = By.xpath("//*[@id=\"accordion__panel-0\"]");
    private final By accordionItemPanelText = By.xpath("//*[@id=\"accordion__panel-0\"]");

    HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open() {
        webDriver.get(url);
    }

    public void scrollToAccordion() {
        WebElement element = webDriver.findElement(accordionItemHeading);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickAccordionItem() {
        webDriver.findElement(accordionItemHeading).click();
    }

}
