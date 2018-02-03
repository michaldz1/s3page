package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.DriverManager;
import utils.WaitFor;
import utils.Assertion;
import properties.Properties;
import org.openqa.selenium.support.PageFactory;


public class ContactPage extends Page {
    @FindBy(id = "input_5_1")
    private WebElement commentTextField;
    @FindBy(name = "dismiss")
    private WebElement closeCookie;
    @FindBy(id = "gform_submit_button_5")
    private WebElement sendButton;
    @FindBy(id = "validation_error")
    private WebElement blah;

/*
    @FindBy (css = "ds")
    private WebElement sth;
*/


    public ContactPage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver,this);
            }

    public page.ContactPage moveToCommentTextFieldClickAndEnterSomeText() {
        WaitFor.webElementVisible(commentTextField);
        commentTextField.
                sendKeys(Properties.someText);
        return this;
    }

    public page.ContactPage closeCookieInfo() {

        this.scrollDown();
            closeCookie
                .click();
        return this;
    }

    public page.ContactPage moveToSendButtonAndClick() {
        sendButton
                .click();
        return this;
    }

    public void checkValidationError() {
        Assertion
                .IfErrorMessageAppear(Properties.VALIDATION_ERROR, Properties.EXPECTED_STRING_ERROR);
    }

}
