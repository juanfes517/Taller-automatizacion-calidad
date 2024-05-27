package co.com.udea.booking.interactions.addPassenger;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.booking.userinterfaces.BookingPage.*;

public class EnterBasicData implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_NEW_PASSENGER));

        actor.attemptsTo(Enter.theValue("Felipe").into(INPUT_NAME_P1));
        actor.attemptsTo(Enter.theValue("Escobar").into(INPUT_LAST_NAME_P1));
        actor.attemptsTo(Enter.theValue("Felipe@udea.edu.co").into(INPUT_EMAIL_P1));
        actor.attemptsTo(Enter.theValue("123456789").into(INPUT_PHONE_P1));
        actor.attemptsTo(Enter.theValue("Medellin, Colombia").into(INPUT_ADDRESS_P1));

        actor.attemptsTo(Enter.theValue("Juan").into(INPUT_NAME_P2));
        actor.attemptsTo(Enter.theValue("Rendon").into(INPUT_LAST_NAME_P2));
        actor.attemptsTo(Enter.theValue("Juan@udea.edu.co").into(INPUT_EMAIL_P2));
        actor.attemptsTo(Enter.theValue("123456789").into(INPUT_PHONE_P2));
        actor.attemptsTo(Enter.theValue("Medellin, Colombia").into(INPUT_ADDRESS_P2));

        actor.attemptsTo(Click.on(BUTTON_SUBMIT));
    }

    public static EnterBasicData inBasicInputs(){
        return Tasks.instrumented(EnterBasicData.class);
    }
}
