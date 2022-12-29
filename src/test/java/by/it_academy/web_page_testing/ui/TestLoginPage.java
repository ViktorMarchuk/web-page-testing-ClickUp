package by.it_academy.web_page_testing.ui;

import by.it_academy.web_page_testing.ui.domain.CorrectUserData;
import by.it_academy.web_page_testing.ui.steps.LoginStep;
import by.it_academy.web_page_testing.ui.util.RandomGeneratorLettersAndNumbers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest{
    private final String INVALID_PASSWORD = "356K";
    private final String INVALID_EMAIL = "viktor.marchuk0207@gmail";
    private final int VALID_NUMBERS_OF_CHARACTERS = 8;
    private final String INCORRECT_PASSWORD = RandomGeneratorLettersAndNumbers.getPassword(VALID_NUMBERS_OF_CHARACTERS);
    private final String INCORRECT_EMAIL = "marchuk@tgl.by";

    @Test
    public void testInvalidEmail(){
        LoginStep loginStep = new LoginStep();
        loginStep.actionWithInvalidEmail(INVALID_EMAIL);

        Assert.assertEquals(loginStep.THIS_EMAIL_IS_INVALID, loginStep.getTextThisEmailIsInvalid());
    }

    @Test
    public void testCorrectEmailAndIncorrectPassword(){
        LoginStep loginStep = new LoginStep();
        loginStep.actionWithCorrectEmailAndIncorrectPassword(INCORRECT_PASSWORD, CorrectUserData.CORRECT_EMAIL);

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
        loginStep.actionWithIncorrectEmailAndCorrectPassword(CorrectUserData.CORRECT_PASSWORD,INCORRECT_EMAIL);

        Assert.assertEquals(loginStep.NO_ACCOUNT_FOR_THIS_MAIL, loginStep.getTextNoAccountForThisEmail());
    }

    @Test
    public void testEnteredEmailAndEmptyPassword(){
        LoginStep loginStep = new LoginStep();
        loginStep.actionWithEnteredEmailAndEmptyPassword(CorrectUserData.CORRECT_EMAIL);

        Assert.assertEquals(loginStep.PASSWORD_REQUIRED, loginStep.getTextPasswordRequired());
    }

    @Test
    public void testEmptyEmailAndEnteredPassword(){
        LoginStep loginStep = new LoginStep();
        loginStep.actionWithEmptyEmailAndEnteredPassword(CorrectUserData.CORRECT_PASSWORD);

        Assert.assertEquals(loginStep.EMAIL_REQUIRED, loginStep.getTextEmailRequired());
    }

    @Test
    public void testInvalidPassword(){
        LoginStep loginStep = new LoginStep();
        loginStep.actionWithInvalidPassword(INVALID_PASSWORD,CorrectUserData.CORRECT_EMAIL);

        Assert.assertEquals(loginStep.PASSWORD_MUST_BE_8_CHARACTERS_OR_LONGER, loginStep.getTextInvalidPassword());
    }

    @Test
    public void testCorrectEmailAndCorrectPassword(){
        LoginStep loginStep = new LoginStep();
        loginStep.actionWithCorrectEmailAndCorrectPassword(CorrectUserData.CORRECT_EMAIL, CorrectUserData.CORRECT_PASSWORD);

        Assert.assertEquals(loginStep.HOME, loginStep.getTexNameHomeOnMainPage());
    }
}

