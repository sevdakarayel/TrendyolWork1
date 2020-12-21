package Steps;

import Base.BaseUtils;
import Pages.LoginPage;
import Pages.UserFormPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;


import java.util.ArrayList;
import java.util.List;

public class LoginSteps extends BaseUtils {

    private BaseUtils base;

    public LoginSteps(BaseUtils base){
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
        base.Driver.navigate().to("https://www.trendyol.com/");
        System.out.println("First Step worked");
    }

    @And("^I click login button$")
    public void iClickLoginButton() {
        LoginPage loginPage = new LoginPage(base.Driver);
        loginPage.ClickLogin();

    }

    @Then("^I should see the user form login$")
    public void iShouldSeeTheUserFormLogin() throws InterruptedException {
        UserFormPage userFormPage = new UserFormPage(base.Driver);

        userFormPage.CheckUserLoggedIn();
    }



    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {

        LoginPage loginPage = new LoginPage(base.Driver);
        loginPage.Login(username, password);

    }

    @And("^I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws InterruptedException {
        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);

        LoginPage loginPage = new LoginPage(base.Driver);

        for(User user : users){
           loginPage.Login(user.username, user.password);      }
    }


    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String username, String password) {
        System.out.println("The value is " + username);
        System.out.println("The value is " + password);

        base.Driver.findElement(By.xpath("//*[@id=\"login-email\"]")).sendKeys(username);
        base.Driver.findElement(By.xpath("//*[@id=\"login-password-input\"]")).sendKeys(password);

    }

    @And("^I click loginImage button$")
    public void iClickLoginImageButton() {

        base.Driver.findElement(By.xpath("//*[@id=\"accountBtn\"]")).click();


    }

    public class User {
        public String username;
        public String password;

        public User(String name, String pass){
            username = name;
            password = pass;
        }

    }
}

