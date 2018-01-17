package utils;

import org.openqa.selenium.interactions.Actions;


public class DriverAction {
    private static Actions action = null;
    private static DriverAction instance = null;

    private DriverAction() {
    }

    private static DriverAction getInstance() {
        if (instance == null) {
            instance = new DriverAction();
        }
        return instance;
    }

    private static void actionSetup() {
        if (action == null) {
            action = new Actions(DriverManager.getDriver());
        }
    }

    public static Actions getAction() {
        DriverAction.getInstance().actionSetup();
        return action;
    }
}