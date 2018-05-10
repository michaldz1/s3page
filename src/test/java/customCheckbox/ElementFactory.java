package customCheckbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by michald on 21/02/2018.
 */
/* Element factory for wrapped elements.s */
public class ElementFactory extends PageFactory {
    /* Initializes a page factory from a class with a template of Elements. */
    public static <T> T initElements(WebDriver driver, Class<T> pageClassToProxy) {
        try {
            T page = pageClassToProxy.getConstructor(WebDriver.class).newInstance(driver);
            PageFactory.initElements(
                    new ElementDecorator(
                            new DefaultElementLocatorFactory(driver)), page);
            return page;
        } catch (InstantiationException | IllegalAccessException
                | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}