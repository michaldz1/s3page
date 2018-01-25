package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverManager;
import utils.WaitFor;
import utils.Assertion;
import properties.Properties;
import org.openqa.selenium.support.PageFactory;

// Selectors: xpath and css -> practice knwoledge:
  // S3 Group.com ->> Selectory do kurwa wszystkiego!

public class ContactPage extends Page {
    private WebElement input_5_1;
    private WebElement dismiss;
    private WebElement gform_submit_button_5;
    private WebElement validation_error;


    public ContactPage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver,this);
            }

    //LMGTFY: WebElements - initialization, maybe think about PageFactory
    public page.ContactPage moveToCommentTextFieldClickAndEnterSomeText() {
        WaitFor.webElementVisible(input_5_1);
        input_5_1.
                sendKeys(Properties.someText);
        return this;
    }

    public page.ContactPage closeCookieInfo() {

        this.scrollDown();
            dismiss
                .click();
        return this;
    }

    //singleton, enum singleton, singleton inner class
    public page.ContactPage moveToSendButtonAndClick() {
        gform_submit_button_5
                .click();
        return this;
    }

    public void checkValidationError() {
        Assertion
                .IfErrorMessageAppear(Properties.VALIDATION_ERROR, Properties.EXPECTED_STRING_ERROR);
    }

}
