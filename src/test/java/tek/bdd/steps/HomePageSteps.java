package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class HomePageSteps extends SeleniumUtility {

    @Then("validate TEK Insurance UI is exist")
    public void validateTekInsuranceUiIsExist() {
        String actualResult = getElementText(By.className("chakra-heading css-1at26de"));
        Assert.assertEquals("Tek Insurance App", actualResult);
        System.out.println(actualResult);

    }
    @Then("validate Create Primary Account button is exist")
    public void validateCreatePrimaryAccountIsExist() {



    }



}
