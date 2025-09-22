package pages;


public class PaginaPrincipal extends BasePage {

    /**
     * Locator
     */


    public PaginaPrincipal() {
        super(driver);
    }

    //Método para navegar a URL
    public void openUrl(String url) {
        navigateTo(url);
    }
}
