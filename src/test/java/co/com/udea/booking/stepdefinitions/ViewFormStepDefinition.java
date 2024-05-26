package co.com.udea.booking.stepdefinitions;

import co.com.udea.booking.tasks.viewForm.ClickOn;
import co.com.udea.booking.tasks.OpenThe;
import co.com.udea.booking.utils.Constants;
import co.com.udea.booking.questions.ValidationViewForm;
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

public class ViewFormStepDefinition {

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

    @Given("un usuario que se encuentra en la pagina de inicio del modulo de reservas")
    public void estoyEnElSitio(){
        usuario.attemptsTo(OpenThe.url(Constants.URL_HOME));
    }

    @When("presione el boton relizar reserva")
    public void clickEnReservar(){
        usuario.attemptsTo(ClickOn.button());
    }

    @Then("puede visualizar un formulario con todos los datos requeridos.")
    public void puedoVerElFormulario(){
        GivenWhenThen.then(usuario).should(GivenWhenThen.seeThat(ValidationViewForm.titleForm(), Matchers.containsString(Constants.TITLE_FORM)));
    }
}