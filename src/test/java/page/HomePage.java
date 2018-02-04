package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.DriverAction;
import utils.DriverManager;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static properties.Properties.S3_URL;

public class HomePage extends Page {

    private WebDriver driver;
    private Actions action;
    @FindBy(css = "a.btn.btn-red.btn-contact")
    private WebElement contactUs;
    @FindBy(css = "li#menu-item-1098")
    private WebElement ourBusiness;
    @FindBy(css = "a.navbar-brand")
    private WebElement s3Logo;
    @FindBy(css = "li#menu-item-778")
    private WebElement ourBusiness_s3Semiconductors;
    @FindBy(css = "li#menu-item-779")
    private WebElement ourBusiness_connectedHealth;
    @FindBy(css = "li#menu-item-401")
    private WebElement careers;
    @FindBy(css = "li#menu-item-444")
    private WebElement careers_vacancies;
    @FindBy(css = "li#menu-item-402")
    private WebElement careers_meetOurPeople;
    @FindBy(css = "li#menu-item-404")
    private WebElement careers_ourRecruitmentProces;
    @FindBy(css = "li#menu-item-405")
    private WebElement careers_fAQ;
    @FindBy(css = "li#menu-item-403")
    private WebElement careers_reqruitmentAgencies;
    @FindBy(css = "li#menu-item-909")
    private WebElement careers_alumni;

    @FindBy(css = "li#menu-item-645")
    private WebElement newsAndEvents;
    @FindBy(css = "li#menu-item-653")
    private WebElement about;
    @FindBy(css = "li#menu-item-649")
    private WebElement about_introduction;
    @FindBy(css = "li#menu-item-644")
    private WebElement about_customers;
    @FindBy(css = "li#menu-item-409")
    private WebElement about_quality;
    @FindBy(css = "li#menu-item-635")
    private WebElement about_locations;
    @FindBy(css = "li#menu-item-408")
    private WebElement about_leadershipTeam;
    @FindBy(css = "li#menu-item-407")
    private WebElement about_investors;


//    contactUs = .btn btn-red btn-contact
//    semiconductorsBanner = ??
//    connectedHealthBanner = ??
//    playMovie = .icon-s3-icon-play
//    moreButton = ??// contains("More")
//    sitemap = #menu-item-990
//    legal = #menu-item-1327
//    privacy = #menu-item-1328


    public HomePage() {
        this.driver = DriverManager.getDriver();
        this.action = DriverAction.getAction();
        PageFactory.initElements(driver,this);
        driver.get(S3_URL);
    }

    public ContactPage clickContactUs() {
        contactUs.click();
        return new ContactPage();
    }

    public HomePage clickOurBusiness(){
        ourBusiness.click();
        return this;
    }

    public HomePage clicks3Logo(){
        s3Logo.click();
        return this;
    }

    public HomePage clicks3Semiconductors(){
        action.moveToElement(ourBusiness).perform();
        ourBusiness_s3Semiconductors.click();
        return this;
    }

    public HomePage clickConnectedHealth(){
        action.moveToElement(ourBusiness).perform();
        ourBusiness_connectedHealth.click();
        return this;
    }

    public HomePage goToHomePage(){
        driver.get(S3_URL);
        return this;
    }

    public HomePage clickCareers(){
        careers.click();
        return this;
    }

    public HomePage clickVacancies(){
        action.moveToElement(careers).perform();
        careers_vacancies.click();
        return this;
    }

    public HomePage clickMeetOurPeople(){
        action.moveToElement(careers).perform();
        careers_meetOurPeople.click();
        return this;
    }

    public HomePage clickOurRecruitmentProcess(){
        action.moveToElement(careers).perform();
        careers_ourRecruitmentProces.click();
        return this;
    }

    public HomePage clickFaq(){
        action.moveToElement(careers).perform();
        careers_fAQ.click();
        return this;
    }

    public HomePage clickRecruitmentAgencies(){
        action.moveToElement(careers).perform();
        careers_reqruitmentAgencies.click();
        return this;
    }

    public HomePage clickAlumni(){
        action.moveToElement(careers).perform();
        careers_alumni.click();
        return this;
    }

    public HomePage clickNewsAndEvents(){
        newsAndEvents.click();
        return this;
    }

    public HomePage clickAbout(){
        about.click();
        return this;
    }

    public HomePage clickIntroduction(){
        action.moveToElement(about).perform();
        about_introduction.click();
        return this;
    }

    public HomePage clickCustomers(){
        action.moveToElement(about).perform();
        about_customers.click();
        return this;
    }

    public HomePage clickQuality(){
        action.moveToElement(about).perform();
        about_quality.click();
        return this;
    }

    public HomePage clickLocations(){
        action.moveToElement(about).perform();
        about_locations.click();
        return this;
    }

    public HomePage clickLeadershipTeam(){
        action.moveToElement(about).perform();
        about_leadershipTeam.click();
        return this;
    }

    public HomePage clickInvestors(){
        action.moveToElement(about).perform();
        about_investors.click();
        return this;
    }

}
