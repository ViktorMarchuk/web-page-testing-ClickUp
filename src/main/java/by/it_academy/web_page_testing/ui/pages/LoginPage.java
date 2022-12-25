package by.it_academy.web_page_testing.ui.pages;

import by.it_academy.web_page_testing.ui.driver.DriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public final String THIS_EMAIL_IS_INVALID = "This email is invalid!";
    public final String INCORRECT_PASSWORD_FOR_THIS_EMAIL = "Incorrect password for this email.";
    public final String EMAIL_REQUIRED = "Email required!";
    public final String PASSWORD_REQUIRED = "Password required!";
    public final String HOME = "Home";
    public final String NO_ACCOUNT_FOR_THIS_MAIL = "No account for this email";
    public final String PASSWORD_MUST_BE_8_CHARACTERS_OR_LONGER = "Password must be 8 characters or longer!";

    @FindBy(xpath = "//p[@id='cu-login-form__error_password']/span[2]")
    private WebElement incorrectPasswordForThisEmail;
    @FindBy(xpath = "//div[@class='navigation__auth-button-group']/a")
    private WebElement buttonLogInOnStartPage;
    @FindBy(id = "login-email-input")
    private WebElement fieldEnterEmail;
    @FindBy(id = "login-password-input")
    private WebElement fieldEnterPassword;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonLogInOnLoginPage;
    @FindBy(xpath = "//p[@id='cu-login-form__error_email']/span[2]")
    private WebElement nameUnderFieldEmailThisEmailInvalid;
    @FindBy(xpath = "//p[@id='cu-login-form__error_password']/span[2]")
    private WebElement namePasswordRequired;
    @FindBy(xpath = "//p[@id='cu-login-form__error_email']/span[2]")
    private WebElement nameEmailRequired;
    @FindBy(xpath = "//div[@class='login-page-new__main-form-options']/a/span")
    private WebElement nameForgotPassword;
    @FindBy(xpath = "//app-root[@id='app-root']/cu-toast-lazy-wrapper[1]/cu-toast-new/div/div/p")
    private WebElement nameNoAccountForThisEmail;
    @FindBy(xpath = "//p[@id='cu-login-form__error_password']/span[2]")
    private WebElement nameInvalidPassword;
    @FindBy(xpath = "//div[@data-test='simple-bar__item-label']")
    private WebElement nameHomeOnMainPage;


    public LoginPage(){
        driver = DriverSingleton.getDriver();
    }

    public void clickButtonLogInOnStartPage(){
        buttonLogInOnStartPage.click();
    }

    public void clickButtonLogInOnLoginPage(){
        buttonLogInOnLoginPage.click();
    }

    public void inputInvalidEmail(String invalidEmail){
        fieldEnterEmail.sendKeys(invalidEmail);
    }

    public void inputIncorrectPassword(String incorrectPassword){
        fieldEnterPassword.sendKeys(incorrectPassword);
    }

    public void inputCorrectEmail(String correctEmail){
        fieldEnterEmail.sendKeys(correctEmail);
    }

    public void inputCorrectPassword(String correctPassword){
        fieldEnterPassword.sendKeys(correctPassword);
    }

    public void inputIncorrectEmail(String incorrectEmail){
        fieldEnterEmail.sendKeys(incorrectEmail);
    }

    public void inputInvalidPassword(String invalidPassword){
        fieldEnterPassword.sendKeys(invalidPassword);
    }

    public String getTextIncorrectPasswordForThisEmail(){
        return namePasswordRequired.getText();
    }

    public String getTextIncorrectEmailAndCorrectPassword(){
        return incorrectPasswordForThisEmail.getText();
    }

    public String getTextThisEmailIsInvalid(){
        return nameUnderFieldEmailThisEmailInvalid.getText();
    }

    public String getTextEmailRequired(){
        return nameEmailRequired.getText();
    }

    public String getTextPasswordRequired(){
        return namePasswordRequired.getText();
    }

    public String getTextNoAccountForThisEmail(){
        return nameNoAccountForThisEmail.getText();
    }

    public String getTextInvalidPassword(){
        return nameInvalidPassword.getText();
    }

    public String getTexNameHomeOnMainPage(){
        return nameHomeOnMainPage.getText();
    }
}