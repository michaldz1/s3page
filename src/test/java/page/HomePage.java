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
    @FindBy(css = "ls#menu-item-444")
    private WebElement careers_vacancies;
    @FindBy(css = "li#menu-item-402")
    private WebElement careers_meetOurPeople;
    @FindBy(css = "ls#menu-item-404")
    private WebElement careers_ourRecruitmentProces;
    @FindBy(css = "li#menu-item-405")
    private WebElement careers_fAQ;
    @FindBy(css = "ls#menu-item-403")
    private WebElement careers_reqruitmentAgencies;
    @FindBy(css = "li#menu-item-909")
    private WebElement careers_alumni;

//    newsAndEvents = #menu-item-645
//    about = #menu-item-653
//    about_introduction = #menu-item-649
//    about_customers = #menu-item-644
//    about_quality = #menu-item-409
//    about_locations = #menu-item-635
//    about_leadershipTeam = #menu-item-408
//    about_investors = #menu-item-407
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

}
