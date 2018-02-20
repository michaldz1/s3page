package customWebElement;

import com.github.webdriverextensions.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by michald on 20/02/2018.
 */
public class DropdownListWebCom extends WebComponent {
    @FindBy(className = "form-control")
    public WebElement dropDownListWebCom;

}
