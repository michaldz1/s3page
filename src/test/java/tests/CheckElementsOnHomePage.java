package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.CareersPage;
import page.ContactPage;
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
//                .clickOurBusiness()
//                .clicks3Logo()
//                .clicks3Semiconductors()
//                .goToHomePage()
//                .clickConnectedHealth()
//                .goToHomePage()
//                .clickCareers()
//                .goToHomePage()
//                .clickVacancies()
//                .goToHomePage()
//                .clickMeetOurPeople()
//                .goToHomePage()
//                .clickOurRecruitmentProcess()
//                .goToHomePage()
//                .clickFaq()
//                .goToHomePage()
//                .clickOurRecruitmentProcess()
//                .goToHomePage()
//                .clickRecruitmentAgencies()
//                .goToHomePage()
//                .clickAlumni()
//                .goToHomePage()
//                .clickNewsAndEvents()
//                .goToHomePage()
//                .clickAbout()
//                .goToHomePage()
//                .clickIntroduction()
//                .goToHomePage()
//                .clickCustomers()
//                .goToHomePage()
//                .clickQuality()
//                .goToHomePage()
//                .clickLocations()
//                .goToHomePage()
//                .clickLeadershipTeam()
//                .goToHomePage()
//                .clickInvestors()
//                .goToHomePage()
//                .clickSearch()
//                .goToHomePage()
//                .clickSitemap()
//                .goToHomePage()
//                .clickLegal()
//                .goToHomePage()
//                .clickPrivacy()
//                .goToHomePage();
//                .clickMore()
//                .goToHomePage()
//                .clickVideoPlay()
//                .goToHomePage()
//                .clickS3SemiconductorBanner()
//                .goToHomePage()
//                .clickConnectedHealthBanner();
                .clickLogin()
                .markCheckbox()
                .goToHomePage()
                .clickVacancies();
//        CareersPage careersPage = new CareersPage();
//        careersPage.selectBusinessUnit( "S3 Semiconductors" );

    }

    @After
    public void afterTest() {
        driver.quit();
    }

}
