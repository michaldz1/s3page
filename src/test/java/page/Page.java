package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;


/**
 * Created by michald on 26/11/2017.
 */
public class Page {
    protected WebDriver driver = DriverManager.getDriver();

    public page.Page scrollDown() {

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        return this;
    }

    public page.Page scrollDown500() {

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, 500)");
        return this;
    }


}
