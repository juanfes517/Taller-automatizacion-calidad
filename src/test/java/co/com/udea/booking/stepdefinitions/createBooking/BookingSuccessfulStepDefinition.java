package co.com.udea.booking.stepdefinitions.createBooking;

import co.com.udea.booking.questions.ValidationBookingSuccessful;
import co.com.udea.booking.tasks.OpenUrl;
import co.com.udea.booking.tasks.bookingSuccessful.ClickConfirm;
import co.com.udea.booking.tasks.formDataValid.FillAllFormData;
import co.com.udea.booking.tasks.viewForm.ClickForm;
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

public class BookingSuccessfulStepDefinition {

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

    @Given("un usuario que se encuentra en la pagina de inicio")
    public void estoyEnElSitio(){
        usuario.attemptsTo(OpenUrl.url(Constants.URL_HOME));
    }

    @When("ingrese al formulario para realizar un reserva")
    public void ingresarAlFormulario(){
        usuario.attemptsTo(ClickForm.button());
    }

    @When("llene todos los campos requeridos")
    public void llenarFormulario() {
        usuario.attemptsTo(FillAllFormData.inputs());
    }

    @When("confirme su reserva")
    public void confirmarReserva(){
        usuario.attemptsTo(ClickConfirm.buttonConfirm());
    }

    @Then("puede ver un mensaje de exito")
    public void verMensaje() {
        GivenWhenThen.then(usuario).should(GivenWhenThen.seeThat(ValidationBookingSuccessful.message(), Matchers.containsString(Constants.MSJ_SUCCESSFUL)));
    }
}
