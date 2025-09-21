package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Util;

import java.time.Duration;

public class BasePage extends Util {

    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));//Espera explicita

    static {
        //Obtenemos dinamicamente el driver
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();

        //obtenemos manualmente para firefox
        driver = Util.setUp();

    }

    public BasePage(WebDriver driver) {
        System.out.println("[INFO] We configured the webdriver.");
        BasePage.driver = driver;
    }


    public static void navigateTo(String url) {
        System.out.println("[INFO] We found the URL.");
        driver.get(url);
    }
}
