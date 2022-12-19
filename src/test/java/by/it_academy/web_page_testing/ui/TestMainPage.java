package by.it_academy.web_page_testing.ui;

import by.it_academy.web_page_testing.ui.pages.MainPage;
import by.it_academy.web_page_testing.ui.pages.StepMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestMainPage extends BaseTest{
    public void testButtonCreateList(){
        MainPage mainPage = new MainPage();
        StepMainPage stepMainPage = new StepMainPage();
        stepMainPage.actionWithButtonCreateList();

        Assert.assertEquals(mainPage.CREATE_LIST, mainPage.getTextFromButtonCreateList());
    }

    public void testWithNameHome(){
        MainPage mainPage = new MainPage();
        StepMainPage stepMainPage = new StepMainPage();
        stepMainPage.actionWithNameHome();

        Assert.assertEquals(mainPage.HOME, mainPage.getTextFromNameHome());
    }

    public void testWithNameTrendingAfterClickNameHome(){
        MainPage mainPage = new MainPage();
        StepMainPage stepMainPage = new StepMainPage();
        stepMainPage.actionWithNameTrendingAfterClickNameHome();

        Assert.assertEquals(mainPage.TRENDING, mainPage.getTextNameTrendingAfterClickNameHome());
    }

    public void testWindowInvitePeopleAfterClickFieldInvite(){
        MainPage mainPage = new MainPage();
        StepMainPage stepMainPage = new StepMainPage();
        stepMainPage.actionWithWindowInvitePeopleAfterClickFieldInvite();

        Assert.assertEquals(mainPage.INVITE_PEOPLE, mainPage.getTextFromNameInvitePeople());
    }
}
