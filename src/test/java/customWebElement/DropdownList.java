package customWebElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by michald on 18/02/2018.
 */
public class DropdownList extends ElementImpl{
    public DropdownList(WebElement element) {
        super(element);
    }

    public Select initialize (WebElement dropdownList){
        return new Select(dropdownList);
    }
    public void SelectByText (WebElement dropdownList, String text){
        this.initialize( dropdownList ).selectByVisibleText( text );
    }

}
