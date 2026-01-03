package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.example.*;
public abstract class BaseTest {

    protected static WebDriver webDriver;
    protected  static final String BASE_URL = "https://imtec.ba/";
    protected JavascriptExecutor js = (JavascriptExecutor) webDriver;

    @BeforeAll
    static void setup() {
        webDriver = WebDriverProvider.createDriver();
    }

    @AfterAll
    static void tearDown() {
        if (webDriver != null) webDriver.quit();
    }


}