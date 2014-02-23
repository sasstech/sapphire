package cucumber.runtime.java.spring;

import cucumber.api.java.en.Given;

public class PlacingAnAddStepDef {

    @Given("I access the site to place the Ad")
    public void access_site(){
        System.out.println("Inside access_site...");
    }
}
