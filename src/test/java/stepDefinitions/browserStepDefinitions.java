package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.ObiletPage;
import utils.BrowserDriver;

public class browserStepDefinitions {
    Actions actions=new Actions(BrowserDriver.getBrowserDriver());
    ObiletPage page=new ObiletPage();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String url) {

    }

}