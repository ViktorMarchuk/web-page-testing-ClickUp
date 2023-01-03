package by.it_academy.web_page_testing.ui.steps;

import by.it_academy.web_page_testing.ui.pages.LoginPage;
import by.it_academy.web_page_testing.ui.pages.MainPage;

public class MainStep extends MainPage{
    LoginPage loginPage = new LoginPage();

    public void generalActionOnPage(String correctEmail, String correctPassword){
        openPage(BASE_URL);
        loginPage.clickButtonLogInOnStartPage();
        loginPage.inputCorrectEmail(correctEmail);
        loginPage.inputCorrectPassword(correctPassword);
        loginPage.clickButtonLogInOnLoginPage();
    }

    public void actionWithButtonCreateList(String correctEmail, String correctPassword){
        generalActionOnPage(correctEmail,correctPassword);
        getExplicitlyWaiter(getNameFieldCreateList(),10);
    }

    public void actionWithNameHome(String correctEmail, String correctPassword){
        generalActionOnPage(correctEmail,correctPassword);
        getExplicitlyWaiter(getNameHome(),10);
    }

    public void actionWithNameTrendingAfterClickNameHome(String correctEmail,String correctPassword){
        generalActionOnPage(correctEmail,correctPassword);
        clickButtonHome();
        getExplicitlyWaiter(getNameTrendingAfterClickNameHome(),14);
    }

    public void actionWithWindowInvitePeopleAfterClickFieldInvite(String correctEmail,String correctPassword){
        generalActionOnPage(correctEmail,correctPassword);
        clickFieldInvite();
        getExplicitlyWaiter(getNameInvitePeople(),10);
    }
}
