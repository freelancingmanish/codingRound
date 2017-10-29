package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static utils.SeleniumUtils.setDriverPath;


public class DriverManager {



    WebDriver driver;

    public   void getDriver(){
        if(driver==null){
            setDriverPath();
            driver = new ChromeDriver();
        }

    }
}
