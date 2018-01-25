package page;

import org.openqa.selenium.By;
import utils.DriverManager;
import utils.WaitFor;
import utils.Assertion;
import properties.Properties;

// Selectors: xpath and css -> practice knwoledge:
  // S3 Group.com ->> Selectory do kurwa wszystkiego!

public class ContactPage extends Page {
    private static final By COMMENT_TEXT_FIELD = By.id("input_5_1");
    private static final By CLOSE_COOKIE_ACCEPTANCE = By.name("dismiss");
    private static final By SEND_BUTTON = By.id("gform_submit_button_5");


    public ContactPage() {
        this.driver = DriverManager.getDriver();
    }

    //LMGTFY: WebElements - initialization, maybe think about PageFactory
    public page.ContactPage moveToCommentTextFieldClickAndEnterSomeText() {
        WaitFor.webElementVisible(COMMENT_TEXT_FIELD);
        driver
                .findElement(COMMENT_TEXT_FIELD)
                .sendKeys(Properties.someText);
        return this;
    }

    public page.ContactPage closeCookieInfo() {

        this.scrollDown();
        driver
                .findElement(CLOSE_COOKIE_ACCEPTANCE)
                .click();
        return this;
    }

    //singleton, enum singleton, singleton inner class
    public page.ContactPage moveToSendButtonAndClick() {
        driver
                .findElement(SEND_BUTTON)
                .click();
        return this;
    }

    public void checkValidationError() {
        Assertion
                .IfErrorMessageAppear(Properties.VALIDATION_ERROR, Properties.EXPECTED_STRING_ERROR);
    }

}
