package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.HomePage;
import utils.DriverManager;

/**
 * Created by michald on 03/02/2018.
 */
public class CheckElementsOnHomePage {
    private WebDriver driver;

    @Before
    public void setup() {
        driver = DriverManager.getDriver();
    }

    @Test
    public void checkValidationOnSilicon1() {
        HomePage homePage = new HomePage();
        homePage
                .clickOurBusiness()
                .clicks3Logo()
                .clicks3Semiconductors()
                .goToHomePage()
                .clicksConnectedHealth();

    }

    @After
    public void afterTest() {
        driver.quit();
    }

}
