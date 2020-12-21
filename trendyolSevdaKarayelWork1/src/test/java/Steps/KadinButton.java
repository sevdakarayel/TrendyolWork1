package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class KadinButton {
    public KadinButton(WebDriver driver) {
        PageFactory.initElements(driver, this);



    }



    public void ClickKadinButton() {

        WebElement txtKadinButton = null;
        txtKadinButton.click();

    }


}
