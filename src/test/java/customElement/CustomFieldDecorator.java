package customElement;

/**
 * Created by michald on 24/02/2018.
 */
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

//TODO import com.skyarch.PageObjects.CustomElements.Handlers.SelectElementWrapperHandler;
//
//TODO import com.skyarch.PageObjects.CustomElements.Interfaces.SelectInput;

public class CustomFieldDecorator extends DefaultFieldDecorator {

    public CustomFieldDecorator(ElementLocatorFactory factory) {

        super(factory);

    }

    @Override

    public Object decorate(ClassLoader loader, Field field) {

        // this part is where we pre-filter the acceptable interfaces for our page objects

        if (!(WebElement.class.isAssignableFrom(field.getType())

                || String.class.isAssignableFrom(field.getType())

                || SelectInput.class.isAssignableFrom(field.getType()) // this will be our example custom object

                || List.class.isAssignableFrom(field.getType())

                || isDecoratableList(field))) {

            return null;

        }

        ElementLocator locator = factory.createLocator(field);

        if (locator == null) {

            return null;

        }

        if (List.class.isAssignableFrom(field.getType())) {

            return proxyForListLocator(loader, locator);

        } else if (SelectInput.class.isAssignableFrom(field.getType())) {

            return proxySelectForLocator(loader, locator);

        } else if (WebElement.class.isAssignableFrom(field.getType())) {

            return proxyForLocator(loader, locator);

        } else {

            return null;

        }

    }

    protected SelectInput proxySelectForLocator(ClassLoader loader, ElementLocator locator) {

        InvocationHandler handler = new SelectElementWrapperHandler(locator);

        SelectInput proxy;

        proxy = (SelectInput) Proxy.newProxyInstance(

                loader, new Class[]{SelectInput.class}, handler);

        return proxy;

    }

}
