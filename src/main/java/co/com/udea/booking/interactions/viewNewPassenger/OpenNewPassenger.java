package co.com.udea.booking.interactions.viewNewPassenger;

import co.com.udea.booking.interactions.viewForm.OpenForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.booking.userinterfaces.BookingPage.BUTTON_NEW_PASSENGER;

public class OpenNewPassenger implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_NEW_PASSENGER));
    }

    public static OpenNewPassenger inButton(){
        return Tasks.instrumented(OpenNewPassenger.class);
    }
}
