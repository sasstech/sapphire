package cucumber.runtime.java.spring;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PlacingAnAddStepDef extends AbstractWebDriverTest{


    @When("I access the site to place the Ad to rent a room")
    public void access_site(){
        getDriver().navigate().to("http://localhost:8081");

    }

    @Then("I should be shown the following options")
    public void view_options(DataTable options){
        String rentARoom  = (String) options.asList(String.class).get(0);
        String wantARoom  = (String) options.asList(String.class).get(1);

        Assert.fail();

    }

}
