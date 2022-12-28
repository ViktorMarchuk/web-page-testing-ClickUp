package by.it_academy.web_page_testing.ui.steps;

import by.it_academy.web_page_testing.ui.pages.LoginPage;
import by.it_academy.web_page_testing.ui.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainStep extends MainPage{
    LoginPage loginPage = new LoginPage();

    public MainStep(){
        super();
    }

    public void generalActionOnPage(String correctEmail, String correctPassword){
        openPage(BASE_URL);
        loginPage.clickButtonLogInOnStartPage();
        loginPage.inputCorrectEmail(correctEmail);
        loginPage.inputCorrectPassword(correctPassword);
        loginPage.clickButtonLogInOnLoginPage();
    }

    public void actionWithButtonCreateList(String correctEmail, String correctPassword){
        generalActionOnPage(correctEmail,correctPassword);
        getExplicitlyWaiter(getNameFieldCreateList());
        getTextFromButtonCreateList();
    }

    public void actionWithNameHome(String correctEmail, String correctPassword){
        generalActionOnPage(correctEmail,correctPassword);
        getExplicitlyWaiter(getNameHome());
        getTextFromNameHome();
    }

    public void actionWithNameTrendingAfterClickNameHome(String correctEmail,String correctPassword){
        generalActionOnPage(correctEmail,correctPassword);
        clickButtonHome();
        getExplicitlyWaiter(getNameTrendingAfterClickNameHome());
        getTextNameTrendingAfterClickNameHome();
    }

    public void actionWithWindowInvitePeopleAfterClickFieldInvite(String correctEmail,String correctPassword){
        generalActionOnPage(correctEmail,correctPassword);
        clickFieldInvite();
        getExplicitlyWaiter(getNameInvitePeople());
        getTextFromNameInvitePeople();
    }
}
