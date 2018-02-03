package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.DriverAction;
import utils.DriverManager;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static properties.Properties.S3_URL;

public class HomePage extends Page {

    private WebDriver driver;
    private Actions action;
    @FindBy(css = "a.btn.btn-red.btn-contact")
    private WebElement contactUs;

    public HomePage() {
        this.driver = DriverManager.getDriver();
        this.action = DriverAction.getAction();
        PageFactory.initElements(driver,this);
        driver.get(S3_URL);
    }

    public ContactPage clickContactUs() {
    contactUs.click();
    return new ContactPage();
    }

}
