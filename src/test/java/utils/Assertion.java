package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;


/**
 * Created by michald on 03/12/2017.
 */
public class Assertion {
    private Assertion() {
    }

    public static void IfErrorMessageAppear(WebElement messageShown, String messageExpected) {

        WaitFor.webElementVisible(messageShown);
        assertEquals(messageShown.getText(), messageExpected);

    }
}
