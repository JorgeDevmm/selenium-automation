package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import core.DriverFactory;

import java.time.Duration;
import java.util.List;

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

    /**
     * Navegación a una URL especifica
     */
    public static void navigateTo(String url) {
        System.out.println("[INFO] We found the URL.");
        driver.get(url);
    }

    /**
     * Cerrar el driver
     */
    public static void closeBrowser() {
        driver.quit();
    }

    /**
     * espera explicita de la presencia de un WebElment
     */
    private WebElement Find(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void checkElementOnScreen(By locator, String titulo){
        if(Find(locator).getText().equals(titulo)){
            System.out.println("[Info] la visualización del elemento coincide con el " + titulo);
        }
    }

    /**
     * Click a un elemento
     */
    public void clickElement(By locator) {
        Find(locator).click();
    }

    /**
     * Escritura en campos
     */
    public void write(By locator, String keysToSend) {
        Find(locator).clear();//limpieza previa al campo
        Find(locator).sendKeys(keysToSend);
    }

    /**
     * Buscar en Select por valor
     */
    public void selectFromDropdownByValue(By locator, String value) {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(value);
    }

    /**
     * Buscar en Select por Index
     */
    public void selectFromDropdownByIndex(By locator, Integer index) {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByIndex(index);
    }

    /**
     * calcula la cantidad de elementos del select, obteniendolo con getOptions
     */
    public int dropdownSize(By locator) {
        Select dropdown = new Select(Find(locator));
        List<WebElement> dropdownOptions = dropdown.getOptions();

        return dropdownOptions.size();
    }

}
