package co.com.udea.booking.interactions.createBooking;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.booking.userinterfaces.BookingPage.*;

public class EnterPartialData implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Felipe").into(INPUT_NAME_P1));
        actor.attemptsTo(Enter.theValue("Escobar").into(INPUT_LAST_NAME_P1));
        actor.attemptsTo(Enter.theValue("Juan@udea.edu.co").into(INPUT_EMAIL_P1));
        actor.attemptsTo(Click.on(BUTTON_SUBMIT));
    }

    public static EnterPartialData inInputs(){
        return Tasks.instrumented(EnterPartialData.class);
    }
}
