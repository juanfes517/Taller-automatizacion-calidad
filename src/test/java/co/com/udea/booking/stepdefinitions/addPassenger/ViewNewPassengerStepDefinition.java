package co.com.udea.booking.stepdefinitions.addPassenger;

import co.com.udea.booking.questions.addPassenger.ValidationViewNewPassenger;
import co.com.udea.booking.tasks.OpenUrl;
import co.com.udea.booking.tasks.addPassenger.ClickNewPassenger;
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

public class ViewNewPassengerStepDefinition {

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

    @Given("un usuario que esta en el formulario de reservas")
    public void estoyEnElSitio(){
        usuario.attemptsTo(OpenUrl.url(Constants.URL_BOOKING));
    }

    @When("agregue un nuevo pasajero")
    public void clickEnReservar(){
        usuario.attemptsTo(ClickNewPassenger.newPassenger());
    }

    @Then("puede ver un formulario para el nuevo pasajero")
    public void puedoVerElFormulario(){
        GivenWhenThen.then(usuario).should(GivenWhenThen.seeThat(ValidationViewNewPassenger.titleNewPassenger(), Matchers.containsString(Constants.TITLE_NEW_PASSENGER)));
    }
}
