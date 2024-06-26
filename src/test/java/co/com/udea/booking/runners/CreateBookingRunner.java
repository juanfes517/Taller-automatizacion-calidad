package co.com.udea.booking.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Crear_una_reserva.feature",
        glue = "co.com.udea.booking.stepdefinitions.createBooking",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CreateBookingRunner {
}
