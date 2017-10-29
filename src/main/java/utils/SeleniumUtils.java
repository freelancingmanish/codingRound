package utils;
import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


public class SeleniumUtils {

    private static WebDriver driver;

    public static void setDriverPath(String browser) {
        String key = "webdriver.chrome.driver";

        if (PlatformUtil.isMac()) {
            System.setProperty(key, "chromedriver");
        } else if (PlatformUtil.isWindows()) {
            System.setProperty(key, "chromedriver.exe");
        } else if (PlatformUtil.isLinux()) {
            System.setProperty(key, "chromedriver_linux");
        }
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
