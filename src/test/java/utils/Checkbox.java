package utils;

import org.openqa.selenium.*;

import java.util.List;

/**
 * Created by michald on 11/02/2018.
 */
public class Checkbox implements WebElement{
    private WebElement checkbox=null;
    public Checkbox(WebElement element) {
        this.checkbox=checkbox;
    }
    public boolean isChecked(){
        return checkbox.isSelected();
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
//    public void click(){}
//
//    public void submit(){}
//
//    public void sendKeys(CharSequence... var1){}
//
//    public void clear(){}
//
//    public String getTagName(){String tagname = null; return tagname;}
//
//    public String getAttribute(String var1){String atribute = null; return atribute;}
//
//    public boolean isSelected(){return false;}
//
//    public boolean isEnabled(){return false;}
//
//    public String getText(){String text = null; return text;}
//
//    public List<WebElement> findElements(By var1){List<WebElement> weblist= null; return weblist;}
//
//    public WebElement findElement(By var1){WebElement webel = null; return webel;}
//
//    public boolean isDisplayed(){return false;}
//
//    public Point getLocation(){Point point = null; return  null;}
//
//    public Dimension getSize(){Dimension dimension = null; return dimension;}
//
//    public Rectangle getRect(){Rectangle rectangle = null; return rectangle;}
//
//    public String getCssValue(String var1){String cssvalue = null; return cssvalue;}
//
//    @Override
//    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
//        return null;
//    }
}
