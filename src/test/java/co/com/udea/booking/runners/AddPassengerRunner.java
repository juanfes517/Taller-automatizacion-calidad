package co.com.udea.booking.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Agregar_pasajero.feature",
        glue = "co.com.udea.booking.stepdefinitions.addPassenger",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AddPassengerRunner {
}
