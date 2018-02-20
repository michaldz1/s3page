package page;

//import customWebElement.DropdownList;
//import org.openqa.selenium.WebDriver;
import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import customWebElement.DropdownListWebCom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import utils.DriverManager;
//import utils.WaitFor;
//import utils.Assertion;
//import properties.Properties;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
import com.github.webdriverextensions.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by michald on 18/02/2018.
 */
public class CareersPage {
    private WebDriver driver;
    private CareersPage(){
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(new WebDriverExtensionFieldDecorator(driver), this);
    }

    @FindBy (css = "select.form-control[id=\"business_unit\"]")
    private DropdownListWebCom dropdownListWebCom;

//    @FindBy (css = "select.form-control[id=\"business_unit\"]")
//    private DropdownList dropDownlistUnit;
//
//    private WebDriver driver;
//
//    public CareersPage() {
//        this.driver = DriverManager.getDriver();
//        PageFactory.initElements(driver,this);
//    }
//
//    public page.CareersPage selectBusinessUnit(String businessUnit) {
//        Select select = new Select(dropDownlistUnit);
//        select.selectByVisibleText(businessUnit);
//
//        return this;
//    }
}
