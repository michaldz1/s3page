package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.CareersPage;
import page.HomePage;
import utils.DriverManager;

/**
 * Created by michald on 15/02/2018.
 */
public class SelectFromDropdownList {
    private WebDriver driver;
    int s3SemiconductorsIndex = 3;

    @Before
    public void setup() {
        driver = DriverManager.getDriver();
    }

    @Test
    public void checkValidationOnSilicon1() {
        HomePage homePage = new HomePage();
        homePage
                .clickVacancies();

        CareersPage careersPage = new CareersPage();
        careersPage.selectBusinessUnit( s3SemiconductorsIndex);
    }

    @After
    public void afterTest() {
        driver.quit();
    }

}
