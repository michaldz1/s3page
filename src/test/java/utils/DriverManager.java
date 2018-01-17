package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import properties.PropertiesManager;

public class DriverManager {
    private static WebDriver driver = null;
    private static DriverManager instance = null;

    private DriverManager() {
    }

    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    public static WebDriver getDriver() {
        DriverManager.getInstance().setupDriver();
        return driver;
    }

    private void setupDriver() {

        //wiecej niz jeden driver (chrome), powinno działać na propertiesach
        if (driver == null) {
//            System.setProperty("webdriver.gecko.driver", "C:\\Users\\michald\\michalSelenium\\geckodriver.exe");
//            PropertiesManager.setProperty("GECKO_PATH", "C:\\Users\\michald\\michalSelenium\\geckodriver.exe");
//            PropertiesManager.setProperty();
            System.out.print(PropertiesManager.getProperty("GECKO_PATH"));
            System.setProperty("webdriver.gecko.driver", PropertiesManager.getProperty("GECKO_PATH"));

            driver = new FirefoxDriver();
        }
    }

}