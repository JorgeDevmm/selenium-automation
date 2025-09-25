package stepsdefinitions;

import io.cucumber.java.en.Given;
import steps.LoginWebStep;

public class NavigationBarMyStepdefs {


    LoginWebStep loginWebStep = new LoginWebStep();

    @Given("user is already logged in with {string} and {string} in {string}")
    public void theUserIsLoggedIN(String username, String password, String url) {
        loginWebStep.navigateToHomePage(url);

        loginWebStep.inputCredentials(username, password);

        loginWebStep.clickEnBotonLogin();

    }


}
