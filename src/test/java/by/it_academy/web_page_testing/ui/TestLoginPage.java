package by.it_academy.web_page_testing.ui;

import by.it_academy.web_page_testing.ui.steps.LoginStep;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest{
    @Test
    public void testInvalidEmail(){
        LoginStep loginStep = new LoginStep();
        loginStep.actionWithInvalidEmail();

        Assert.assertEquals(loginStep.THIS_EMAIL_IS_INVALID, loginStep.getTextThisEmailIsInvalid());
    }

    @Test
    public void testCorrectEmailAndIncorrectPassword(){
        LoginStep loginStep = new LoginStep();
        loginStep.actionWithCorrectEmailAndIncorrectPassword();

        Assert.assertEquals(loginStep.INCORRECT_PASSWORD_FOR_THIS_EMAIL, loginStep.getTextIncorrectPasswordForThisEmail());
    }

    @Test
    public void testEmptyEmailAndEmptyPassword(){
        LoginStep loginStep = new LoginStep();
        loginStep.actionWithEmptyEmailAndEmptyPassword();

        Assert.assertEquals(loginStep.EMAIL_REQUIRED, loginStep.getTextEmailRequired());
        Assert.assertEquals(loginStep.PASSWORD_REQUIRED, loginStep.getTextPasswordRequired());
    }

    @Test
    public void testIncorrectEmailAndCorrectPassword(){
        LoginStep loginStep = new LoginStep();
        loginStep.actionWithIncorrectEmailAndCorrectPassword();

        Assert.assertEquals(loginStep.NO_ACCOUNT_FOR_THIS_MAIL, loginStep.getTextNoAccountForThisEmail());
    }

    @Test
    public void testEnteredEmailAndEmptyPassword(){
        LoginStep loginStep = new LoginStep();
        loginStep.actionWithEnteredEmailAndEmptyPassword();

        Assert.assertEquals(loginStep.PASSWORD_REQUIRED, loginStep.getTextPasswordRequired());
    }

    @Test
    public void testEmptyEmailAndEnteredPassword(){
        LoginStep loginStep = new LoginStep();
        loginStep.actionWithEmptyEmailAndEnteredPassword();

        Assert.assertEquals(loginStep.EMAIL_REQUIRED, loginStep.getTextEmailRequired());
    }

    @Test
    public void testInvalidPassword(){
        LoginStep loginStep = new LoginStep();
        loginStep.actionWithInvalidPassword();

        Assert.assertEquals(loginStep.PASSWORD_MUST_BE_8_CHARACTERS_OR_LONGER, loginStep.getTextInvalidPassword());
    }
    @Test
    public void testValidEmailAndValidPassword(){
        LoginStep loginStep = new LoginStep();
        loginStep.actionWithCorrectEmailAndCorrectPassword();

        Assert.assertEquals(loginStep.HOME,loginStep.getTextNameClickUpOnMainPage());
    }
}

