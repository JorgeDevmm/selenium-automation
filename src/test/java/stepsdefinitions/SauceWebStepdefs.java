package stepsdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import steps.SauceWebStep;


public class SauceWebStepdefs {

    SauceWebStep sauceWebStep = new SauceWebStep();

    /**
     * Obtener de la DataTable table, la fila de la posición indicada
     */
    @Given("I navigate to url")
    public void iNavigateToUrl(DataTable table) {
        String url = table.asMaps(String.class, String.class).get(0).get("url");
        sauceWebStep.navigateToHomePage(url);
    }


}
