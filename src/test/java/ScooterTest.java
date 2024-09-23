import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScooterTest {
    WebDriver webDriver;

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        webDriver = new ChromeDriver(options);
    }

    @Test
    public void checkValueItemPanel() {
        HomePage homePage = new HomePage(webDriver);

        homePage.open();
        homePage.scrollToAccordion();
        homePage.clickAccordionItem();
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }
}

