package utils;

import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;


/**
 * Created by michald on 03/12/2017.
 */
public class Assertion {
    private Assertion() {
    }

    public static void IfErrorMessageAppear(By messageShown, String messageExpected) {
        WaitFor.webElementVisible(messageShown);
        assertEquals(DriverManager.getDriver().findElement(messageShown).getText(), messageExpected);

    }
}
