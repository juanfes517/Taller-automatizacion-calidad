package co.com.udea.booking.stepdefinitions.createBooking;

import co.com.udea.booking.questions.ValidationFormDataError;
import co.com.udea.booking.tasks.OpenUrl;
import co.com.udea.booking.tasks.formDataError.FillPartialFormData;
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

public class FormDataErrorStepDefinition {
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

    @Given("un usuario del sistema que se encuentra en el formulario de reservas")
    public void estoyEnElSitio() {
        usuario.attemptsTo(OpenUrl.url(Constants.URL_BOOKING));
    }

    @When("ingresa todos los datos requeridos de forma incorrecta")
    public void ingresarDatos() {
        usuario.attemptsTo(FillPartialFormData.inputs());
    }

    @Then("puede visualizar un mensaje de error")
    public void mensajeDeError(){
        GivenWhenThen.then(usuario).should(GivenWhenThen.seeThat(ValidationFormDataError.errorMessage(), Matchers.containsString(Constants.ERROR_EMPTY_DATA)));
    }
}
