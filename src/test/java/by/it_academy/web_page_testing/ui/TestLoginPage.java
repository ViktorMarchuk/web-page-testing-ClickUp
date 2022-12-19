package by.it_academy.web_page_testing.ui;

import by.it_academy.web_page_testing.ui.pages.LoginPage;
import by.it_academy.web_page_testing.ui.pages.StepLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest{
    @Test
    public void testInvalidEmail(){
        StepLoginPage stepLoginPage = new StepLoginPage();
        LoginPage loginPage = new LoginPage();
        stepLoginPage.actionWithInvalidEmail();

        Assert.assertEquals(loginPage.THIS_EMAIL_IS_INVALID, stepLoginPage.getTextThisEmailIsInvalid());
    }

    @Test
    public void testCorrectEmailAndIncorrectPassword(){
        StepLoginPage stepLoginPage = new StepLoginPage();
        LoginPage loginPage = new LoginPage();
        stepLoginPage.actionWithCorrectEmailAndIncorrectPassword();

        Assert.assertEquals(loginPage.INCORRECT_PASSWORD_FOR_THIS_EMAIL, stepLoginPage.getTextIncorrectPasswordForThisEmail());
    }

    @Test
    public void testEmptyEmailAndEmptyPassword(){
        StepLoginPage stepLoginPage = new StepLoginPage();
        LoginPage loginPage = new LoginPage();
        stepLoginPage.actionWithEmptyEmailAndEmptyPassword();

        Assert.assertEquals(loginPage.EMAIL_REQUIRED, loginPage.getTextEmailRequired());
        Assert.assertEquals(loginPage.PASSWORD_REQUIRED, loginPage.getTextPasswordRequired());
    }

    @Test
    public void testIncorrectEmailAndCorrectPassword(){
        StepLoginPage stepLoginPage = new StepLoginPage();
        LoginPage loginPage = new LoginPage();
        stepLoginPage.actionWithIncorrectEmailAndCorrectPassword();

        Assert.assertEquals(loginPage.NO_ACCOUNT_FOR_THIS_MAIL, loginPage.getTextNoAccountForThisEmail());
    }

    @Test
    public void testEnteredEmailAndEmptyPassword(){
        StepLoginPage stepLoginPage = new StepLoginPage();
        LoginPage loginPage = new LoginPage();
        stepLoginPage.actionWithEnteredEmailAndEmptyPassword();

        Assert.assertEquals(loginPage.PASSWORD_REQUIRED, loginPage.getTextPasswordRequired());
    }

    @Test
    public void testEmptyEmailAndEnteredPassword(){
        StepLoginPage stepLoginPage = new StepLoginPage();
        LoginPage loginPage = new LoginPage();
        stepLoginPage.actionWithEmptyEmailAndEnteredPassword();

        Assert.assertEquals(loginPage.EMAIL_REQUIRED, loginPage.getTextEmailRequired());
    }

    @Test
    public void testInvalidPassword(){
        StepLoginPage stepLoginPage = new StepLoginPage();
        LoginPage loginPage = new LoginPage();
        stepLoginPage.actionWithInvalidPassword();

        Assert.assertEquals(loginPage.PASSWORD_MUST_BE_8_CHARACTERS_OR_LONGER, loginPage.getTextInvalidPassword());
    }
}

