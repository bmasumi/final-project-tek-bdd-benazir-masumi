package tek.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

    @Given("Navigate to home page")
    public void NavigateToHomePage () {
        System.out.println("navigate to the home page");
    }

    @When("the home page is loaded")
    public void TheHomePageIsLoaded () {
        System.out.println("The home page is loaded");
    }

    @Then("the title is TEK Insurance UI")
    public void TheTitleIsTEKInsuranceUI () {
        System.out.println("the title is TEK Insurance UI");
    }

    @And("the create Primary Account button exists")
    public void TheCreatePrimaryAccountButtonExists () {
        System.out.println("the create primary account button exists");
    }

}
