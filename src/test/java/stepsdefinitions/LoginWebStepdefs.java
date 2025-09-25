package stepsdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.LoginWebStep;

import java.util.List;
import java.util.Map;

public class LoginWebStepdefs {

    LoginWebStep loginWebStep = new LoginWebStep();

    @Given("I navigate to the URL {string}")
    public void iNavigateToUrl(String url) {
        loginWebStep.navigateToHomePage(url);
    }

//    @When("Ingresamos las credenciales")
//    public void enterCredentials(DataTable dataTable) {
//        //Extrame en una List que contiene un Map de tipo String
//        List<Map<String, String>> listaCredenciales = dataTable.asMaps();
//
//        loginWebStep.inputCredentials(listaCredenciales);
//    }

    @When("I enter the credentials {string} and {string}")
    public void enterUsernameAndPassword(String username, String password) {
        System.out.println("[VALIDACIÓN]");
        loginWebStep.inputCredentials(username, password);
    }

    @And("I click the Login button")
    public void selectLoginButton() {
        loginWebStep.clickEnBotonLogin();
    }

    @Then("I should see the title {string} on the home page")
    public void viewTitleOnHomePage(String title) {
        loginWebStep.verifyTitleOnHomePage(title);
    }


}
