package Steps;

import Base.BaseUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtils {

    private BaseUtils base;

    public Hook(BaseUtils base){
        this.base = base;
    }

    @Before     //run a baslanadan once pre requisite run i.
    public void TestInitialize(){
        // Passing a dummy webdriver
        System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
        base.Driver = new ChromeDriver();

        base.Driver.navigate().to("https://www.trendyol.com/");
        base.Driver.manage().window().maximize();
        System.out.println("Browser Opened");
    }

    @After      //run a bittikten sonra alinmasi kapatilmasi gibi durumlarin eklenmesi.
    public void TestTeardown(Scenario scenario){
        if(scenario.isFailed()){
            try {
                byte[] screenshot = ((TakesScreenshot) base.Driver).getScreenshotAs(OutputType.BYTES);
                String testName = scenario.getName();
                scenario.embed(screenshot, "image/png");
                scenario.write(testName);
            } catch (WebDriverException wde) {
                System.err.println(wde.getMessage());
            } catch (ClassCastException cce) {
                cce.printStackTrace();
            }
        } else {
            base.Driver.quit();
        }
    }
}
