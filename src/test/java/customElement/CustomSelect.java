package customElement;

/**
 * Created by michald on 24/02/2018.
 */

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.ui.Select;

//     TODO   import com.skyarch.PageObjects.CustomElements.Interfaces.SelectInput;

public class CustomSelect extends Select implements SelectInput {

    public CustomSelect(WebElement element) {
        super(element);
    }

    @Override
    public void selectByVisibleText(String... texts) {
        for (String text : texts) {
            super.selectByVisibleText(text);
        }
    }
        // more custom methods here...

}

