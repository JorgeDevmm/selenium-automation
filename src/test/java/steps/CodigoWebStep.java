package steps;

import pages.PaginaPrincipal;

public class CodigoWebStep {

    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();

    public void navigateToHomePage(String url) {

        paginaPrincipal.openUrl(url);
    }

}
