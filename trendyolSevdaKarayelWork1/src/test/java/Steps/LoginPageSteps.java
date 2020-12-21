package Steps;

import Base.BaseUtils;
import Pages.LoginPage;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;

public class LoginPageSteps  extends BaseUtils {
    private BaseUtils base;

    public LoginPageSteps(BaseUtils base){
        this.base = base;
    }


    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\" in Login page$")
    public void iEnterTheUsernameAsAndPasswordAsInLoginPage(String username, String password) throws Throwable {
        LoginPage loginPage = new LoginPage(base.Driver);

        loginPage.Login(username, password);
    }


    @And("^I click login button in Login page$")
    public void iClickLoginButtonInLoginPage() {
        LoginPage loginPage = new LoginPage(base.Driver);

        loginPage.ClickLogin();

    }




}
