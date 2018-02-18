package customWebElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.internal.WrapsElement;

/**
 * Created by michald on 18/02/2018.
 */
public interface Element extends WebElement, WrapsElement, Locatable {}

