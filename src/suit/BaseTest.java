package suit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import selenium.WebDriverType;
import selenium.core.WebDriverFactory;
import selenium.core.WebDriverManager;

public abstract class BaseTest {
    private WebDriverManager mWebDriverManager;
    WebDriver webDriver;

    @BeforeClass
    public void startDriver(){
        mWebDriverManager = WebDriverFactory.getDriverManager(WebDriverType.CHROME);
        webDriver = mWebDriverManager.getWebDriver();
    }

    @Test
    public abstract void execute();

    protected void stopDriver(){
        mWebDriverManager.stopWebDriver();
    }

    protected void delay(long seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
