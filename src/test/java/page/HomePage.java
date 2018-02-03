package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utils.DriverAction;
import utils.DriverManager;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static properties.Properties.S3_URL;

public class HomePage extends Page {

    private WebDriver driver;
    private Actions action;
    private static final By CONTACT_US = By.cssSelector("a.btn.btn-red.btn-contact");

    public HomePage() {
        this.driver = DriverManager.getDriver();
        this.action = DriverAction.getAction();
        driver.get(S3_URL);
    }

    public ContactPage moveToContactUsAndClickIt() {
        driver.findElement(CONTACT_US).click();
        return new ContactPage();
    }

}
