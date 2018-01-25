package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;
import page.*;


public class GoToSiliconPageAndCheckValidationErrorTest2 {

    private WebDriver driver;

    @Before
    public void setup() {
        driver = DriverManager.getDriver();
    }

    @Test
    public void checkValidationOnSilicon2() {
        HomePage homePage = new HomePage();
        homePage.moveToContactUsAndClickIt();
        ContactPage contactPage = new ContactPage();
        contactPage.moveToCommentTextFieldClickAndEnterSomeText();
        contactPage.scrollDown();
        contactPage.closeCookieInfo();
        contactPage.moveToSendButtonAndClick();
//        contactPage.checkValidationError();
    }

    @After
    public void afterTest() {
        driver.quit();
    }

}
