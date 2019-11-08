package suit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import selenium.ByType;
import selenium.components.Element;

public class SampleTestCase extends BaseTest{

    @Override
    public void execute() {
        webDriver.get("https://www.google.com/");
        Element.executeSend(webDriver, ByType.XPATH, "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input", "Fernando Torres");
        Element.executeClick(webDriver, ByType.XPATH, "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]");
    }

    @Test(priority = 1)
    public void loadImageTab() {
        Element.executeClick(webDriver, ByType.XPATH, "//*[@id=\"hdtb-msb-vis\"]/div[3]/a");
        delay(2);
    }
}
