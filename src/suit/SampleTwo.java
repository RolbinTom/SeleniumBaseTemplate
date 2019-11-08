package suit;

import org.testng.annotations.AfterClass;
import selenium.ByType;
import selenium.components.Element;

public class SampleTwo extends BaseTest {


    @Override
    public void execute() {
        webDriver.get("https://www.google.com/");
        Element.executeSend(webDriver, ByType.XPATH, "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input", "Fernando Torres");
        Element.executeClick(webDriver, ByType.XPATH, "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]");
    }

    @AfterClass
    @Override
    protected void stopDriver() {
        super.stopDriver();
    }

}
