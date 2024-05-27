package co.com.udea.booking.interactions.createBooking;

import co.com.udea.booking.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.booking.userinterfaces.BookingPage.*;

public class EnterAllData implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(Constants.NAME_1).into(INPUT_NAME_P1));
        actor.attemptsTo(Enter.theValue(Constants.LAST_NAME_1).into(INPUT_LAST_NAME_P1));
        actor.attemptsTo(Enter.theValue(Constants.EMAIL_1).into(INPUT_EMAIL_P1));
        actor.attemptsTo(Enter.theValue(Constants.PHONE).into(INPUT_PHONE_P1));
        actor.attemptsTo(Enter.theValue(Constants.ADDRESS).into(INPUT_ADDRESS_P1));
        actor.attemptsTo(Enter.theValue(Constants.NAME_2).into(INPUT_EMERGENCY_NAME_P1));
        actor.attemptsTo(Enter.theValue(Constants.LAST_NAME_2).into(INPUT_EMERGENCY_LAST_NAME_P1));
        actor.attemptsTo(Enter.theValue(Constants.PHONE).into(INPUT_EMERGENCY_PHONE_P1));
        actor.attemptsTo(Click.on(BUTTON_SUBMIT));
    }

    public static EnterAllData inAllInputs(){
        return Tasks.instrumented(EnterAllData.class);
    }
}
