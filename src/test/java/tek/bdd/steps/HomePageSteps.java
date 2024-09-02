package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.pages.HomePage;
import tek.bdd.utility.SeleniumUtility;

public class HomePageSteps extends SeleniumUtility {

    @Then("validate TEK Insurance UI is exist")
    public void validateTekInsuranceUiIsExist() {
        String actualResult = getElementText(HomePage.TEK_INSURANCE_APP);
        Assert.assertEquals("TEK Insurance App", actualResult);
        System.out.println(actualResult);

    }
    @Then("validate Create Primary Account button is exist")
    public void validateCreatePrimaryAccountIsExist() {
        boolean validateCreatePrimaryAccount =isElementEnabled(HomePage.CREATE_PRIMARY_ACCOUNT);
        Assert.assertTrue(validateCreatePrimaryAccount);





    }



}
