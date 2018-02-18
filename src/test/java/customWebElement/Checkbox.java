package customWebElement;

import org.openqa.selenium.WebElement;

/**
 * Created by michald on 18/02/2018.
 */
public class Checkbox extends ElementImpl {

    public Checkbox(WebElement element) {
        super(element);
    }

    public void toggle() {
        getWrappedElement().click();
    }

    public void check() {
        if (!isChecked()) {
            toggle();
        }
    }

    public void uncheck() {
        if (isChecked()) {
            toggle();
        }
    }

    public boolean isChecked() {
        return getWrappedElement().isSelected();
    }
}
