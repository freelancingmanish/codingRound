package utils;
import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


public class SeleniumUtils {

    private static WebDriver driver;

    public static void setDriverPath() {
        String chromeKey = "webdriver.chrome.driver";

        if (PlatformUtil.isMac()) {
            setSystemProperty(chromeKey, "drivers/chromedriver");
        } else if (PlatformUtil.isWindows()) {
            setSystemProperty(chromeKey, "drivers/chromedriver.exe");
        } else if (PlatformUtil.isLinux()) {
            setSystemProperty(chromeKey, "drivers/chromedriver_linux");
        }
    }

    private static void setSystemProperty(String key, String chromedriver) {
        System.setProperty(key, chromedriver);
    }

    public static void waitFor(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
