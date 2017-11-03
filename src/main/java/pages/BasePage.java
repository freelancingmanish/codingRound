package pages;
import org.openqa.selenium.WebDriver;

import static utils.DriverManager.getDriver;


class BasePage {

    WebDriver driver;

    BasePage() {
        this.driver = getDriver();
    }

    static void sleepInSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
