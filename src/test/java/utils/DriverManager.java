package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import properties.Properties;

public class DriverManager {
    private static WebDriver driver = null;
    private static DriverManager instance = null;
    private static final String FIREFOX = "Firefox";
    private static final String CHROME = "Chrome";

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
        if(Properties.browserType.equals(FIREFOX)) {
            if (driver == null) {
                System.setProperty("webdriver.gecko.driver", Properties.GECKO_PATH);
//                FirefoxProfile profile = new FirefoxProfile();
//                profile.setPreference("network.proxy.type", 1);
//                profile.setPreference("network.proxy.socks", "avproxy");
//                profile.setPreference("network.proxy.socks_port", 8080);
                driver= new FirefoxDriver();
            }
        }
        else if (Properties.browserType.equals(CHROME)){
            if (driver == null) {
                System.setProperty("webdriver.chrome.driver", Properties.CHROMEDRIVER_PATH);
//                driver=new ChromeDriver();
            }
        }
    }

}