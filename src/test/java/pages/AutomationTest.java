package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomationTest {
    private String rutaDriver = "C:\\Trabajo\\Autoaprendizaje\\selenium-automation\\src\\test\\resources\\geckodriver.exe";
    private String rutaFirefox = "C:/Users/jmonzonm/AppData/Local/Mozilla Firefox/firefox.exe";

    private WebDriver driver;

    public WebDriver getDriver() {
        System.setProperty("webdriver.gecko.driver", rutaDriver);
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary(rutaFirefox);

        return new FirefoxDriver(options);//igual al chrome driver
    }

//    @BeforeMethod
//    public void setUp() {
//        //Inicializa el WebDriver para firefox -> cambiar chromedriver
//        WebDriverManager.firefoxdriver().setup();//obtiene el driver
//        driver = new FirefoxDriver();//Instancio el driver
//    }

    @BeforeMethod
    public void setUp() {
        driver = getDriver();
    }

    @Test
    public void ingresarPagina() {

        driver.get("https://www.aluracursos.com/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
