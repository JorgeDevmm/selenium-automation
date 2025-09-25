package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", //Directorio de nuestros archivos .features
        glue = "stepsdefinitions",                           //Paquete donde tenemos nuestras clases definiendo los steps
        tags = "@Navigation",                                       //Tag que quieres ejecutar
        plugin = {"pretty", "html:target/cucumber-reports"})//Reportes

public class Runner {

    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }

}
