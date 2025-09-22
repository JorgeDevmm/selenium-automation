package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import core.DriverFactory;

import java.time.Duration;

public class BasePage {

    /**
     * Declaración de una variable estática ´driver´ de tipo WebDriver
     * Esta variable va a ser compartidad por todas las instancias de BasePage y sus
     */
    protected static WebDriver driver;
    /**
     * Declaración de una variable de instancia de 'wait' de tipo WebDriverWait.
     * Se inicializa inmediatamente con una instancia de WebDriverWait utilizando el 'driver' estático
     * WebDriverWait se usa para poner esperas explicítas en los elementos
     */
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    /**
     * Método static que se carga antes de todo,
     * configuración dinamica aplicando WebDriverManager, esta automaticament driver del navegador
     * Util.setUp retorna un instancia de un objeto WebDriver de la clase Util
     * */
    static {
        //Obtenemos dinamicamente el driver
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();

        //obtenemos manualmente para firefox
        driver = DriverFactory.createFirefoxDriver();

    }

    /**
     * Este es el constructor de BasePage que acepta un objeto WebDriver como argumento
     */
    public BasePage(WebDriver driver) {
        System.out.println("[INFO] We configured the webdriver.");
        BasePage.driver = driver;
    }


    //Método estático para navegar a una URL.
    public static void navigateTo(String url) {
        System.out.println("[INFO] We found the URL.");
        driver.get(url);
    }

    public static void closeBrowser() {
        driver.quit();
    }

    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator) {
        Find(locator).click();
    }

//    public void write(String locator){
//        Find(locator).
//    }
}
