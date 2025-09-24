package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {


    //constructor
    public LoginPage() {
        super(driver);
    }

    //Locator
    private By inputUsername = By.id("user-name");
    private By inputPassword = By.id("password");
    private By btnLogin = By.id("login-button");
    private By screenTitle = By.className("title");


    //Métodos
    public void openUrl(String url) {
        navigateTo(url);
    }

    public void escribirUsername(String username) {
        write(inputUsername, username);
    }

    public void escribirPassword(String password) {
        write(inputPassword, password);
    }

    public void clickBotonLogin() {
        clickElement(btnLogin);
    }

    public void visualizarPaginaPrincipal(String titulo) {
        checkElementOnScreen(screenTitle, titulo);
    }
}
