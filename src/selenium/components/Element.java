package selenium.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.ByType;

public class Element {

    private static WebElement getWebElement(WebDriver driver, ByType byType, String byValue) {
        WebElement element;
        switch (byType) {
            case ID:
                element = driver.findElement(By.id(byValue));
                break;
            case NAME:
                element = driver.findElement(By.name(byValue));
                break;
            case CLASS_NAME:
                element = driver.findElement(By.className(byValue));
                break;
            case CSS_SELECTOR:
                element = driver.findElement(By.cssSelector(byValue));
                break;
            case XPATH:
            default:
                element = driver.findElement(By.xpath(byValue));
                break;
        }
        return element;
    }

    public static void executeClick(WebDriver driver, ByType byType, String byValue) {
        WebElement element = getWebElement(driver, byType, byValue);
        element.click();
    }

    public static void executeSend(WebDriver driver, ByType byType, String byValue, String text) {
        WebElement element = getWebElement(driver, byType, byValue);
        element.sendKeys(text);
    }
}
