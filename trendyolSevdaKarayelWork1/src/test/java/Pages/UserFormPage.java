package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UserFormPage {
    public UserFormPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"logged-in-container\"]")
    public WebElement txtUserFormTitle;

    public void CheckUserLoggedIn() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue("Test Passed.", txtUserFormTitle.isDisplayed());
    }
}
