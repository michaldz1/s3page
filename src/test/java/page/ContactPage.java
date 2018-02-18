package page;

//import newWebEl.CheckboxElement;
import customWebElement.Checkbox;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import utils.DriverManager;
import utils.WaitFor;
import utils.Assertion;
import properties.Properties;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ContactPage extends Page {
    @FindBy(id = "input_5_1")
    private RemoteWebElement commentTextField;
    @FindBy(name = "dismiss")
    private WebElement closeCookie;
    @FindBy(id = "gform_submit_button_5")
    private WebElement sendButton;
    @FindBy(id = "validation_error")
    private WebElement validationErr;
    @FindBy(css = "div.ginput_container_select > select")
    private WebElement countrySelector;
    @FindBy (css = "[data-target=\"#user-login\"]")
    private WebElement login;
    @FindBy (css = "p.checkbox input[type = \"checkbox\"]")
    private Checkbox checkbox;
//    @FindBy (css = "p.checkbox input[type = \"checkbox\"]")
//    private CheckboxElement checkboxEl;
//    @FindBy (css = "div.ginput_container_select > select")
//    private SelectorImpl selectorImpNew;

//    @FindBy (css = "div.ginput_container_select > select")
//    private Select countrySelect;

//Findby ma znaleźć cokolwiek np. select zamiast webelementu, child, sibling, adjescent sibling


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

    public page.ContactPage selectCountry(String country) {
        Select select = new Select(countrySelector);
        select.selectByVisibleText(country);
//        SelectorImpl select = new SelectorImpl(selectorImpNew);
//        select.countrySelect(country);
        return this;
    }

    public void checkValidationError() {
        Assertion
                .IfErrorMessageAppear(Properties.VALIDATION_ERROR, Properties.EXPECTED_STRING_ERROR);
    }
    public page.ContactPage markCheckbox() {
        checkbox.click();
        return this;
    }
//    public page.ContactPage unMarkCheckbox() {
//        checkboxEl.uncheck();
//        return this;
//    }
    public page.ContactPage moveToLoginButtonAndClick() {
        login
                .click();
        return this;
    }
}
