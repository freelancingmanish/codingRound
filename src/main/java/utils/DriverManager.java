package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static utils.SeleniumUtils.setDriverPath;


public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            setDriverPath();
            driver = new ChromeDriver();
        }
        return driver;
    }
}
