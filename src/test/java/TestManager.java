import org.testng.annotations.AfterTest;

import static utils.DriverManager.getDriver;


public class TestManager {

    @AfterTest
    public void setup() {

        getDriver().quit();
    }
}
