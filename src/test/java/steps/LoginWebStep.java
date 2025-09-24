package steps;

import pages.LoginPage;

import java.util.List;
import java.util.Map;

public class LoginWebStep {

    LoginPage loginPage = new LoginPage();

    public void navigateToHomePage(String url) {
        loginPage.openUrl(url);
    }

    public void inputCredentials(List<Map<String, String>> listaCredenciales) {

        for (Map<String, String> fila : listaCredenciales) {
            String username = fila.get("Username");
            String password = fila.get("Password");

            loginPage.typeUsername(username);
            loginPage.typePassword(password);
        }

    }

    public void clickEnBotonLogin() {
        loginPage.clickBotonLogin();
    }

    public void visualizacionDelTituloDeLaPaginaPrincipal(String titulo){
        loginPage.visualizarPaginaPrincipal(titulo);
    }


}
