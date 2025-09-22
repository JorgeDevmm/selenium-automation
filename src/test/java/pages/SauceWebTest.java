package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SauceWebTest {

    private WebDriver driver;


    @Test
    public void test1() {
        //Navega a la página web
        driver.get("https://www.freerangetesters.com/");
        //Encuentra un elemento utilizando su css selector
        WebElement webElement = driver.findElement(By.cssSelector("header>div>nav>.header__nav--ctas>.header__nav--ctas-entrar"));
        webElement.click();
    }

    @Test
    public void test2() {
        //Navega a la página web
        driver.get("https://www.freerangetesters.com/");
        //Encuentra un elemento utilizando su css selector
        WebElement webElement = driver.findElement(By.cssSelector("header>div>nav>.header__nav--ctas>.header__nav--ctas-entrar"));
        webElement.click();
    }

    @Test
    public void test3() {
        //Navega a la página web
        driver.get("https://www.freerangetesters.com/");
        //Encuentra un elemento utilizando su css selector
        WebElement webElement = driver.findElement(By.cssSelector("header>div>nav>.header__nav--ctas>.header__nav--ctas-entrar"));
        webElement.click();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
