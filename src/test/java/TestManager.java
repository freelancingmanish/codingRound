import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static utils.DriverManager.getDriver;


public class TestManager {

    @BeforeTest
    public void setup() {
        WebDriver driver = getDriver();
        driver.get("https://www.cleartrip.com/");
    }

    @AfterTest
    public void tearDown() {
        getDriver().quit();
    }
}
