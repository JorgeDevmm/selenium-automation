package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{


    public LoginPage() {
        super(driver);
    }

    //Método para navegar a URL
    public void openUrl(String url) {
        navigateTo(url);
    }
}
