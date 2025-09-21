package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Util {

    public static WebDriver setUp() {

        String rutaDriver = "C:\\Trabajo\\Autoaprendizaje\\selenium-automation\\src\\test\\resources\\geckodriver.exe";
        String rutaFirefox = "C:/Users/jmonzonm/AppData/Local/Mozilla Firefox/firefox.exe";

        //Utilizando driver de firefox en duro
        System.setProperty("webdriver.gecko.driver", rutaDriver);
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary(rutaFirefox);

        return new FirefoxDriver(options);//igual al chrome driver
    }
}
