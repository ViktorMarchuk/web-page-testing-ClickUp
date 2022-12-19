package by.it_academy.web_page_testing.ui.pages;

public class StepMainPage extends MainPage{
    LoginPage loginPage = new LoginPage();

    public StepMainPage(){
        super();
    }

    public void sameActionOnPage(){
        openPage(BASE_URL);
        loginPage.clickButtonLogInOnStartPage();
        loginPage.inputCorrectEmail();
        loginPage.inputCorrectPassword();
        loginPage.clickButtonLogInOnLoginPage();
    }

    public void actionWithButtonCreateList(){
        sameActionOnPage();
        getTextFromButtonCreateList();
    }

    public void actionWithNameHome(){
        sameActionOnPage();
        getTextFromNameHome();
    }

    public void actionWithNameTrendingAfterClickNameHome(){
        sameActionOnPage();
        clickButtonHome();
        getTextNameTrendingAfterClickNameHome();
    }

    public void actionWithWindowInvitePeopleAfterClickFieldInvite(){
        sameActionOnPage();
        clickFieldInvite();
        getTextFromNameInvitePeople();
    }
}
