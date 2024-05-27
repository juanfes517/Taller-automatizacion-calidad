package co.com.udea.booking.stepdefinitions.addPassenger;

import co.com.udea.booking.questions.ValidationBookingSuccessful;
import co.com.udea.booking.tasks.OpenUrl;
import co.com.udea.booking.tasks.ClickConfirm;
import co.com.udea.booking.tasks.addPassenger.FillDataForPassengers;
import co.com.udea.booking.tasks.ClickForm;
import co.com.udea.booking.utils.Constants;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class CreateWithPassengerStepDefinition {
    //Actor
    private final Actor usuario = Actor.named("usuario");

    //driver
    @Managed(driver="chrome", uniqueSession = true)
    public WebDriver theDriver;

    //inicializar
    @Before
    public void init(){
        usuario.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
    }

    @Given("Un usuario que esta en la pagina de inicio del modulo de reservas")
    public void estoyEnElSitio(){
        usuario.attemptsTo(OpenUrl.url(Constants.URL_HOME));
    }

    @When("ingrese al formulario de reservas")
    public void ingresarAlFormulario(){
        usuario.attemptsTo(ClickForm.button());
    }

    @When("ingrese los datos basicos de todos los pasajeros con un contacto de emergencia")
    public void ingresarUnContactoEmergencia(){
        usuario.attemptsTo(FillDataForPassengers.inputs());
    }

    @When("confirme la reserva")
    public void confirmarReserva(){
        usuario.attemptsTo(ClickConfirm.buttonConfirm());
    }

    @Then("puede ver un mensaje de creacion exitosa")
    public void puedoVerMensajeError(){
        GivenWhenThen.then(usuario).should(GivenWhenThen.seeThat(ValidationBookingSuccessful.message(), Matchers.containsString(Constants.MSJ_SUCCESSFUL)));
    }
}
