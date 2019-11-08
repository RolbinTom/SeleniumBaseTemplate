package selenium.core;

import selenium.WebDriverType;

public class WebDriverFactory {

    public static WebDriverManager getDriverManager(WebDriverType driverType) {
        switch (driverType) {
            case CHROME:
                return ChromeWebDriver.getInstance();
            case FIREFOX:
            default:
                return ChromeWebDriver.getInstance();
        }
    }
}
