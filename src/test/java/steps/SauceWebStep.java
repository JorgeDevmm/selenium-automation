package steps;

import pages.PaginaPrincipal;

public class SauceWebStep {

    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();

    public void navigateToHomePage(String url) {

        paginaPrincipal.openUrl(url);
    }

}
