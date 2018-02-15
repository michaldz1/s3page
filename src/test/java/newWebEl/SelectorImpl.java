package newWebEl;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by michald on 13/02/2018.
 */
public class SelectorImpl implements WebElement{
private SelectorImpl countrySelector;
private String country;

    https://stackoverflow.com/questions/11642348/extend-selenium-webdriver-webelement/13769891#13769891
    http://elisarver.com/2012/12/10/wrapping-webelement-2
    https://stackoverflow.com/questions/11642348/extend-selenium-webdriver-webelement
    
    public void countrySelect() {
        Select select = new Select(countrySelector);
        select.selectByVisibleText(country);
    }

    @Override
    public void click() {

    }

    @Override
    public void submit() {

    }

    @Override
    public void sendKeys(CharSequence... charSequences) {

    }

    @Override
    public void clear() {

    }

    @Override
    public String getTagName() {
        return null;
    }

    @Override
    public String getAttribute(String s) {
        return null;
    }

    @Override
    public boolean isSelected() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }

    @Override
    public Point getLocation() {
        return null;
    }

    @Override
    public Dimension getSize() {
        return null;
    }

    @Override
    public Rectangle getRect() {
        return null;
    }

    @Override
    public String getCssValue(String s) {
        return null;
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return null;
    }
}
