package page;

import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import customWebElement.DropdownListWebCom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.DriverManager;


/**
 * Created by michald on 18/02/2018.
 */
public class CareersPage {
    private WebDriver driver;
    public CareersPage(){
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(new WebDriverExtensionFieldDecorator(driver), this);
    }

    @FindBy (css = "select.form-control[id=\"business_unit\"]")
    private DropdownListWebCom dropdownListWebCom;

    public page.CareersPage selectBusinessUnit(int dropdownListIndex) {
        DropdownListWebCom.SelectFromDropDownList( dropdownListWebCom, dropdownListIndex );
        return this;
    }


}
