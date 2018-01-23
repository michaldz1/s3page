package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import properties.Properties;
import utils.DriverAction;
import utils.DriverManager;

import static properties.Properties.S3_URL;

public class HomePage extends Page {

    private WebDriver driver;
    private Actions action;


    public HomePage() {
        this.driver = DriverManager.getDriver();
        this.action = DriverAction.getAction();
        driver.get(S3_URL);
    }

    private static final By CONTACT_US = By.xpath("//a[@class='btn btn-red btn-contact']");

    public ContactPage moveToContactUsAndClickIt() {
        action
                .moveToElement(driver.findElement(CONTACT_US))
                .click().build()
                .perform();
        return new ContactPage();
    }

}
