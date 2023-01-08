package by.it_academy.web_page_testing.ui;

import by.it_academy.web_page_testing.ui.domain.CorrectUserData;
import by.it_academy.web_page_testing.ui.steps.MainStep;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestMainPage extends BaseTest{
    public void testButtonCreateList(){
        MainStep mainStep = new MainStep();
        mainStep.actionWithButtonCreateList(CorrectUserData.CORRECT_EMAIL,CorrectUserData.CORRECT_PASSWORD);

        Assert.assertEquals(mainStep.CREATE_LIST, mainStep.getTextFromButtonCreateList());
    }

    public void testWithNameHome(){
        MainStep mainStep = new MainStep();
        mainStep.actionWithNameHome(CorrectUserData.CORRECT_EMAIL, CorrectUserData.CORRECT_PASSWORD);

        Assert.assertEquals(mainStep.HOME, mainStep.getTextFromNameHome());
    }

    public void testWithNameTrendingAfterClickNameHome(){
        MainStep mainStep = new MainStep();
        mainStep.actionWithNameTrendingAfterClickNameHome(CorrectUserData.CORRECT_EMAIL,CorrectUserData.CORRECT_PASSWORD);

        Assert.assertEquals(mainStep.TRENDING, mainStep.getTextNameTrendingAfterClickNameHome());
    }

    public void testWindowInvitePeopleAfterClickFieldInvite(){
        MainStep mainStep = new MainStep();
        mainStep.actionWithWindowInvitePeopleAfterClickFieldInvite(CorrectUserData.CORRECT_EMAIL,CorrectUserData.CORRECT_PASSWORD);

        Assert.assertEquals(mainStep.INVITE_PEOPLE, mainStep.getTextFromNameInvitePeople());
    }
}
