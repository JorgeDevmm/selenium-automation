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

    @Given("Navegamos a la url {string}")
    public void iNavigateToUrl(String url) {
        loginWebStep.navigateToHomePage(url);
    }

    @When("Ingresamos las credenciales")
    public void enterCredentials(DataTable dataTable) {
        //Extrame en una List que contiene un Map de tipo String
        List<Map<String, String>> listaCredenciales = dataTable.asMaps();

        loginWebStep.inputCredentials(listaCredenciales);
    }

    @And("Seleccionamos el botón Login")
    public void seleccionamosElBotónLogin() {
        loginWebStep.clickEnBotonLogin();
    }

    @Then("Visualizamos el título {string} en la página principal")
    public void visualizamosElTituloEnLaPaginaPrincipal(String titulo) {
        loginWebStep.visualizacionDelTituloDeLaPaginaPrincipal(titulo);
    }
}
