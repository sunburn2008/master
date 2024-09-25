import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ScooterTest {
    WebDriver webDriver;
    private final String expectedResult;
    private final By answerLocator;
    private final By questionLocator;

    @Before
    public void setup() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        webDriver = new FirefoxDriver();
    }

        public ScooterTest(String expectedResult, By answerLocator, By questionLocator) {
        this.expectedResult = expectedResult;
        this.answerLocator = answerLocator;
        this.questionLocator = questionLocator;
        }

    @Parameterized.Parameters
    public static Object[][] Results() {
        return new Object[][] {
                {HomePage.EXPECTED_ANSWER_1, HomePage.accordionAnswer1, HomePage.accordionQuestion1},
                {HomePage.EXPECTED_ANSWER_2, HomePage.accordionAnswer2, HomePage.accordionQuestion2},
                {HomePage.EXPECTED_ANSWER_3, HomePage.accordionAnswer3, HomePage.accordionQuestion3 },
                {HomePage.EXPECTED_ANSWER_4, HomePage.accordionAnswer4, HomePage.accordionQuestion4},
                {HomePage.EXPECTED_ANSWER_5, HomePage.accordionAnswer5, HomePage.accordionQuestion5},
                {HomePage.EXPECTED_ANSWER_6, HomePage.accordionAnswer6, HomePage.accordionQuestion6},
                {HomePage.EXPECTED_ANSWER_7, HomePage.accordionAnswer7, HomePage.accordionQuestion7},
                {HomePage.EXPECTED_ANSWER_8, HomePage.accordionAnswer8, HomePage.accordionQuestion8},
        };
    }

    @Test
    public void checkValueItemPanel() {
        HomePage homePage = new HomePage(webDriver);

        homePage.open();
        homePage.scrollToAccordion(questionLocator);
        homePage.clickAccordionItem(questionLocator);

        assertEquals("Текст в панели аккордеона не соответствует требованию", expectedResult, homePage.getActualAnswer(answerLocator));

    }

    @After
    public void tearDown() {
        webDriver.quit();
    }
}

