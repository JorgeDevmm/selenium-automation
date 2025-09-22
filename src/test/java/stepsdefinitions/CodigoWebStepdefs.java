package stepsdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import steps.CodigoWebStep;


public class CodigoWebStepdefs {

    CodigoWebStep codigoWebStep = new CodigoWebStep();

    /**
     * Obtener de la DataTable table, la fila de la posición indicada
     */
    @Given("I navigate to url")
    public void iNavigateToUrl(DataTable table) {
        String url = table.asMaps(String.class, String.class).get(0).get("url");
        codigoWebStep.navigateToHomePage(url);
    }
}
