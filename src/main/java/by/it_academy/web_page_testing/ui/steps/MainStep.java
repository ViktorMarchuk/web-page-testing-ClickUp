package by.it_academy.web_page_testing.ui.steps;

import by.it_academy.web_page_testing.ui.pages.LoginPage;
import by.it_academy.web_page_testing.ui.pages.MainPage;

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
        getTextFromButtonCreateList();
    }

    public void actionWithNameHome(String correctEmail, String correctPassword){
        generalActionOnPage(correctEmail,correctPassword);
        getTextFromNameHome();
    }

    public void actionWithNameTrendingAfterClickNameHome(String correctEmail,String correctPassword){
        generalActionOnPage(correctEmail,correctPassword);
        clickButtonHome();
        getTextNameTrendingAfterClickNameHome();
    }

    public void actionWithWindowInvitePeopleAfterClickFieldInvite(String correctEmail,String correctPassword){
        generalActionOnPage(correctEmail,correctPassword);
        clickFieldInvite();
        getTextFromNameInvitePeople();
    }
}
