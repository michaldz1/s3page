package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.ContactPage;
import page.HomePage;
import utils.DriverManager;
import properties.PropertiesManager;

import java.io.IOException;

/**
 * Created by michald on 17/12/2017.
 */
public class GoToSiliconPageAndCheckValidationErrorTest1 {

    private WebDriver driver;

    @Before
    public void setup() {
        driver = DriverManager.getDriver();
    }

    @Test
    public void checkValidationOnSilicon1() {
        HomePage homePage = new HomePage();
        homePage
                .moveToContactUsAndClickIt()
                .moveToCommentTextFieldClickAndEnterSomeText()
                .closeCookieInfo()
                .moveToSendButtonAndClick()
                .checkValidationError();
    }

    @After
    public void afterTest() {
        driver.quit();
    }

}
