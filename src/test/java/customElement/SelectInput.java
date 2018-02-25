package customElement;

/**
 * Created by michald on 24/02/2018.
 */

        import java.util.List;
        import org.openqa.selenium.WebElement;
public interface SelectInput {
    boolean isMultiple();
//    List&amp;amp;amp;amp;lt;WebElement&amp;amp;amp;amp;gt; getOptions();
//    List&amp;amp;amp;amp;lt;WebElement&amp;amp;amp;amp;gt; getAllSelectedOptions();
    WebElement getFirstSelectedOption();
    void selectByVisibleText(String text);
    void selectByIndex(int index);
    void selectByValue(String value);
    void deselectAll();
    void deselectByValue(String value);
    void deselectByIndex(int index);
    void deselectByVisibleText(String text);
    void selectByVisibleText(String...texts);
}
