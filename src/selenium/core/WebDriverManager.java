package selenium.core;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverManager {
    private static final String BASE_PATH = "C:\\Rolbin\\Selenium\\seleniumLibs\\driver\\";
    WebDriver webDriver;

    WebDriverManager() {
        System.setProperty(getKey(), BASE_PATH + getDriverName());
    }

    protected abstract String getKey();

    protected abstract String getDriverName();

    abstract void createWebDriver();

    public WebDriver getWebDriver() {
        if (webDriver == null) {
            createWebDriver();
        }
        return webDriver;
    }

    public void stopWebDriver() {
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }

}
