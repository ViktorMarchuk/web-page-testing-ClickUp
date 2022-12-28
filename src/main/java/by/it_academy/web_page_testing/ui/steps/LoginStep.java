package by.it_academy.web_page_testing.ui.steps;

import by.it_academy.web_page_testing.ui.pages.LoginPage;

public class LoginStep extends LoginPage{
    public LoginStep(){
        super();
    }

    public void generalActionOnPage(){
        openPage(BASE_URL);
        clickButtonLogInOnStartPage();

    }

    public void actionWithInvalidEmail(String invalidEmail){
        generalActionOnPage();
        inputInvalidEmail(invalidEmail);
        getTextThisEmailIsInvalid();
        clickButtonLogInOnLoginPage();
    }

    public void actionWithCorrectEmailAndIncorrectPassword(String incorrectPassword, String correctEmail){
        generalActionOnPage();
        inputCorrectEmail(correctEmail);
        inputIncorrectPassword(incorrectPassword);
        clickButtonLogInOnLoginPage();
        getTextIncorrectPasswordForThisEmail();
    }

    public void actionWithEmptyEmailAndEmptyPassword(){
        generalActionOnPage();
        clickButtonLogInOnLoginPage();
        getTextIncorrectEmailAndCorrectPassword();
    }

    public void actionWithIncorrectEmailAndCorrectPassword(String correctPassword,String incorrectEmail){
        generalActionOnPage();
        inputIncorrectEmail(incorrectEmail);
        inputCorrectPassword(correctPassword);
        clickButtonLogInOnLoginPage();
        getExplicitlyWaiter(getNameNoAccountForThisEmail());
    }

    public void actionWithEnteredEmailAndEmptyPassword(String correctEmail){
        generalActionOnPage();
        inputCorrectEmail(correctEmail);
        clickButtonLogInOnLoginPage();
        getTextPasswordRequired();

    }

    public void actionWithEmptyEmailAndEnteredPassword(String correctPassword){
        generalActionOnPage();
        inputCorrectPassword(correctPassword);
        clickButtonLogInOnLoginPage();
        getTextEmailRequired();

    }

    public void actionWithInvalidPassword(String invalidPassword,String correctEmail){
        generalActionOnPage();
        inputCorrectEmail(correctEmail);
        inputInvalidPassword(invalidPassword);
        clickButtonLogInOnLoginPage();
        getTextInvalidPassword();
    }
    public void actionWithCorrectEmailAndCorrectPassword(String correctEmail,String correctPassword){
        generalActionOnPage();
        inputCorrectEmail(correctEmail);
        inputCorrectPassword(correctPassword);
        clickButtonLogInOnLoginPage();
        getTexNameHomeOnMainPage();
    }
}
