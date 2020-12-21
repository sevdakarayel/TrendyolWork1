package Steps;

import Base.BaseUtils;
import cucumber.api.java.en.Then;

public class UserFormSteps extends BaseUtils{
    private BaseUtils base;

    public UserFormSteps(BaseUtils base){
        this.base = base;
    }

    @Then("^Check Title is Required$")
    public void checkTitleIsRequired() {

    }
}
