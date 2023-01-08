package by.it_academy.web_page_testing.ui.steps;

import by.it_academy.web_page_testing.ui.pages.LoginPage;

public class LoginStep extends LoginPage{

    public void generalActionOnPage(){
        openPage(BASE_URL);
        clickButtonLogInOnStartPage();
    }

    public void actionWithInvalidEmail(String invalidEmail){
        generalActionOnPage();
        inputInvalidEmail(invalidEmail);
        clickButtonLogInOnLoginPage();
    }

    public void actionWithCorrectEmailAndIncorrectPassword(String incorrectPassword, String correctEmail){
        generalActionOnPage();
        inputCorrectEmail(correctEmail);
        inputIncorrectPassword(incorrectPassword);
        clickButtonLogInOnLoginPage();
    }

    public void actionWithEmptyEmailAndEmptyPassword(){
        generalActionOnPage();
        clickButtonLogInOnLoginPage();
    }

    public void actionWithIncorrectEmailAndCorrectPassword(String correctPassword, String incorrectEmail){
        generalActionOnPage();
        inputIncorrectEmail(incorrectEmail);
        inputCorrectPassword(correctPassword);
        clickButtonLogInOnLoginPage();
        getExplicitlyWaiter(getNameNoAccountForThisEmail(), 12);
    }

    public void actionWithEnteredEmailAndEmptyPassword(String correctEmail){
        generalActionOnPage();
        inputCorrectEmail(correctEmail);
        clickButtonLogInOnLoginPage();

    }

    public void actionWithEmptyEmailAndEnteredPassword(String correctPassword){
        generalActionOnPage();
        inputCorrectPassword(correctPassword);
        clickButtonLogInOnLoginPage();
    }

    public void actionWithInvalidPassword(String invalidPassword, String correctEmail){
        generalActionOnPage();
        inputCorrectEmail(correctEmail);
        inputInvalidPassword(invalidPassword);
        clickButtonLogInOnLoginPage();
    }

    public void actionWithCorrectEmailAndCorrectPassword(String correctEmail, String correctPassword){
        generalActionOnPage();
        inputCorrectEmail(correctEmail);
        inputCorrectPassword(correctPassword);
        clickButtonLogInOnLoginPage();
        getExplicitlyWaiter(getNameHomeOnMainPage(), 10);
    }
}
