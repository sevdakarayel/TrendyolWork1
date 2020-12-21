package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//html//body//div[2]//div[2]//div//div[2]//div//div[3]//div//div//ul//li[1]")    // ilk id nerede ise oradan basla, ilk 2tane / sonrakilere tek / icinde neler eklenecekse[] burayaeklenecek.
    public WebElement txtLoginImageButton;


    @FindBy(how = How.XPATH, using = "//*[@id=\"login-email\"]")
    public WebElement txtUserName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"login-password-input\"]")
    public WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//*[@id=\"login-register\"]/div[3]/div[1]/form/button")    // ilk id nerede ise oradan basla, ilk 2tane / sonrakilere tek / icinde neler eklenecekse[] burayaeklenecek.
    public WebElement txtLoginButton;



    public void Login(String username, String password) throws InterruptedException {
        Thread.sleep(2000);
        txtUserName.sendKeys(username);
        txtPassword.sendKeys(password);
    }

    public void ClickLogin() {
        txtLoginButton.click();
    }


}
