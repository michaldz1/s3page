package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor {
    private static WebDriverWait wait;
//
//    public static void webElementVisible(By byValue) {
//        wait = new WebDriverWait(DriverManager.getDriver(), 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(byValue));
//    }
    public static void webElementVisible(WebElement webelement) {
        wait = new WebDriverWait(DriverManager.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(webelement));
    }


    public static void webElementVisible(WebElement webelement, int timeout) {
        wait = new WebDriverWait(DriverManager.getDriver(), timeout);
        wait.until(ExpectedConditions.visibilityOf(webelement));
    }


}
