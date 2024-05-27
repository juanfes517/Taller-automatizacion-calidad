package co.com.udea.booking.stepdefinitions.addPassenger;

import co.com.udea.booking.questions.addPassenger.ValidationNoEmergencyContact;
import co.com.udea.booking.tasks.OpenUrl;
import co.com.udea.booking.tasks.addPassenger.FillBasicInfo;
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

public class NoEmergencyContactStepDefinition {
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

    @Given("un usuario que se encuentra en el formulario de reserva")
    public void estoyEnElSitio(){
        usuario.attemptsTo(OpenUrl.url(Constants.URL_BOOKING));
    }

    @When("solo agregue la informacion basica de dos o mas pasajeros")
    public void aguegarInformacion(){
        usuario.attemptsTo(FillBasicInfo.inputs());
    }

    @Then("puede ver un mensaje de error pidiendo la informacion de contacto")
    public void puedoVerMensajeError(){
        GivenWhenThen.then(usuario).should(GivenWhenThen.seeThat(ValidationNoEmergencyContact.noContact(), Matchers.containsString(Constants.MSJ_NO_CONTACT)));
    }
}
