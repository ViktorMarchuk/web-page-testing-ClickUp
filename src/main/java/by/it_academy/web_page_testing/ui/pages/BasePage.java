package by.it_academy.web_page_testing.ui.pages;

import by.it_academy.web_page_testing.ui.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage{
    public WebDriver driver;
    public final String BASE_URL = "https://clickup.com/";

    public BasePage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void openPage(String url){
        driver = DriverSingleton.getDriver();
        driver.navigate().to(url);
    }

    public void getExplicitlyWaiter(WebElement element, int waitTime){
        WebElement result = new WebDriverWait(driver, Duration.ofSeconds(waitTime))
                .until(ExpectedConditions.visibilityOf(element));
        System.out.println(result);
    }
}
