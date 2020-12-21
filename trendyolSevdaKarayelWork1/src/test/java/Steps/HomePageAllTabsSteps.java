package Steps;

import Base.BaseUtils;
import cucumber.api.java.en.And;
import org.w3c.dom.html.HTMLInputElement;

public class HomePageAllTabsSteps {

    private BaseUtils base;

    public HomePageAllTabsSteps(BaseUtils base) {
        this.base = base;
    }


    @And("^I click KADIN Button$")
    public void iClickKADINButton() {
        KadinButton kadinbutton = new KadinButton(base.Driver);
        kadinbutton.ClickKadinButton();
    }










}
