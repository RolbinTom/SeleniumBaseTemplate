package selenium.core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeWebDriver extends WebDriverManager {
    private static final String KEY = "webdriver.chrome.driver";
    private static ChromeWebDriver instance;

    private ChromeWebDriver() {}

    public static ChromeWebDriver getInstance() {
        if(instance == null){
            instance = new ChromeWebDriver();
        }
        return instance;
    }

    @Override
    protected String getKey() {
        return KEY;
    }

    @Override
    protected String getDriverName() {
        return "chromedriver77.exe";
    }

    @Override
    void createWebDriver() {
        ChromeOptions options = new ChromeOptions();
        webDriver = new ChromeDriver(options);
    }

}
