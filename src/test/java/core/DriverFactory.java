package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

    /**
     * Configuración de ruta absoluta de 'rutaDriver','rutaFirefox'
     * Se configura la propiedades del driver de firefox dentro de un elemento FirefoxOptions
     *
     * @return instancia de la interfaz WebDriver
     */
    public static WebDriver createFirefoxDriver() {

        String rutaDriver = "C:\\Trabajo\\Autoaprendizaje\\selenium-automation\\src\\test\\resources\\geckodriver.exe";
        String rutaFirefox = "C:/Users/jmonzonm/AppData/Local/Mozilla Firefox/firefox.exe";

        //Utilizando driver de firefox en duro
        System.setProperty("webdriver.gecko.driver", rutaDriver);
        FirefoxOptions options = new FirefoxOptions();
        //options.addArguments("-private");//Modo incógnito
        options.setBinary(rutaFirefox);

        return new FirefoxDriver(options);//igual al chrome driver
    }
}
